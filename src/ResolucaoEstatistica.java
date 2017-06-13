
import java.util.ArrayList;
import java.util.Collections;

public class ResolucaoEstatistica {

    int numeroMaximo = 0;
    int numeroMinimo = 0;
    int valorClasse = 0;
    int valorAmplitude = 0;
    double ValorTotalFrequencia = 0;
    int matrizIntervalo[][];
    ArrayList<Integer> Frequencia;
    ArrayList PontoMedio;
    ArrayList<Double> FrRelativa;
    ArrayList<Integer> FrAcumulada;
    ArrayList<Double> FrRelativaAcumulada;
    ArrayList<Double> MediaIntervalos;
    ArrayList<Integer> numeros;

    public ArrayList<Integer> retornaValoresSeparados(String matrizNumeros) {
        String[] separadorNumeros = matrizNumeros.split(" ");
        numeros = new ArrayList<>();
        for (String n : separadorNumeros) {
            numeros.add(Integer.parseInt(n));
        }
        return numeros;
    }

    public int calcularValorClasse(ArrayList<Integer> numeros) {
        double classe = (3.3 * (Math.log10(numeros.size()))) + 1;
        int classeArredondada = (int) Math.ceil(classe);
        valorClasse = classeArredondada;
        return classeArredondada;
    }

    public int calcularAmplitude(ArrayList<Integer> numeros, int classe) {
        numeroMaximo = Collections.max(numeros);
        numeroMinimo = Collections.min(numeros);
        int amplitude = (int) ((numeroMaximo - numeroMinimo) / classe);
        // Só pra pegar o acima sempre.
        amplitude += 1;
        valorAmplitude = amplitude;
        return amplitude;
    }

    public int[][] retornarIntervalos(boolean verifica) {

        if (verifica) {

            matrizIntervalo = new int[valorClasse][2];
            int auxiliar = 0;
            int indice = 0;

            for (int i = 0; i < valorClasse; i++) {

                indice = 0;

                for (int j = 0; j < 2; j++) {

                    indice += 1;

                    if (indice == 2) {

                        numeroMinimo += valorAmplitude - 1;

                    } else {
                        if (indice == 1) {

                            if (i != 0) {

                                numeroMinimo += 1;

                            }

                        }

                    }

                    matrizIntervalo[i][j] = numeroMinimo;

                }

            }

        } else {

            int percorrer = numeros.size() / 2;

            matrizIntervalo = new int[percorrer][2];

            int indice = 0;

            for (int j = 0; j < percorrer; j++) {
                for (int k = 0; k < 2; k++) {

                    matrizIntervalo[j][k] = numeros.get(indice);

                    indice += 1;
                }
            }

        }

        return matrizIntervalo;

    }

    public ArrayList<Integer> calcularFrequencia(ArrayList<Integer> numeros, boolean opcao, String frequenciaPronta) {

        if (opcao) {

            int contador = 0;

            Frequencia = new ArrayList<>();

            for (int j = 0; j < matrizIntervalo.length; j++) {

                for (int i = 0; i < numeros.size(); i++) {

                    // Intervalos sempre é somente 2 colunas então não tem problema de pegar fixo    
                    if (numeros.get(i) >= matrizIntervalo[j][0] && numeros.get(i) <= matrizIntervalo[j][1]) {

                        contador += 1;
                    }
                }

                Frequencia.add(contador);
                ValorTotalFrequencia += contador;
                contador = 0;

            }
        } else {

            Frequencia = retornaValoresSeparados(frequenciaPronta);

            for (int i = 0; i < Frequencia.size(); i++) {

                ValorTotalFrequencia += Frequencia.get(i);

            }

        }

        return Frequencia;
    }

    public ArrayList<Double> CalcularPontoMedio() {

        PontoMedio = new ArrayList<>();

        double pontoMedio;

        for (int i = 0; i < matrizIntervalo.length; i++) {

            pontoMedio = (matrizIntervalo[i][0] + matrizIntervalo[i][1]) / 2.0;

            PontoMedio.add(pontoMedio);

        }

        return PontoMedio;
    }

    public ArrayList<Double> CalcularFrequenciaRelativa() {

        FrRelativa = new ArrayList<>();

        double VlrFrRelativa = 0;

        for (int i = 0; i < Frequencia.size(); i++) {

            VlrFrRelativa = Frequencia.get(i) / ValorTotalFrequencia;

            FrRelativa.add(VlrFrRelativa);
        }

        return FrRelativa;

    }

