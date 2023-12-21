/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesejemplo;
import Entity.Dni;
import Entity.Persona;
       
/**
 *
 * @author jopas
 */
public class RelacionesEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni dni1 = new Dni(25921555);
        
        Persona persona1= new Persona ("Juan", "Perez", dni1);
        
        
        
    }
    
}
