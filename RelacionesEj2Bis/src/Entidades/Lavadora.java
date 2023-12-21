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
public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " Lavadora{" + "carga=" + carga + '}';
    }

    
    
     public void crearLavadora(){
      Scanner scanner = new Scanner(System.in);
     super.crearElectrodomestico();
   
    System.out.println("Ingrese la carga de la lavadora en kg:");
    double carga=scanner.nextDouble(); 
    setCarga(carga);
    }
     
    
public double precioFinal() {
    double precioFinal = super.precioBase(getConsumoEnergetico(), getPeso());

    // Lógica adicional para la carga
    if (getCarga() > 30) {
        precioFinal += 500;
    }
this.precio = precioFinal;
        return precioFinal;
    }
        
        
        
        
    
}