    public ArrayList<Integer> CalcularFrequenciaAcumulada() {

        FrAcumulada = new ArrayList<Integer>();

        int Aux = 0;

        for (int i = 0; i < Frequencia.size(); i++) {

            Aux += Frequencia.get(i);

            FrAcumulada.add(Aux);

        }

        return FrAcumulada;
    }

    public ArrayList<Double> CalcularFrequenciaRelativaAcumulada() {

        FrRelativaAcumulada = new ArrayList<Double>();

        double Aux = 0;

        for (int i = 0; i < FrRelativa.size(); i++) {

            Aux += FrRelativa.get(i);

            FrRelativaAcumulada.add(Aux);
        }

        return FrRelativaAcumulada;
    }

    public double calcularDesvioPadrao() {
        double media = 0;
        for (int i = 0; i < matrizIntervalo.length; i++) {
            media += Double.valueOf(PontoMedio.get(i).toString()) * Frequencia.get(i);
        }
        media /= numeros.size();

        double variancia = 0;
        for (int i = 0; i < matrizIntervalo.length; i++) {
            variancia += Math.pow(Double.valueOf(PontoMedio.get(i).toString()) - media, 2);
        }
        variancia /= numeros.size() - 1;

        return Math.sqrt(variancia);
    }

    public double calcularDesvioMedio() {

        MediaIntervalos = new ArrayList<>();
        double somaIntervalo = 0;

        for (int i = 0; i < matrizIntervalo.length; i++) {
            for (int j = 0; j < matrizIntervalo[i].length; j++) {

                somaIntervalo += matrizIntervalo[i][j];

            }

            MediaIntervalos.add(somaIntervalo / 2);
            somaIntervalo = 0;

        }
        return desvioMedio();
    }

    public double CalculaMediaTotal() {

        double Media = 0;
        double MediaFinal = 0;

        for (int i = 0; i < MediaIntervalos.size(); i++) {

            Media += MediaIntervalos.get(i) * Frequencia.get(i);

        }

        return MediaFinal = Media / ValorTotalFrequencia;

    }

    public double desvioPadrao() {

        double TotalAbsoluto = 0;
        double MediaIntervalo = CalculaMediaTotal();

        for (int i = 0; i < MediaIntervalos.size(); i++) {

            TotalAbsoluto += Math.abs((MediaIntervalos.get(i) - MediaIntervalo) * Frequencia.get(i));

        }

        return TotalAbsoluto / ValorTotalFrequencia;
    }

    public double desvioMedio() {

        double TotalAbsoluto = 0;
        double MediaIntervalo = CalculaMediaTotal();

        for (int i = 0; i < MediaIntervalos.size(); i++) {

            TotalAbsoluto += Math.abs((MediaIntervalos.get(i) - MediaIntervalo) * Frequencia.get(i));

        }

        return TotalAbsoluto / ValorTotalFrequencia;
    }

    public void imprimeTudo() {

        System.out.println("Intervalos");
        for (int i = 0; i < matrizIntervalo.length; i++) {

            for (int j = 0; j < matrizIntervalo[j].length; j++) {

                System.out.print("|" + matrizIntervalo[i][j] + "\t");
            }

            System.out.println("");
        }

        System.out.println("/n");

        System.out.println("Frequencia");
        for (int i = 0; i < Frequencia.size(); i++) {

            System.out.println("|" + Frequencia.get(i));

        }

        System.out.println("\n");

        System.out.println("Ponto Medio");
        for (int i = 0; i < PontoMedio.size(); i++) {

            System.out.println("|" + PontoMedio.get(i));

        }

        System.out.println("\n");
        System.out.println("Frequencia Relativa");

        for (int i = 0; i < FrRelativa.size(); i++) {

            System.out.println("|" + FrRelativa.get(i));

        }

        System.out.println("\n");
        System.out.println("Frequencia Acumulada");

        for (int i = 0; i < FrAcumulada.size(); i++) {

            System.out.println("|" + FrAcumulada.get(i));

        }

        System.out.println("\n");
        System.out.println("Frequência Relativa Acumulada");

        for (int i = 0; i < FrRelativaAcumulada.size(); i++) {

            System.out.println("|" + FrRelativaAcumulada.get(i));

        }

    }
}
