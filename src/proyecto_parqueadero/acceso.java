/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

import proyecto_parqueadero.Conexion;
import proyecto_parqueadero.Conexion;
import proyecto_parqueadero.Inicio;
import proyecto_parqueadero.Inicio;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author rojas
 */
public class acceso extends javax.swing.JFrame {
 private final String EMPTY = new String () ;
 String user,contra,Mensaje,u_admin="admin",contra_admin="admin",u_user="user",contra_user="user";
    Connection con=null;
    Statement stmt=null;
    /**
     * Creates new form acceso
     */
    public acceso() {
     
        initComponents();
        contraUser.setEchoChar('*');
        setLocationRelativeTo(null); // centrar el formulario en la pantalla
        this.setMinimumSize(new Dimension(650, 500)); 
        this.setResizable(false);
        this.setTitle("Contraseña");
      
        ((JPanel)getContentPane()).setOpaque(false);
        Mensaje="";
    }
  
/*
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomUser = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        contraUser = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setMaximumSize(new java.awt.Dimension(628, 439));
        setMinimumSize(new java.awt.Dimension(628, 439));
        setPreferredSize(new java.awt.Dimension(628, 439));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1211811974.png"))); // NOI18N
        jLabel1.setText("usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 260, 130, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Parking_Logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 40, 300, 80);

        nomUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUserActionPerformed(evt);
            }
        });
        getContentPane().add(nomUser);
        nomUser.setBounds(320, 280, 120, 30);

        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargando_logo_712_aa4.gif"))); // NOI18N
        btnEjecutar.setText("ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjecutar);
        btnEjecutar.setBounds(270, 370, 130, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_038490_256.png"))); // NOI18N
        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(90, 370, 130, 40);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kisspng-computer-icons-tango-desktop-project-scalable-vect-delete-cliparts-5aaf0ff6da38c3.7911196415214223268939.jpg"))); // NOI18N
        btnLimpiar.setText("limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(450, 370, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delayed_Lock_icon.png"))); // NOI18N
        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 310, 150, 60);

        contraUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraUserActionPerformed(evt);
            }
        });
        getContentPane().add(contraUser);
        contraUser.setBounds(320, 330, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/articulo-parqueadero.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 0, 610, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomUserActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        Mensaje="";
      if (nomUser.getText().equals(EMPTY) ||
   	contraUser.getText().equals(EMPTY) ){
   	//etiqAviso1.setText("Acceso denegado: campos en blanco");
      }else{
	   //etqaviso.setText("Acceso comprobado: ID Usuario y contraseña correcta");
           if((u_admin.equals(nomUser.getText().trim()))&(contra_admin.equals(contraUser.getText().trim()))){
               user="postgres";
                contra="123";
                Conexion objVideo = new Conexion(user,contra);
               // etiqAviso1.setForeground(new Color(255,255,255));
               // etiqAviso1.setText(objVideo.rAviso1());
                if (objVideo.indica_1() == 1 && objVideo.indica_2() == 1 ){
                   stmt= objVideo.stamt();
                   con = objVideo.con();
                   Inicio menu=new Inicio(con,stmt);
                   menu.setExtendedState(MAXIMIZED_BOTH);
                   menu.setVisible(true);
                   menu.setSize(550,400);
                   this.dispose();
                   //aca crear clases de administrador osea objetos de crud
                }
                else{
                    Mensaje="No se puede ejecutar ERRORRRRRRR::::";
                }
                
           }else{
               if((u_user.equals(nomUser.getText().trim()))&(contra_user.equals(contraUser.getText().trim()))){
                       user="postgres";
                        contra="123";
                        Conexion objVideo = new Conexion(user,contra);
                       // etiqAviso1.setForeground(new Color(255,255,255));
                       // etiqAviso1.setText(objVideo.rAviso1());
                        if (objVideo.indica_1() == 1 && objVideo.indica_2() == 1 ){
                           stmt= objVideo.stamt();
                           con = objVideo.con();
                           Inicio menu=new Inicio(con,stmt);
                           menu.setExtendedState(MAXIMIZED_BOTH);
                           menu.setVisible(true);
                           menu.setSize(550,400);
                           this.dispose();
                           
                           
                           //******************* crear clases de las vistas del usuario
                            Inicio a = new Inicio();
                            Registro b = new Registro();
                            a.setVisible(true);
                            b.setVisible(false);
                            a.resivir(b);
                            Ubicacion c = new Ubicacion();
                            c.setVisible(false);
                           //******************
                        }
                        else{
                            Mensaje="No se puede ejecutar ERRORRRRRRR::::";
                        }
                        
               }
           }
           
       }
   //    etiqAviso1.setText(Mensaje);
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
         nomUser.setText(EMPTY);          
         contraUser.setText(EMPTY);
         nomUser.requestFocus(); 
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
               // TODO add your handling code here:
                System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void contraUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraUserActionPerformed

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
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField contraUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomUser;
    // End of variables declaration//GEN-END:variables
}
