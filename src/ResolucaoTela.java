
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ResolucaoTela extends javax.swing.JFrame {

    public ResolucaoTela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txbValorClasse = new javax.swing.JTextField();
        txbValorAmplitude = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rsIntervalos = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rsFrequencia = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rsPontoMedio = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rsFrRelAcumulada = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        rsFrRelativa = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        rsFrAcumulada = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        txbDesvioPadrao = new javax.swing.JTextField();
        rblMatrizDados = new javax.swing.JRadioButton();
        rblIntervalo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtMatrizDados = new javax.swing.JTextField();
        txtFrequenciaPronta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informe a matriz de dados ou o intervalo (números separados por espaço).");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Classe:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Amplitude:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Intervalos");

        jScrollPane1.setViewportView(rsIntervalos);

        jLabel5.setText("Frequência");

        jScrollPane2.setViewportView(rsFrequencia);

        jLabel6.setText("Ponto médio");

        jScrollPane3.setViewportView(rsPontoMedio);

        jLabel7.setText("Fr. Relativa");

        jLabel8.setText("Fr. Acumulada");

        jLabel9.setText("Fr. Rel. Acumulada");

        jScrollPane4.setViewportView(rsFrRelAcumulada);

        jScrollPane5.setViewportView(rsFrRelativa);

        jScrollPane6.setViewportView(rsFrAcumulada);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Desvio padrão:");

        buttonGroup1.add(rblMatrizDados);
        rblMatrizDados.setText("Matriz de dados");
        rblMatrizDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblMatrizDadosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rblIntervalo);
        rblIntervalo.setText("Intervalo");

        jLabel11.setText("Frequência pronta");

        txtFrequenciaPronta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFrequenciaProntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rblMatrizDados)
                                .addGap(18, 18, 18)
                                .addComponent(rblIntervalo))
                            .addComponent(txtMatrizDados, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFrequenciaPronta, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular))))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbValorClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbValorAmplitude, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbDesvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rblMatrizDados)
                    .addComponent(rblIntervalo)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFrequenciaPronta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMatrizDados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCalcular)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txbDesvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txbValorClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txbValorAmplitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane6)
                        .addComponent(jScrollPane4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        ResolucaoEstatistica resolucaoEstatistica = new ResolucaoEstatistica();
        int[][] intervalos = null;
        ArrayList<Integer> frequencia = null;
        ArrayList<Integer> numeros = txtMatrizDados.getText().isEmpty()
                ? new ArrayList<>()
                : resolucaoEstatistica.retornaValoresSeparados(txtMatrizDados.getText());

        boolean prosseguir = false;

        if (rblMatrizDados.isSelected()) {
            if (!txtMatrizDados.getText().isEmpty()) {
                int valorClasse = resolucaoEstatistica.calcularValorClasse(numeros);
                txbValorClasse.setText(String.valueOf(valorClasse));

                int valorAmplitude = resolucaoEstatistica.calcularAmplitude(numeros, valorClasse);
                txbValorAmplitude.setText(String.valueOf(valorAmplitude));

                intervalos = resolucaoEstatistica.retornarIntervalos(true);
                frequencia = resolucaoEstatistica.calcularFrequencia(numeros, true, "");

//                double desvioPadrao = resolucaoEstatistica.calcularDesvioPadrao();
//                String desvioPadraoFormatado = String.format("%.2f", desvioPadrao);
//                txbDesvioPadrao.setText(desvioPadraoFormatado);
                prosseguir = true;
            } else {
                JOptionPane.showMessageDialog(rootPane, "É obrigatório preencher a Matriz de Dados neste tipo de cálculo.");
            }
        } else {
            if (!txtMatrizDados.getText().isEmpty() && !txtFrequenciaPronta.getText().isEmpty()) {
                intervalos = resolucaoEstatistica.retornarIntervalos(false);
                frequencia = resolucaoEstatistica.calcularFrequencia(numeros, false, txtFrequenciaPronta.getText());
                resolucaoEstatistica.matrizIntervalo = intervalos;

                int valorClasse = resolucaoEstatistica.calcularValorClasse(numeros);
                txbValorClasse.setText(String.valueOf(intervalos.length));

                int valorAmplitude = resolucaoEstatistica.calcularAmplitude(numeros, valorClasse);
                txbValorAmplitude.setText(String.valueOf(valorAmplitude));

                prosseguir = true;
            } else {
                JOptionPane.showMessageDialog(rootPane, "É obrigatório informar a Matriz de Dados e a Frequência pronta para este tipo de cálculo.");
            }
        }

        if (prosseguir) {
            String listaIntervalos = "";
            String linha = "";
            String separador = "";
            for (int i = 0; i < intervalos.length; i++) {
                for (int j = 0; j < intervalos[0].length; j++) {
                    if (j == 1) {
                        separador = " - ";
                    } else {
                        separador = "";
                    }
                    linha += separador + String.valueOf(intervalos[i][j]);
                }
                listaIntervalos += linha + System.lineSeparator();
                linha = "";
            }
            rsIntervalos.setText(listaIntervalos);
            String listaFrequencia = "";
            for (int i = 0; i < frequencia.size(); i++) {
                listaFrequencia += frequencia.get(i) + System.lineSeparator();
            }
            rsFrequencia.setText(listaFrequencia);
            ArrayList<Double> PontoMedio = resolucaoEstatistica.CalcularPontoMedio();
            String listaPontoMedio = "";
            for (int i = 0; i < PontoMedio.size(); i++) {
                listaPontoMedio += PontoMedio.get(i) + System.lineSeparator();
            }
            rsPontoMedio.setText(listaPontoMedio);
            ArrayList<Double> FrequenciaRelativa = resolucaoEstatistica.CalcularFrequenciaRelativa();
            String listaFrRelativa = "";
            for (int i = 0; i < FrequenciaRelativa.size(); i++) {
                listaFrRelativa += String.format("%.2f", FrequenciaRelativa.get(i)) + System.lineSeparator();
            }
            rsFrRelativa.setText(listaFrRelativa);
            ArrayList<Integer> FrequenciaAcumulada = resolucaoEstatistica.CalcularFrequenciaAcumulada();
            String listaFrAcumulada = "";
            for (int i = 0; i < FrequenciaAcumulada.size(); i++) {
                listaFrAcumulada += FrequenciaAcumulada.get(i) + System.lineSeparator();
            }
            rsFrAcumulada.setText(listaFrAcumulada);
            ArrayList<Double> FrequenciaRelativaAcumulada = resolucaoEstatistica.CalcularFrequenciaRelativaAcumulada();
            String listaFrRelativaAcumulada = "";
            for (int i = 0; i < FrequenciaRelativaAcumulada.size(); i++) {
                listaFrRelativaAcumulada += String.format("%.2f", FrequenciaRelativaAcumulada.get(i)) + System.lineSeparator();
            }
            rsFrRelAcumulada.setText(listaFrRelativaAcumulada);

            double desvioPadrao = resolucaoEstatistica.calcularDesvioPadrao();
            String desvioPadraoFormatado = String.format("%.2f", desvioPadrao);
            txbDesvioPadrao.setText(desvioPadraoFormatado);

        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rblMatrizDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblMatrizDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rblMatrizDadosActionPerformed

    private void txtFrequenciaProntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFrequenciaProntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFrequenciaProntaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ResolucaoTela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JRadioButton rblIntervalo;
    private javax.swing.JRadioButton rblMatrizDados;
    private javax.swing.JTextPane rsFrAcumulada;
    private javax.swing.JTextPane rsFrRelAcumulada;
    private javax.swing.JTextPane rsFrRelativa;
    private javax.swing.JTextPane rsFrequencia;
    private javax.swing.JTextPane rsIntervalos;
    private javax.swing.JTextPane rsPontoMedio;
    private javax.swing.JTextField txbDesvioPadrao;
    private javax.swing.JTextField txbValorAmplitude;
    private javax.swing.JTextField txbValorClasse;
    private javax.swing.JTextField txtFrequenciaPronta;
    private javax.swing.JTextField txtMatrizDados;
    // End of variables declaration//GEN-END:variables
}
