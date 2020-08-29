/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import logica.EntradaLog;
import oovv.Temperatura;
import static oovv.Temperatura.DTF;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class DialogoTemp extends javax.swing.JDialog {

    /**
     * Creates new form MiDialogo
     */
    public DialogoTemp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTemperatura = new javax.swing.JLabel();
        tfTemperatura = new javax.swing.JTextField();
        bIntroducir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jlFecha = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        jlGradosCentigrados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfMes = new javax.swing.JTextField();
        jlDia = new javax.swing.JLabel();
        jlMes = new javax.swing.JLabel();
        tfAño = new javax.swing.JTextField();
        jlAño = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlTemperatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlTemperatura.setText("Introduce la temperatura:");

        tfTemperatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTemperatura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bIntroducir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bIntroducir.setText("Introducir");
        bIntroducir.setActionCommand("introducir");

        bCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.setActionCommand("cancelar");

        jlFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlFecha.setText("Introduce fecha:");

        tfDia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlGradosCentigrados.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlGradosCentigrados.setText("ºC");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setText("/");

        tfMes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlDia.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDia.setText("Dia");

        jlMes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMes.setText("Mes");

        tfAño.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfAño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAño.setText("2020");

        jlAño.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAño.setText("Año");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTemperatura)
                        .addGap(18, 18, 18)
                        .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlGradosCentigrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bIntroducir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlFecha)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMes, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jlMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfAño, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfDia, tfMes});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancelar, bIntroducir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDia)
                            .addComponent(jlMes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFecha)
                            .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTemperatura)
                    .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGradosCentigrados))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIntroducir)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfDia, tfMes});

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogoTemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoTemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoTemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoTemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoTemp dialog = new DialogoTemp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bIntroducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAño;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlGradosCentigrados;
    private javax.swing.JLabel jlMes;
    private javax.swing.JLabel jlTemperatura;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfTemperatura;
    // End of variables declaration//GEN-END:variables

    public void setOyente(EntradaLog oyente) {
        bIntroducir.addActionListener(oyente);
        bCancelar.addActionListener(oyente);
    }

    public Double getValor() {
        double temp = Double.parseDouble(tfTemperatura.getText());
        return temp;
    }

    public Temperatura getTemp() {
        return new Temperatura(getValor(), getFecha().format(DTF));
    }

    public LocalDate getFecha() {
        int dia = 0, mes = 0, año = 0;
        dia = Integer.parseInt(tfDia.getText().trim());
        mes = Integer.parseInt(tfMes.getText().trim());
        año = Integer.parseInt(tfAño.getText().trim());
        return LocalDate.of(año, mes, dia);
    }

}
