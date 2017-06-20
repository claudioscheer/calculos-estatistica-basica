package calculos;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class CalculosEstatisticos {

    public List<Double> numeros;
    public double quantidadeElementos;
    public int quantidadeDeClasses;
    public int amplitudeDaClasse;
    public double[][] intervalos;
    public int[] frequencias;
    public double[] pontosMedio;
    public double[] frequenciasRelativa;
    public double[] frequenciaAcumulada;
    public double[] frequenciaRelativaAcumulada;
    public double media;
    public double variancia;
    public double desvioPadrao;

    public CalculosEstatisticos(List<Double> numeros) {
        this.numeros = numeros;
        calcularTudo(false);
    }

    public CalculosEstatisticos(double[][] intervalos, int[] frequencias) throws Exception {
        if (intervalos.length != frequencias.length) {
            throw new Exception("A quantidade de intervalos não corresponde a quantidade de frequências.");
        }
        this.intervalos = intervalos;
        this.frequencias = frequencias;
        calcularTudo(true);
    }

    private void calcularTudo(boolean intervalosProntos) {
        getIntervalos(intervalosProntos);
        if (!intervalosProntos) {
            getFrequencias();
        }
        getPontosMedio();
        getFrequenciasRelativa();
        getFrequenciaAcumulada();
        getFrequenciaRelativaAcumulada();
        getMedia();
        getVariancia();
        getDesvioPadrao();
    }

    private double[][] getIntervalos(boolean intervalosProntos) {
        if (intervalosProntos) {
            quantidadeElementos = IntStream.of(frequencias).sum();
            quantidadeDeClasses = intervalos.length;
        } else {
            quantidadeElementos = (double) numeros.size();
            quantidadeDeClasses = (int) (1 + (3.3 * Math.log10(quantidadeElementos)));
        }
        if (intervalosProntos) {
            amplitudeDaClasse = (int) (intervalos[0][1] - intervalos[0][0]);
        } else {
            double menorValor = Collections.min(numeros);
            double maiorValor = Collections.max(numeros);
            amplitudeDaClasse = (int) Math.ceil((maiorValor - menorValor) / quantidadeDeClasses);

            intervalos = new double[quantidadeDeClasses][2];
            double valorMinimo = menorValor;
            for (int i = 0; i < quantidadeDeClasses; i++) {
                intervalos[i][0] = valorMinimo;
                valorMinimo += amplitudeDaClasse;
                intervalos[i][1] = valorMinimo;
            }
        }

        return intervalos;
    }

    public int[] getFrequencias() {
        frequencias = new int[quantidadeDeClasses];
        for (int i = 0; i < quantidadeDeClasses; i++) {
            int frequencia = 0;
            for (Double numero : numeros) {
                if (i == quantidadeDeClasses - 1) {
                    if (numero >= intervalos[i][0] && numero <= intervalos[i][1]) {
                        frequencia++;
                    }
                } else if (numero >= intervalos[i][0] && numero < intervalos[i][1]) {
                    frequencia++;
                }
            }
            this.frequencias[i] = frequencia;
        }

        return frequencias;
    }

    public double[] getPontosMedio() {
        pontosMedio = new double[quantidadeDeClasses];
        for (int i = 0; i < quantidadeDeClasses; i++) {
            pontosMedio[i] = (intervalos[i][0] + intervalos[i][1]) / 2d;
        }

        return pontosMedio;
    }

    public double[] getFrequenciasRelativa() {
        frequenciasRelativa = new double[quantidadeDeClasses];
        for (int i = 0; i < quantidadeDeClasses; i++) {
            frequenciasRelativa[i] = frequencias[i] / quantidadeElementos;
        }

        return frequenciasRelativa;
    }

    public double[] getFrequenciaAcumulada() {
        frequenciaAcumulada = new double[quantidadeDeClasses];
        int valorAcumulado = 0;
        for (int i = 0; i < quantidadeDeClasses; i++) {
            valorAcumulado += frequencias[i];
            frequenciaAcumulada[i] = valorAcumulado;
        }

        return frequenciaAcumulada;
    }

    public double[] getFrequenciaRelativaAcumulada() {
        frequenciaRelativaAcumulada = new double[quantidadeDeClasses];
        double valorAcumulado = 0;
        for (int i = 0; i < quantidadeDeClasses; i++) {
            valorAcumulado += frequenciasRelativa[i];
            frequenciaRelativaAcumulada[i] = valorAcumulado;
        }

        return frequenciaRelativaAcumulada;
    }

    public double getMedia() {
        double somaMedia = 0;
        for (int i = 0; i < quantidadeDeClasses; i++) {
            somaMedia += pontosMedio[i] * frequencias[i];
        }
        media = somaMedia / quantidadeElementos;

        return media;
    }

    public double getVariancia() {
        double somaVariancia = 0;
        for (int i = 0; i < quantidadeDeClasses; i++) {
            somaVariancia += Math.pow(pontosMedio[i] - media, 2) * frequencias[i];
        }
        variancia = somaVariancia / (quantidadeElementos - 1);

        return variancia;
    }

    public double getDesvioPadrao() {
        desvioPadrao = Math.sqrt(variancia);

        return desvioPadrao;
    }

}
