package calculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CalculosEstatisticos {

    public List<Double> numeros;
    public double quantidadeElementos;
    public int quantidadeClasses;
    public int amplitudeDaClasse;
    public double[][] classes;
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
        calcularTudo();
    }

    private void calcularTudo() {
        getClasses();
        getFrequencias();
        getPontosMedio();
        getFrequenciasRelativa();
        getFrequenciaAcumulada();
        getFrequenciaRelativaAcumulada();
        getMedia();
        getVariancia();
        getDesvioPadrao();
    }

    private double[][] getClasses() {
        quantidadeElementos = (double) numeros.size();
        quantidadeClasses = (int) (1 + (3.3 * Math.log10(this.quantidadeElementos)));
        double menorValor = Collections.min(numeros);
        double maiorValor = Collections.max(numeros);
        amplitudeDaClasse = (int) Math.round((maiorValor - menorValor) / quantidadeClasses);

        classes = new double[quantidadeClasses][2];
        double valorMinimo = menorValor;
        for (int i = 0; i < quantidadeClasses; i++) {
            classes[i][0] = valorMinimo;
            valorMinimo += amplitudeDaClasse;
            classes[i][1] = valorMinimo;
        }

        return classes;
    }

    public int[] getFrequencias() {
        frequencias = new int[quantidadeClasses];
        for (int i = 0; i < quantidadeClasses; i++) {
            int frequencia = 0;
            for (Double numero : numeros) {
                if (numero >= classes[i][0] && numero < classes[i][1]) {
                    frequencia++;
                }
            }
            this.frequencias[i] = frequencia;
        }

        return frequencias;
    }

    public double[] getPontosMedio() {
        pontosMedio = new double[quantidadeClasses];
        for (int i = 0; i < quantidadeClasses; i++) {
            pontosMedio[i] = (classes[i][0] + classes[i][1]) / 2d;
        }

        return pontosMedio;
    }

    public double[] getFrequenciasRelativa() {
        frequenciasRelativa = new double[quantidadeClasses];
        for (int i = 0; i < quantidadeClasses; i++) {
            frequenciasRelativa[i] = frequencias[i] / quantidadeElementos;
        }

        return frequenciasRelativa;
    }

    public double[] getFrequenciaAcumulada() {
        frequenciaAcumulada = new double[quantidadeClasses];
        int valorAcumulado = 0;
        for (int i = 0; i < quantidadeClasses; i++) {
            valorAcumulado += frequencias[i];
            frequenciaAcumulada[i] = valorAcumulado;
        }

        return frequenciaAcumulada;
    }

    public double[] getFrequenciaRelativaAcumulada() {
        frequenciaRelativaAcumulada = new double[quantidadeClasses];
        double valorAcumulado = 0;
        for (int i = 0; i < quantidadeClasses; i++) {
            valorAcumulado += frequenciasRelativa[i];
            frequenciaRelativaAcumulada[i] = valorAcumulado;
        }

        return frequenciaRelativaAcumulada;
    }

    public double getMedia() {
        double somaMedia = 0;
        for (int i = 0; i < quantidadeClasses; i++) {
            somaMedia += pontosMedio[i] * frequencias[i];
        }
        media = somaMedia / quantidadeElementos;

        return media;
    }

    public double getVariancia() {
        double somaVariancia = 0;
        for (int i = 0; i < quantidadeClasses; i++) {
            somaVariancia += Math.pow(pontosMedio[i] - media, 2) * frequencias[i];
        }
        variancia = somaVariancia / (quantidadeElementos - 1);

        return variancia;
    }

    public double getDesvioPadrao() {
        desvioPadrao = Math.sqrt(variancia);

        return desvioPadrao;
    }

    public static void main(String[] args) {
        List<Double> a = new ArrayList<>();
        a.add(1d);
        a.add(2d);
        a.add(3d);
        a.add(4d);

        CalculosEstatisticos calculosEstatisticos = new CalculosEstatisticos(a);
    }

}
