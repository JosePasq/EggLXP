/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class Electrodomestico {
      protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
     enum letrasAdmitidas {
        A, B, C, D, E, F
    }
      enum coloresAdmitidos {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }
    
      public char comprobarConsumo(char letra) {
        boolean letraCorrecta = false;
        
        for (letrasAdmitidas letraAdmitida : letrasAdmitidas.values()) {
            if (letraAdmitida.name().charAt(0) == letra || letraAdmitida.name().charAt(0) == Character.toUpperCase(letra)) {
                letraCorrecta = true;
                break;
            }
        }
            if (!letraCorrecta) {
                letra = 'F'; // Asigna el valor 'F' al char letra
            }

            
            return letra;
        
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
       
             
        System.out.println("ingrese color del electrodomestico");
        String color = scanner.next();
        String colorCorregido = comprobarColor(color);
        setColor(colorCorregido);
        
        System.out.println("ingrese consumo energetico del electrodomestico");
        char consumo= scanner.next().charAt(0);
        char consumoCorregido= comprobarConsumo(consumo);
        setConsumoEnergetico(consumoCorregido);
        
        System.out.println("ingrese peso del electrodomestico");
       setPeso(scanner.nextDouble());
        System.out.println("");
        
        
        setPrecio(1000);
        
    }
    public double precioBase(char consumoEnergetico, double peso) {
    double precioBase = 1000; // Precio base

    switch (consumoEnergetico) {
        case 'A':
            precioBase += 1000;
            break;
        case 'B':
            precioBase += 800;
            break;
        case 'C':
            precioBase += 600;
            break;
        case 'D':
            precioBase += 500;
            break;
        case 'E':
            precioBase += 300;
            break;
        case 'F':
            precioBase += 100;
            break;
    }

    if (peso >= 1 && peso <= 19) {
        precioBase += 100;
    } else if (peso >= 20 && peso <= 49) {
        precioBase += 500;
    } else if (peso >= 50 && peso <= 79) {
        precioBase += 800;
    } else if (peso >= 80) {
        precioBase += 1000;
    }
this.precio = precioBase;
    return precioBase;

}
       
    }
    
}

