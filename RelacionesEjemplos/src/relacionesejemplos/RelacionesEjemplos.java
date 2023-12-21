/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesejemplos;
import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

       
/**
 *
 * @author jopas
 */
public class RelacionesEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal>listadoAnimales = new ArrayList();
        Animal a= new Animal();
        Animal b= new Perro();
        Animal c= new Gato();
        
        listadoAnimales.add(a);
        listadoAnimales.add(b);
        listadoAnimales.add(c);

        for (Animal animal : listadoAnimales) {
            animal.hacerRuido();
        }
    }
    }
    

