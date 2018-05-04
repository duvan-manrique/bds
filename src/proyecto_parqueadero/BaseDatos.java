/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;



import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author reide
 */
public class BaseDatos {
    Connection conexion = null;
    
    String contrasena ="123";
    String usuario = "postgres";
    
    public void ingreso(String script){
        PreparedStatement p = null;
        Connection conexion = obtenerConexion(usuario, contrasena);
        System.err.println(script);
        try{
            p = conexion.prepareStatement(script);
           
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ejecucion Completa");
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.err.println("No se pudo ejecutar la sentencia");
            System.err.println(script);
        }
    }
    
    public void consultar(JTable tabla, String script){
        Statement codigoSQL = null;
        ResultSet resultados = null;
        try{
            
            DefaultTableModel t = new DefaultTableModel();
            tabla.setModel(t);
             
            Connection conexion = obtenerConexion(usuario, contrasena);
            
            codigoSQL = conexion.createStatement();
            
            resultados = codigoSQL.executeQuery(script);
            ResultSetMetaData datos = resultados.getMetaData();
            
            int numeroColumnas = datos.getColumnCount();
            
            
            for(int i = 1; i <= numeroColumnas; i++){
                t.addColumn(datos.getColumnLabel(i));
            }
            
            while(resultados.next()){
                Object [] f = new Object[numeroColumnas];
                
                for(int i = 0; i < numeroColumnas ;i++){
                    
                    f[i] = resultados.getObject(i+1);
//                    Es por que: mmmm pos toco mirarlo d enuevo :'v
//                    para recorrer el "resultados.getObject(i)" dice que desde 1: entonces -> 1,2,3,4,5,6
//                    y para recorrer el "Object [] f" como es array hay que recorrerlo desde 0: entoces -> 0,1,2,3,4,5
                }
                t.addRow(f);
                
            }
//           si lo quiere como lo tenia solo se cambia esto
//            hay ta rata :V la f es earray aun no entiendo bien lo de las tablas como asi? es que me confundi en los indices pense que era aca el i+1
            
            codigoSQL.close();
            resultados.close();
            obtenerConexion(usuario, contrasena).close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }

   public Connection obtenerConexion(String usuario, String contrasena) {
       String driver = "org.postgresql.Driver";
       String url= "jdbc:postgresql://localhost:5432/parqueadero";
       Connection conexion = null;
	try {
	      Class.forName(driver).newInstance();
	      System.out.println("Se ha cargado correctamente el driver:"+driver);
	}
	catch (Exception e){
	   System.out.println("Se ha producido el siguiente error al cargar el driver:\n"+e.getMessage());
	}
        
	try{
	     conexion= DriverManager.getConnection(url,usuario,contrasena);
	     System.out.println("Se ha conectado correctamente a la base de datos");
	}
	catch(Exception e){
	    System.out.println("Se ha producido un error al momento de conectar la base de datos: \n"+e.getMessage());
	}
      return conexion;
    }
    
}
