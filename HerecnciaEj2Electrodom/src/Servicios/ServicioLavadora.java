/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Servicios.ServicioElectrodom;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ServicioLavadora extends ServicioElectrodom{
    
    
    public void crearLavadora(Lavadora lavadora){
       ServicioElectrodom servicioElectrodom = new ServicioElectrodom();
    
       servicioElectrodom.crearElectrodomestico();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la carga de la lavadora en kg:");
    lavadora.setCarga(scanner.nextDouble()); 
    }
    
    
     public double precioFinal(Lavadora lavadora) {
        double precioFinal = super.precioFinal(lavadora);

        // Lógica adicional para la carga
        if (lavadora.getCarga() > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
        
        
        
        
        
        
        
        
        
        
    } 
}
