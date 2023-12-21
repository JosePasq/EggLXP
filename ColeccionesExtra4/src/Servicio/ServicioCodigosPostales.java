/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CodigosPostales
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ServicioCodigosPostales {
    
  HashMap<Integer, String> codPostales ;
Scanner input;

public void almacenarCodigosPostales(Integer codigo, String ciudad){
    codPostales = new HashMap<>();
    input= new Scanner(System.in).useDelimiter("\n");
    
    codPostales.put(5000, "Cordoba, Aregtina");
    codPostales.put(04520, "Almaria");
    codPostales.put(18213, "Granada, Espana, Espana");
    codPostales.put(29793, "Malaga, Espana");
    codPostales.put(5000, "Calvados, Francia");
    codPostales.put(632101, "Zamfara, Nigeria");
    codPostales.put(6490, "Encarnacion, Paraguay");
    codPostales.put(28340, "Itaperuna, Brasil");
    codPostales.put(20750, "Rio de haneiro, Brasil");
    codPostales.put(3364, "San Pedro, Argentina");
    
}
public void cargaPorUsuario(){
      for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un código postal: ");
            Integer codigo = input.nextInt();
            System.out.println("ingrese nombre de la ciudad");
            String nombre = input.next();
            codPostales.put(i, nombre);
            
            
}
}     
        
public void mostrarLista(){
    for (Integer key : codPostales.keySet()){
        String value = codPostales.get(key);
        System.out.println("Codigo postal: " + key + ", Ciudad: " + value);
       }
}
   
}
