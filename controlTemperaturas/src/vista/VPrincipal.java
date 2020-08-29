/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import logica.LogPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal() {
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
        bAñadir = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bListarTodas = new javax.swing.JButton();
        bObtenerRango = new javax.swing.JButton();
        bMaximaMinima = new javax.swing.JButton();
        bObtenerMedia = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPantalla = new javax.swing.JTextArea();
        bListarPorFecha = new javax.swing.JButton();
        bListarPorTemp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAñadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bAñadir.setText("Añadir temp.");
        bAñadir.setActionCommand("añadir");

        bModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bModificar.setText("Modificar temp.");
        bModificar.setActionCommand("modificar");

        bListarTodas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bListarTodas.setText("Listar todas");
        bListarTodas.setActionCommand("listar todas");

        bObtenerRango.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bObtenerRango.setText("Obtener rango");
        bObtenerRango.setActionCommand("obtener rango");

        bMaximaMinima.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bMaximaMinima.setText("Maxima y minima");
        bMaximaMinima.setActionCommand("maxima y minima");

        bObtenerMedia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bObtenerMedia.setText("Obtener media");
        bObtenerMedia.setActionCommand("obtener media");

        bEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bEliminar.setText("Eliminar todas");
        bEliminar.setActionCommand("eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        taPantalla.setColumns(20);
        taPantalla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        bListarPorFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bListarPorFecha.setText("Listar por fecha");
        bListarPorFecha.setActionCommand("listar por fecha");

        bListarPorTemp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bListarPorTemp.setText("Listar por temp");
        bListarPorTemp.setActionCommand("listar por temp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAñadir)
                    .addComponent(bModificar)
                    .addComponent(bListarTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMaximaMinima)
                    .addComponent(bObtenerMedia)
                    .addComponent(bEliminar)
                    .addComponent(bListarPorFecha)
                    .addComponent(bListarPorTemp)
                    .addComponent(bObtenerRango))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAñadir, bEliminar, bMaximaMinima, bModificar, bObtenerMedia, bObtenerRango});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bListarPorFecha, bListarPorTemp, bListarTodas});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bListarTodas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bListarPorFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bListarPorTemp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bObtenerRango)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMaximaMinima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bObtenerMedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bAñadir, bEliminar, bMaximaMinima, bModificar, bObtenerMedia, bObtenerRango});

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
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadir;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bListarPorFecha;
    private javax.swing.JButton bListarPorTemp;
    private javax.swing.JButton bListarTodas;
    private javax.swing.JButton bMaximaMinima;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bObtenerMedia;
    private javax.swing.JButton bObtenerRango;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taPantalla;
    // End of variables declaration//GEN-END:variables

    public void setOyente(LogPrincipal oyente) {
        JButton[] losBotones = {bAñadir, bModificar, bListarTodas, bListarPorFecha, bListarPorTemp, bObtenerRango,
            bMaximaMinima, bObtenerMedia, bEliminar};
        for (JButton boton : losBotones) {
            boton.addActionListener(oyente);
        }
    }

    public void muestra(String texto) {
        taPantalla.setText(texto);
    }

    public void borraPantalla() {
        taPantalla.setText("");
    }

}
