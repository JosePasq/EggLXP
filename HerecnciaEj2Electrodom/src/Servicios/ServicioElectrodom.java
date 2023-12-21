/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ServicioElectrodom {
    
    enum letrasAdmitidas {
        A, B, C, D, E, F
    }

    enum coloresAdmitidos {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }
    
    public char comprobarConsumo(char letra) {
        boolean letraCorrecta = false;
        
        for (ServicioElectrodom.letrasAdmitidas letraAdmitida : ServicioElectrodom.letrasAdmitidas.values()) {
            if (letraAdmitida.name().charAt(0) == letra || letraAdmitida.name().charAt(0) == Character.toUpperCase(letra)) {
                letraCorrecta = true;
                break;
            }
            if (!letraCorrecta) {
                letra = 'F'; // Asigna el valor 'F' al char letra
            }

            // Resto de tu código aquí, si es necesario
            return letra;
        }
    }    
    
    public String comprobarColor(String color) {
        boolean colorAdmitido = false;
        
        for (coloresAdmitidos colorEnum : coloresAdmitidos.values()) {
            if (colorEnum.name().equals(color.toUpperCase())) {
                colorAdmitido = true;
                break;
            }
        }
        
        if (!colorAdmitido) {
            color = "BLANCO";
        }
        
        return color;
    }
    
    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);
        Electrodomestico e = new Electrodomestico();
             
        System.out.println("ingrese color del electrodomestico");
        String color = scanner.next();
        String colorCorregido = comprobarColor(color);
        e.setColor(colorCorregido);
        
        System.out.println("ingrese consumo energetico del electrodomestico");
        char consumo= scanner.next().charAt(0);
        char consumoCorregido= comprobarConsumo(consumo);
        e.setConsumoEnergetico(consumoCorregido);
        
        System.out.println("ingrese peso del electrodomestico");
        e.setPeso(scanner.nextDouble());
        System.out.println("");
        
        
        e.setPrecio(1000);
        
    }
    
   public double precioFinal(char consumoEnergetico, double peso) {
          double precioFinal = 1000; // Precio base
    
    switch (consumoEnergetico) {
        case 'A':
            precioFinal += 1000;
            break;
        case 'B':
            precioFinal += 800;
            break;
        case 'C':
            precioFinal += 600;
            break;
        case 'D':
            precioFinal += 500;
            break;
        case 'E':
            precioFinal += 300;
            break;
        case 'F':
            precioFinal += 100;
            break;
    }

    if (peso >= 1 && peso <= 19) {
        precioFinal += 100;
    } else if (peso >= 20 && peso <= 49) {
        precioFinal += 500;
    } else if (peso >= 50 && peso <= 79) {
        precioFinal += 800;
    } else if (peso >= 80) {
        precioFinal += 1000;
    }
    
    return precioFinal;
}
       
    }
    

