/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;
import oovv.Circulo;
import oovv.Cuadrado;
import oovv.MiEX;
import oovv.Punto;
import oovv.Rectangulo;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class DAñadir extends javax.swing.JDialog {

    /**
     * Creates new form DAñadir
     */
    public DAñadir(java.awt.Frame parent, boolean modal) {
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

        eDatos1 = new javax.swing.JLabel();
        tfDato1 = new javax.swing.JTextField();
        eDatos2 = new javax.swing.JLabel();
        tfDato3 = new javax.swing.JTextField();
        eAcción = new javax.swing.JLabel();
        eDatos3 = new javax.swing.JLabel();
        tfDato2 = new javax.swing.JTextField();
        tfDato4 = new javax.swing.JTextField();
        bValida = new javax.swing.JButton();
        bCancela = new javax.swing.JButton();
        eDatos4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        eDatos1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        eDatos1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eDatos1.setText("X");

        tfDato1.setColumns(5);
        tfDato1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfDato1.setText("4");

        eDatos2.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        eDatos2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eDatos2.setText("Y");

        tfDato3.setColumns(5);
        tfDato3.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfDato3.setText("10");

        eAcción.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        eAcción.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eAcción.setText("acción");

        eDatos3.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        eDatos3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eDatos3.setText("Anchura");

        tfDato2.setColumns(5);
        tfDato2.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfDato2.setText("10");

        tfDato4.setColumns(5);
        tfDato4.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfDato4.setText("10");

        bValida.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bValida.setText("valida");
        bValida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bCancela.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bCancela.setText("cancela");
        bCancela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        eDatos4.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        eDatos4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eDatos4.setText("Altura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eAcción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eDatos3)
                        .addGap(18, 18, 18)
                        .addComponent(tfDato3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDato1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDato2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eDatos4)
                                .addGap(18, 18, 18)
                                .addComponent(tfDato4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bValida, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bCancela, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eDatos1, eDatos2, eDatos3, eDatos4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfDato1, tfDato2, tfDato3, tfDato4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eAcción)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDatos1)
                    .addComponent(tfDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDatos2)
                    .addComponent(tfDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eDatos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eDatos4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bValida)
                    .addComponent(bCancela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(DAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DAñadir dialog = new DAñadir(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bCancela;
    private javax.swing.JButton bValida;
    private javax.swing.JLabel eAcción;
    private javax.swing.JLabel eDatos1;
    private javax.swing.JLabel eDatos2;
    private javax.swing.JLabel eDatos3;
    private javax.swing.JLabel eDatos4;
    private javax.swing.JTextField tfDato1;
    private javax.swing.JTextField tfDato2;
    private javax.swing.JTextField tfDato3;
    private javax.swing.JTextField tfDato4;
    // End of variables declaration//GEN-END:variables

    public void setOyente(ActionListener oyente) {
        bCancela.addActionListener(oyente);
        bValida.addActionListener(oyente);
    }

    public void setAccion(String accion) {
        eAcción.setText(accion);
        String[] pals = accion.split(" ");
        bValida.setActionCommand("valida rectángulo");
        switch (pals[pals.length - 1]) {

            case "círculo":
                eDatos3.setText("radio");
                eDatos4.setVisible(false);
                tfDato4.setVisible(false);
                bValida.setActionCommand("valida círculo");
                break;
            case "cuadrado":
                eDatos3.setText("lado");
                eDatos4.setVisible(false);
                tfDato4.setVisible(false);
                bValida.setActionCommand("valida cuadrado");
                break;

        }
    }

    public Rectangulo getRectangulo() throws MiEX {
        return new Rectangulo(Double.parseDouble(tfDato4.getText()), Double.parseDouble(tfDato3.getText()), Integer.parseInt(tfDato1.getText()), Integer.parseInt(tfDato2.getText()));
    }

    public Circulo getCírculo() throws MiEX {
        return new Circulo(Double.parseDouble(tfDato3.getText()), Integer.parseInt(tfDato1.getText()), Integer.parseInt(tfDato2.getText()));
    }

    public Cuadrado getCuadrado() throws MiEX {
        return new Cuadrado(Double.parseDouble(tfDato3.getText()), Integer.parseInt(tfDato1.getText()), Integer.parseInt(tfDato2.getText()));
    }

    public Punto getPosicion() {
        return new Punto(Integer.parseInt(tfDato1.getText()), Integer.parseInt(tfDato2.getText()));
    }
}
