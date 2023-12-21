/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;

import Entities.Perro;
import Entities.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jopas
 */

import java.util.List;
public class RelacionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        
        Perro p1 = new Perro();
        p1.setNombre("lola");
        p1.setRaza(Perro.Raza.CANICHE);
        p1.setTamanio(Perro.Tamanio.CHICO);
        p1.setEdad(2);

        Perro p2 = new Perro();
        p2.setNombre("Pipo");
        p2.setRaza(Perro.Raza.DALMATA);
        p2.setTamanio(Perro.Tamanio.MEDIANO);
        p2.setEdad(1);

        Perro p3 = new Perro();
        p3.setNombre("Manchas");
        p3.setRaza(Perro.Raza.PITBUL);
        p3.setTamanio(Perro.Tamanio.MEDIANO);
        p3.setEdad(5);

        Perro p4 = new Perro();
        p4.setNombre("caco");
        p4.setRaza(Perro.Raza.SALCHICHA);
        p4.setTamanio(Perro.Tamanio.CHICO);
        p4.setEdad(3);

        List<Perro> listadoPerros = new ArrayList();
        listadoPerros.add(p4);
        listadoPerros.add(p3);
        listadoPerros.add(p2);
        listadoPerros.add(p1);
        
        

        Persona persona1 = new Persona("Maria", "Lopez", 20, 40222333);
        Persona persona2 = new Persona("Juan", "Perez", 30, 38999666);
        Persona persona3 = new Persona("Ana", "Martinez", 60, 55544412);

        
        List<Persona> listadoPersonas = new ArrayList();
        listadoPersonas.add(persona3);
        listadoPersonas.add(persona2);
        listadoPersonas.add(persona1);
        
        for(int i=0; i<listadoPersonas.size(); i++){
             Persona persona = listadoPersonas.get(i);
            System.out.println("Hola " + persona.getNombre() + ", Que perro desea adoptar? indique el nombre");
            for(Perro lista: listadoPerros){
                System.out.println(lista);
            }
            String eleccion= scanner.nextLine();
            
           for (int j = 0; j < listadoPerros.size(); j++) {
        if (listadoPerros.get(j).getNombre().equals(eleccion)) {
            listadoPerros.remove(j);
            break;
        }
    }
        
        }
        
        
    }
    }
