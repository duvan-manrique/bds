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
public class agregar_clienteplus extends javax.swing.JFrame {

    /**
     * Creates new form agregar_clienteplus
     */
    public agregar_clienteplus() {
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

        bn_registrarsplus = new javax.swing.JButton();
        tx_marca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_celular = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tx_modelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tx_residencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bn_cancelarplus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fecha_inicio = new com.toedter.calendar.JDateChooser();
        tx_cedula = new javax.swing.JTextField();
        tx_placa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fecha_final = new com.toedter.calendar.JDateChooser();
        tx_nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bn_registrarsplus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        bn_registrarsplus.setText("Registarse cliente plus");
        bn_registrarsplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_registrarsplusActionPerformed(evt);
            }
        });
        getContentPane().add(bn_registrarsplus);
        bn_registrarsplus.setBounds(53, 340, 200, 59);

        tx_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_marcaActionPerformed(evt);
            }
        });
        getContentPane().add(tx_marca);
        tx_marca.setBounds(490, 110, 100, 22);

        jLabel7.setText("modelo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 120, 42, 16);

        jLabel4.setText("cc");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 190, 20, 16);
        getContentPane().add(tx_celular);
        tx_celular.setBounds(120, 150, 100, 22);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO AL REGISTRO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 40, 347, 29);

        jLabel3.setText("Residencia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 61, 16);
        getContentPane().add(tx_modelo);
        tx_modelo.setBounds(330, 110, 100, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 11)); // NOI18N
        jLabel5.setText("Informacion del auto");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 70, 180, 30);
        getContentPane().add(tx_residencia);
        tx_residencia.setBounds(120, 120, 100, 22);

        jLabel2.setText("Nombre Completo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 103, 16);

        bn_cancelarplus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.jpg"))); // NOI18N
        bn_cancelarplus.setText("calcelar cliente plus");
        bn_cancelarplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_cancelarplusActionPerformed(evt);
            }
        });
        getContentPane().add(bn_cancelarplus);
        bn_cancelarplus.setBounds(280, 340, 200, 60);

        jLabel6.setText("marca ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 110, 40, 16);
        getContentPane().add(fecha_inicio);
        fecha_inicio.setBounds(230, 300, 88, 22);
        getContentPane().add(tx_cedula);
        tx_cedula.setBounds(70, 190, 60, 22);
        getContentPane().add(tx_placa);
        tx_placa.setBounds(330, 140, 100, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("dia que desea iniciar el servicio");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 290, 210, 30);

        jLabel8.setText("placa");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 140, 30, 16);
        getContentPane().add(fecha_final);
        fecha_final.setBounds(380, 300, 88, 22);

        tx_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(tx_nombre);
        tx_nombre.setBounds(140, 80, 170, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("hasta");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 300, 50, 20);

        jLabel11.setText("Numero celular");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 150, 87, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parking_Logo.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 320, 100, 80);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "automovil", "motocicleta", "cicla" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(490, 140, 100, 22);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/articulo-parqueadero.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn_registrarsplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_registrarsplusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bn_registrarsplusActionPerformed

    private void tx_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_marcaActionPerformed

    private void bn_cancelarplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_cancelarplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bn_cancelarplusActionPerformed

    private void tx_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(agregar_clienteplus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_clienteplus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_clienteplus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_clienteplus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_clienteplus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn_cancelarplus;
    private javax.swing.JButton bn_registrarsplus;
    private com.toedter.calendar.JDateChooser fecha_final;
    private com.toedter.calendar.JDateChooser fecha_inicio;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JTextField tx_cedula;
    private javax.swing.JTextField tx_celular;
    private javax.swing.JTextField tx_marca;
    private javax.swing.JTextField tx_modelo;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_placa;
    private javax.swing.JTextField tx_residencia;
    // End of variables declaration//GEN-END:variables
}
