/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

/**
 *
 * @author home
 */
public class Proyecto_parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio a = new Inicio();
        Registro b = new Registro();
        a.setVisible(true);
        b.setVisible(false);
        a.resivir(b);
        Ubicacion c = new Ubicacion();
        c.setVisible(true);
        
        
    }
    
}
