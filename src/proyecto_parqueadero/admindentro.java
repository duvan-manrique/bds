/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

/**
 *
 * @author rojas
 */
public class admindentro extends javax.swing.JFrame {

    /**
     * Creates new form admindentro
     */
    Registro registro;
    public admindentro(Registro registro1) {
        initComponents();
        registro= registro1;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bn_editarcliente = new javax.swing.JButton();
        bn_cienteplus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bn_eliminarcliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tx_cajadeldia = new javax.swing.JButton();
        bn_verclientes = new javax.swing.JButton();
        bn_verclientesplus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(607, 455));
        setMinimumSize(new java.awt.Dimension(607, 455));
        setPreferredSize(new java.awt.Dimension(607, 455));
        getContentPane().setLayout(null);

        bn_editarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.jpg"))); // NOI18N
        bn_editarcliente.setText("editar cliente");
        bn_editarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_editarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(bn_editarcliente);
        bn_editarcliente.setBounds(30, 280, 170, 60);

        bn_cienteplus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        bn_cienteplus.setText("agregar cliente plus");
        bn_cienteplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_cienteplusActionPerformed(evt);
            }
        });
        getContentPane().add(bn_cienteplus);
        bn_cienteplus.setBounds(200, 280, 180, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Business-Restaurant.png"))); // NOI18N
        jLabel3.setText("Bienvenido  administrador");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 70, 400, 90);

        bn_eliminarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.jpg"))); // NOI18N
        bn_eliminarcliente.setText("eliminar cliente");
        bn_eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_eliminarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(bn_eliminarcliente);
        bn_eliminarcliente.setBounds(380, 280, 160, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parking_Logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 0, 290, 89);

        tx_cajadeldia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gana-dinero-android.jpg"))); // NOI18N
        tx_cajadeldia.setText("caja del dia");
        getContentPane().add(tx_cajadeldia);
        tx_cajadeldia.setBounds(380, 340, 160, 60);

        bn_verclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personal-information-icon.png"))); // NOI18N
        bn_verclientes.setText("ver clientes");
        bn_verclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_verclientesActionPerformed(evt);
            }
        });
        getContentPane().add(bn_verclientes);
        bn_verclientes.setBounds(30, 340, 170, 60);

        bn_verclientesplus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personal-information-icon.png"))); // NOI18N
        bn_verclientesplus.setText("ver clientes plus");
        bn_verclientesplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_verclientesplusActionPerformed(evt);
            }
        });
        getContentPane().add(bn_verclientesplus);
        bn_verclientesplus.setBounds(200, 340, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/articulo-parqueadero.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn_editarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_editarclienteActionPerformed
       editar_cliente cliente_edit = new editar_cliente(registro);
    }//GEN-LAST:event_bn_editarclienteActionPerformed

    private void bn_verclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_verclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bn_verclientesActionPerformed

    private void bn_verclientesplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_verclientesplusActionPerformed
       
    }//GEN-LAST:event_bn_verclientesplusActionPerformed

    private void bn_cienteplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_cienteplusActionPerformed
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_cienteplusActionPerformed

    private void bn_eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_eliminarclienteActionPerformed
       eliminar_cliente eliminar = new eliminar_cliente(registro);
       eliminar.setVisible(true);
    }//GEN-LAST:event_bn_eliminarclienteActionPerformed

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
            java.util.logging.Logger.getLogger(admindentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new admindentro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn_cienteplus;
    private javax.swing.JButton bn_editarcliente;
    private javax.swing.JButton bn_eliminarcliente;
    private javax.swing.JButton bn_verclientes;
    private javax.swing.JButton bn_verclientesplus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton tx_cajadeldia;
    // End of variables declaration//GEN-END:variables
}
