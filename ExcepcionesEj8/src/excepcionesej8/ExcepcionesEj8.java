/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej8;
import Entities.ClassUno;
/**
 *
 * @author jopas
 */
public class ExcepcionesEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println("Excepcion en metodo() ") ;
e.printStackTrace();
}
    }
}
