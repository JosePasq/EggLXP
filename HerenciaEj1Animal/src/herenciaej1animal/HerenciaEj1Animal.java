/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1animal;
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
/**
 *
 * @author jopas
 */
public class HerenciaEj1Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal perro1= new Perro("Stich", "carnivoro",15, "doberman");
       perro1.alimentarse();
       
       Animal perro2=new Perro("Teddy", "croquetas", 10, "chihuahua");
       perro2.alimentarse();
       
       Animal gato1= new Gato("Pelusa", "galletas", 15, "siames");
       gato1.alimentarse();
       
      Animal caballo1= new Caballo("Spark", "pasto", 25, "Fino");
      caballo1.alimentarse();
    
    }
    
}
