/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class Registro extends javax.swing.JFrame {
String EMPTY = new String();
int IND_NR;
    /**
     * Creates new form Registro
     */
 Connection con=null;
    Statement stmt=null;
    ResultSet rs = null;
    String placa1;
    public Registro(Connection con,Statement stm) {
        initComponents();
        this.stmt=stm;
        this.con=con; 
        tx_placa.setEditable(false);
        tx_placa.setBackground(Color.WHITE);
    }

  
    public void placa_res(String placa){
         placa1= placa;
         tx_placa.setText(placa1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    //INSTANCIA DE LA BD************
    BaseDatos bd = new BaseDatos();
    //*******
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bn_registrarse = new javax.swing.JButton();
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
        bn_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tx_cedula = new javax.swing.JTextField();
        tx_placa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tx_nombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(604, 450));
        setMinimumSize(new java.awt.Dimension(604, 450));
        setPreferredSize(new java.awt.Dimension(604, 450));
        getContentPane().setLayout(null);

        bn_registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        bn_registrarse.setText("Registarse");
        bn_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_registrarseActionPerformed(evt);
            }
        });
        getContentPane().add(bn_registrarse);
        bn_registrarse.setBounds(53, 340, 150, 59);

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

        bn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.jpg"))); // NOI18N
        bn_cancelar.setText("calcelar");
        bn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bn_cancelar);
        bn_cancelar.setBounds(230, 340, 160, 60);

        jLabel6.setText("marca ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 110, 40, 16);
        getContentPane().add(tx_cedula);
        tx_cedula.setBounds(60, 180, 110, 22);
        getContentPane().add(tx_placa);
        tx_placa.setBounds(330, 140, 100, 22);

        jLabel8.setText("placa");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 140, 30, 16);

        tx_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(tx_nombre);
        tx_nombre.setBounds(140, 80, 170, 22);

        jLabel11.setText("Numero celular");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 150, 87, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parking_Logo.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 350, 100, 80);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "automovil", "motocicleta", "cicla" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(490, 140, 100, 22);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/articulo-parqueadero.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 620, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nombreActionPerformed

    private void bn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bn_cancelarActionPerformed

    private void bn_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_registrarseActionPerformed
        // TODO add your handling code here:
         if(IND_NR==0){
           String sPlaca = tx_placa.getText();
          // int iId = Integer.parseInt(sid);
           String sNombre =tx_nombre.getText();
           String srecidencia =tx_residencia.getText();
           String scelular =tx_celular.getText();
           String smarca =tx_marca.getText();
           String smodelo =tx_modelo.getText();
           
           String qrq ="INSERT INTO registro (placa, nombre_completo, residencia, num_celular, modelo, marca ) values ('"+sPlaca+"','"+sNombre+"','"+srecidencia+"',"+scelular+",'"+smodelo+"','"+smarca+"')";
           System.out.println(qrq);
           try{
               stmt.executeUpdate(qrq);
               JOptionPane.showMessageDialog(null, "Registro grabado satisfactoriamente");
           }catch(Exception e){
               System.out.println("error al grabar "+e.getMessage());
           }
       }
    }//GEN-LAST:event_bn_registrarseActionPerformed

    private void tx_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_marcaActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn_cancelar;
    private javax.swing.JButton bn_registrarse;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JTextField tx_cedula;
    private javax.swing.JTextField tx_celular;
    private javax.swing.JTextField tx_marca;
    private javax.swing.JTextField tx_modelo;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_placa;
    private javax.swing.JTextField tx_residencia;
    // End of variables declaration//GEN-END:variables


}
