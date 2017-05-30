
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
        jButton1 = new javax.swing.JButton();
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
        txbDesvioMedio = new javax.swing.JTextField();
        jButtonMatriz = new javax.swing.JRadioButton();
        jButtonIntervalo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txbMatrizDados = new javax.swing.JTextField();
        txbFrequenciaPronta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resolução de problemas"));

        jLabel1.setText("Informe a matriz de dados ou o intervalo (números separados por espaço).");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Classe:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Amplitude:");

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Intervalos");

        jScrollPane1.setViewportView(rsIntervalos);

        jLabel5.setText("Frequência");

        jScrollPane2.setViewportView(rsFrequencia);

        jLabel6.setText("Ponto Médio");

        jScrollPane3.setViewportView(rsPontoMedio);

        jLabel7.setText("Fr. Relativa");

        jLabel8.setText("Fr. Acumulada");

        jLabel9.setText("Fr. Rel. Acumulada");

        jScrollPane4.setViewportView(rsFrRelAcumulada);

        jScrollPane5.setViewportView(rsFrRelativa);

        jScrollPane6.setViewportView(rsFrAcumulada);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Desvio Médio:");

        buttonGroup1.add(jButtonMatriz);
        jButtonMatriz.setText("Matriz de dados");
        jButtonMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatrizActionPerformed(evt);
            }
        });

        buttonGroup1.add(jButtonIntervalo);
        jButtonIntervalo.setText("Intervalo");

        jLabel11.setText("Frequência pronta");

        txbFrequenciaPronta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbFrequenciaProntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txbValorClasse)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txbValorAmplitude)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txbDesvioMedio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txbMatrizDados)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonMatriz)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonIntervalo)
                                        .addGap(69, 69, 69)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txbFrequenciaPronta))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMatriz)
                    .addComponent(jButtonIntervalo)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbMatrizDados)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbFrequenciaPronta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbValorClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txbValorAmplitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txbDesvioMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane4))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ResolucaoEstatistica resEs = new ResolucaoEstatistica();
        int intervalos[][] = null;
        ArrayList<Integer> numeros;

        ArrayList<Integer> Frequencia = null;

        boolean prosseguir = false;

        if (jButtonMatriz.isSelected()) {

            if (!txbMatrizDados.getText().isEmpty()) {

                numeros = resEs.RetornaValoresSeparados(txbMatrizDados.getText());

                int Vlrclasse = resEs.CalculaClasse(numeros);

                txbValorClasse.setText(String.valueOf(Vlrclasse));

                int Vlramplitude = resEs.CalculaAmplitude(numeros, Vlrclasse);

                txbValorAmplitude.setText(String.valueOf(Vlramplitude));

                intervalos = resEs.Retornaintervalos(true);

                Frequencia = resEs.CalculaFrequencia(numeros, true, "");

                prosseguir = true;

            } else {

                JOptionPane.showMessageDialog(rootPane, "É obrigatório preencher a Matriz de Dados neste tipo de cálculo");

            }

        } else {

            if (!txbMatrizDados.getText().isEmpty() && !txbFrequenciaPronta.getText().isEmpty()) {

                numeros = resEs.RetornaValoresSeparados(txbMatrizDados.getText());

                intervalos = resEs.Retornaintervalos(false);

                Frequencia = resEs.CalculaFrequencia(numeros, false, txbFrequenciaPronta.getText());

                double desvioMedio = resEs.CalcularDesvioMedio();

                String rsDesvioMedio = String.format("%.2f", desvioMedio);

                txbDesvioMedio.setText(rsDesvioMedio);

                prosseguir = true;

            } else {

                JOptionPane.showMessageDialog(rootPane, "É obrigatório informar a Matriz de Dados e a Frequência pronta para este tipo de cálculo!");

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

            for (int i = 0; i < Frequencia.size(); i++) {

                listaFrequencia += Frequencia.get(i) + System.lineSeparator();

            }

            rsFrequencia.setText(listaFrequencia);

            ArrayList<Double> PontoMedio = resEs.CalcularPontoMedio();

            String listaPontoMedio = "";

            for (int i = 0;
                    i < PontoMedio.size();
                    i++) {

                listaPontoMedio += PontoMedio.get(i) + System.lineSeparator();

            }

            rsPontoMedio.setText(listaPontoMedio);

            ArrayList<Double> FrequenciaRelativa = resEs.CalcularFrequenciaRelativa();

            String listaFrRelativa = "";

            for (int i = 0;
                    i < FrequenciaRelativa.size();
                    i++) {

                listaFrRelativa += String.format("%.2f", FrequenciaRelativa.get(i)) + System.lineSeparator();

            }

            rsFrRelativa.setText(listaFrRelativa);

            ArrayList<Integer> FrequenciaAcumulada = resEs.CalcularFrequenciaAcumulada();

            String listaFrAcumulada = "";

            for (int i = 0;
                    i < FrequenciaAcumulada.size();
                    i++) {

                listaFrAcumulada += FrequenciaAcumulada.get(i) + System.lineSeparator();

            }

            rsFrAcumulada.setText(listaFrAcumulada);

            ArrayList<Double> FrequenciaRelativaAcumulada = resEs.CalcularFrequenciaRelativaAcumulada();

            String listaFrRelativaAcumulada = "";

            for (int i = 0;
                    i < FrequenciaRelativaAcumulada.size();
                    i++) {

                listaFrRelativaAcumulada += String.format("%.2f", FrequenciaRelativaAcumulada.get(i)) + System.lineSeparator();

            }

            rsFrRelAcumulada.setText(listaFrRelativaAcumulada);
        } else {

            JOptionPane.showMessageDialog(rootPane, "Houve algum erro e não foi possível prosseguir!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatrizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMatrizActionPerformed

    private void txbFrequenciaProntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbFrequenciaProntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbFrequenciaProntaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResolucaoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jButtonIntervalo;
    private javax.swing.JRadioButton jButtonMatriz;
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
    private javax.swing.JTextPane rsFrAcumulada;
    private javax.swing.JTextPane rsFrRelAcumulada;
    private javax.swing.JTextPane rsFrRelativa;
    private javax.swing.JTextPane rsFrequencia;
    private javax.swing.JTextPane rsIntervalos;
    private javax.swing.JTextPane rsPontoMedio;
    private javax.swing.JTextField txbDesvioMedio;
    private javax.swing.JTextField txbFrequenciaPronta;
    private javax.swing.JTextField txbMatrizDados;
    private javax.swing.JTextField txbValorAmplitude;
    private javax.swing.JTextField txbValorClasse;
    // End of variables declaration//GEN-END:variables
}
