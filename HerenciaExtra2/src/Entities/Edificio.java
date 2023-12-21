/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author jopas
 */
public abstract class Edificio {
    protected double ancho;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public abstract double calcularSuperficie ();
    public abstract double calcularPerimetro();
    
    

            
            
}
