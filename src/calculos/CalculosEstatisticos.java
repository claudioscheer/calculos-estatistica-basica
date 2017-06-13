package calculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalculosEstatisticos {

    public List<Double> numeros;
    public Double menorValor;
    public Double maiorValor;
    public int quantidadeElementos;
    public int quantidadeClasses;
    public int amplitudeDaClasse;
    public double[][] classes;

    public CalculosEstatisticos(List<Double> numeros) {
        this.numeros = numeros;
    }

    public double[][] getClasses() {
        quantidadeElementos = numeros.size();
        quantidadeClasses = (int) (1 + (3.3 * Math.log10(this.quantidadeElementos)));
        amplitudeDaClasse = (int) (Collections.max(numeros) - Collections.min(numeros)) / quantidadeClasses;
        menorValor = Collections.min(numeros);
        maiorValor = Collections.max(numeros);

        classes = new double[quantidadeClasses][2];
        double valorMinimo = menorValor;
        for (int i = 0; i < quantidadeClasses; i++) {
            classes[i][0] = valorMinimo;
            valorMinimo += amplitudeDaClasse;
            classes[i][1] = valorMinimo;
        }

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i][0] + " - " + classes[i][1]);
        }

        return classes;
    }

    public static void main(String[] args) {
        List<Double> a = new ArrayList<>();
        a.add(1d);
        a.add(2d);
        a.add(3d);
        a.add(4d);

        CalculosEstatisticos calculosEstatisticos = new CalculosEstatisticos(a);
        calculosEstatisticos.getClasses();
    }

}
