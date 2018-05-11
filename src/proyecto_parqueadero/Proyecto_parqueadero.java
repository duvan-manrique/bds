/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

import java.time.LocalTime;

/**
 *
 * @author home
 */
public class Proyecto_parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        acceso acceso1 = new acceso();
        acceso1.setVisible(true);
        
        /**
         * Tutorial de horas
         */
        
        // Hora actual
        //LocalTime horaActual = LocalTime.now();
        // La hora, los minutos, segundos, lo trabaja en hora militar
        //System.out.println("Hora: "+horaActual.getHour());
        //System.out.println("Minutos: "+horaActual.getMinute());
        // Como se enviaria a base de datos?
        //System.out.println(horaActual.toString());
        
    }
    
}
