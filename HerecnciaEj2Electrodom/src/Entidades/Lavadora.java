/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
    //TERMINAR EL CONSTRUCTOR BIEN

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    
}
