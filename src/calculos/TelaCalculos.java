package calculos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaCalculos extends javax.swing.JFrame {

    public TelaCalculos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcoes = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformarMatrizDados = new javax.swing.JTextArea();
        radioMatrizDeDados = new javax.swing.JRadioButton();
        radioIntervaloPronto = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformarIntervalos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInformarFrequencias = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtIntervalos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtFrequencias = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtPontosMedio = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtFrequenciasRelativa = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtFrequenciaAcumulada = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtFrequenciaRelativaAcumulada = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        lblQuantidadeClasses = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAmplitudeDaClasse = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDesvioPadrao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInformarMatrizDados.setColumns(20);
        txtInformarMatrizDados.setLineWrap(true);
        txtInformarMatrizDados.setRows(3);
        jScrollPane1.setViewportView(txtInformarMatrizDados);

        buttonGroupOpcoes.add(radioMatrizDeDados);
        radioMatrizDeDados.setSelected(true);
        radioMatrizDeDados.setText("Matriz de dados");
        radioMatrizDeDados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioMatrizDeDadosItemStateChanged(evt);
            }
        });

        buttonGroupOpcoes.add(radioIntervaloPronto);
        radioIntervaloPronto.setText("Intervalo pronto");
        radioIntervaloPronto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioIntervaloProntoItemStateChanged(evt);
            }
        });

        txtInformarIntervalos.setEditable(false);
        txtInformarIntervalos.setColumns(20);
        txtInformarIntervalos.setLineWrap(true);
        txtInformarIntervalos.setRows(3);
        jScrollPane2.setViewportView(txtInformarIntervalos);

        txtInformarFrequencias.setEditable(false);
        txtInformarFrequencias.setColumns(20);
        txtInformarFrequencias.setLineWrap(true);
        txtInformarFrequencias.setRows(3);
        jScrollPane3.setViewportView(txtInformarFrequencias);

        jLabel1.setText("Matriz de dados (Ex.: 1 5 8 6 2.4)");

        jLabel2.setText("Intervalos (Ex.: 1-1.5 1.5-2 2-2.5)");

        jLabel3.setText("Frequências (Ex.: 3 5 9)");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Intervalos");

        txtIntervalos.setColumns(1);
        txtIntervalos.setRows(1);
        jScrollPane4.setViewportView(txtIntervalos);

        jLabel5.setText("Frequências");

        txtFrequencias.setColumns(1);
        txtFrequencias.setRows(1);
        jScrollPane5.setViewportView(txtFrequencias);

        jLabel6.setText("Ponto médio");

        txtPontosMedio.setColumns(1);
        txtPontosMedio.setRows(1);
        jScrollPane6.setViewportView(txtPontosMedio);

        jLabel7.setText("Fr. relativa");

        txtFrequenciasRelativa.setColumns(1);
        txtFrequenciasRelativa.setRows(1);
        jScrollPane7.setViewportView(txtFrequenciasRelativa);

        jLabel8.setText("Fr. acumulada");

        txtFrequenciaAcumulada.setColumns(1);
        txtFrequenciaAcumulada.setRows(1);
        jScrollPane8.setViewportView(txtFrequenciaAcumulada);

        jLabel9.setText("Fr. relativa acumulada");

        txtFrequenciaRelativaAcumulada.setColumns(1);
        txtFrequenciaRelativaAcumulada.setRows(1);
        jScrollPane9.setViewportView(txtFrequenciaRelativaAcumulada);

        jLabel10.setText("Qntd. classes:");

        lblQuantidadeClasses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantidadeClasses.setText("0");

        jLabel11.setText("Amplitude:");

        lblAmplitudeDaClasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAmplitudeDaClasse.setText("0");

        jLabel12.setText("Média:");

        lblMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMedia.setText("0");

        jLabel13.setText("Desvio padrão:");

        lblDesvioPadrao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDesvioPadrao.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMatrizDeDados)
                                .addGap(18, 18, 18)
                                .addComponent(radioIntervaloPronto))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQuantidadeClasses)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAmplitudeDaClasse)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMedia)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDesvioPadrao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioMatrizDeDados)
                            .addComponent(radioIntervaloPronto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblDesvioPadrao))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblMedia))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lblAmplitudeDaClasse))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(lblQuantidadeClasses)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (radioMatrizDeDados.isSelected()) {
            if (txtInformarMatrizDados.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a matriz de dados.");
                return;
            }
            try {
                CalculosEstatisticos calculosEstatisticos = new CalculosEstatisticos(getMatrizDeDados());
                mostrarDadosEstatisticosEmTela(calculosEstatisticos);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (radioIntervaloPronto.isSelected()) {
            if (txtInformarIntervalos.getText().trim().isEmpty() || txtInformarFrequencias.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe os intervalos e a frequência de cada intervalo.");
                return;
            }

            try {
                CalculosEstatisticos calculosEstatisticos = calcularIntervalosProntos();
                mostrarDadosEstatisticosEmTela(calculosEstatisticos);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma das opções.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void radioMatrizDeDadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioMatrizDeDadosItemStateChanged
        boolean showMatrizDados = radioMatrizDeDados.isSelected();
        txtInformarMatrizDados.setEditable(showMatrizDados);
        txtInformarIntervalos.setEditable(!showMatrizDados);
        txtInformarFrequencias.setEditable(!showMatrizDados);
    }//GEN-LAST:event_radioMatrizDeDadosItemStateChanged

    private void radioIntervaloProntoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioIntervaloProntoItemStateChanged
        boolean showIntervalos = radioIntervaloPronto.isSelected();
        txtInformarMatrizDados.setEditable(!showIntervalos);
        txtInformarIntervalos.setEditable(showIntervalos);
        txtInformarFrequencias.setEditable(showIntervalos);
    }//GEN-LAST:event_radioIntervaloProntoItemStateChanged

    private CalculosEstatisticos calcularIntervalosProntos() throws Exception {
        return new CalculosEstatisticos(getIntervalos(), getFrequencias());
    }

    private double[][] getIntervalos() throws Exception {
        String[] intervalosInformados = txtInformarIntervalos.getText().split(" ");
        double[][] intervalos = new double[intervalosInformados.length][2];
        for (int i = 0; i < intervalosInformados.length; i++) {
            String[] valoresIntervalo = intervalosInformados[i].split("-");
            if (valoresIntervalo.length != 2) {
                throw new Exception(String.format("O intervalo %s não está correto.", intervalosInformados[i]));
            }
            double[] valores = new double[valoresIntervalo.length];
            valores[0] = Double.parseDouble(valoresIntervalo[0].replace(",", ".").trim());
            valores[1] = Double.parseDouble(valoresIntervalo[1].replace(",", ".").trim());
            intervalos[i] = valores;
        }

        return intervalos;
    }

    private int[] getFrequencias() {
        String[] frequenciasInformadas = txtInformarFrequencias.getText().split(" ");
        int[] frequencias = new int[frequenciasInformadas.length];
        for (int i = 0; i < frequenciasInformadas.length; i++) {
            frequencias[i] = Integer.parseInt(frequenciasInformadas[i].trim());
        }

        return frequencias;
    }

    private List<Double> getMatrizDeDados() {
        List<Double> dados = new ArrayList<>();
        for (String numero : txtInformarMatrizDados.getText().split(" ")) {
            if (numero.isEmpty()) {
                continue;
            }
            dados.add(Double.parseDouble(numero.replace(",", ".").trim()));
        }

        return dados;
    }

    private void mostrarDadosEstatisticosEmTela(CalculosEstatisticos calculosEstatisticos) {
        StringBuilder sb = new StringBuilder();
        for (double[] classe : calculosEstatisticos.intervalos) {
            sb.append(String.format("%.2f", classe[0])).append(" - ").append(String.format("%.2f", classe[1])).append("\n");
        }
        txtIntervalos.setText(sb.toString());
        sb.setLength(0);

        for (int frequencia : calculosEstatisticos.frequencias) {
            sb.append(frequencia).append("\n");
        }
        txtFrequencias.setText(sb.toString());
        sb.setLength(0);

        for (double pontoMedio : calculosEstatisticos.pontosMedio) {
            sb.append(String.format("%.2f", pontoMedio)).append("\n");
        }
        txtPontosMedio.setText(sb.toString());
        sb.setLength(0);

        for (double frequenciaRelativa : calculosEstatisticos.frequenciasRelativa) {
            sb.append(String.format("%.2f", frequenciaRelativa)).append("\n");
        }
        txtFrequenciasRelativa.setText(sb.toString());
        sb.setLength(0);

        for (double frequenciaAcumulada : calculosEstatisticos.frequenciaAcumulada) {
            sb.append(String.format("%.2f", frequenciaAcumulada)).append("\n");
        }
        txtFrequenciaAcumulada.setText(sb.toString());
        sb.setLength(0);

        for (double frequenciaRelativaAcumulada : calculosEstatisticos.frequenciaRelativaAcumulada) {
            sb.append(String.format("%.2f", frequenciaRelativaAcumulada)).append("\n");
        }
        txtFrequenciaRelativaAcumulada.setText(sb.toString());

        lblQuantidadeClasses.setText(String.valueOf(calculosEstatisticos.quantidadeDeClasses));
        lblAmplitudeDaClasse.setText(String.valueOf(calculosEstatisticos.amplitudeDaClasse));
        lblMedia.setText(String.format("%.2f", calculosEstatisticos.media));
        lblDesvioPadrao.setText(String.format("%.2f", calculosEstatisticos.desvioPadrao));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCalculos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroupOpcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblAmplitudeDaClasse;
    private javax.swing.JLabel lblDesvioPadrao;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblQuantidadeClasses;
    private javax.swing.JRadioButton radioIntervaloPronto;
    private javax.swing.JRadioButton radioMatrizDeDados;
    private javax.swing.JTextArea txtFrequenciaAcumulada;
    private javax.swing.JTextArea txtFrequenciaRelativaAcumulada;
    private javax.swing.JTextArea txtFrequencias;
    private javax.swing.JTextArea txtFrequenciasRelativa;
    private javax.swing.JTextArea txtInformarFrequencias;
    private javax.swing.JTextArea txtInformarIntervalos;
    private javax.swing.JTextArea txtInformarMatrizDados;
    private javax.swing.JTextArea txtIntervalos;
    private javax.swing.JTextArea txtPontosMedio;
    // End of variables declaration//GEN-END:variables
}
