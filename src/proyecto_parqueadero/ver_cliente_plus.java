/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author rojas
 */
public class ver_cliente_plus extends javax.swing.JFrame {

    /**
     * Creates new form ver_cliente_plus
     */
    Registro registro;
    admindentro admin;
    public ver_cliente_plus(Registro registro1) {
        initComponents();
        registro =registro1;
        TableModel tabla = registro.consultar("select * from registro;").getModel();
        tabla_clientes_plus.setModel(tabla);
       // System.err.println(tabla_clientes_plus);
    }
    public void resibir_admin(admindentro admin1){
        admin=admin1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tabla_clientes = new javax.swing.JScrollPane();
        tabla_clientes_plus = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(777, 485));
        setMinimumSize(new java.awt.Dimension(777, 485));
        setPreferredSize(new java.awt.Dimension(777, 485));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Business-Restaurant.png"))); // NOI18N
        jLabel3.setText("Bienvenido  administrador");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parking_Logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 0, 290, 90);

        tabla_clientes_plus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_clientes_plus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_clientes.setViewportView(tabla_clientes_plus);

        getContentPane().add(tabla_clientes);
        tabla_clientes.setBounds(0, 190, 760, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/articulo-parqueadero.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -100, 610, 420);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 160, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    //BaseDatos register = new BaseDatos();
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
            java.util.logging.Logger.getLogger(ver_cliente_plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver_cliente_plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver_cliente_plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_cliente_plus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ver_cliente_plus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane tabla_clientes;
    private javax.swing.JTable tabla_clientes_plus;
    // End of variables declaration//GEN-END:variables
}
