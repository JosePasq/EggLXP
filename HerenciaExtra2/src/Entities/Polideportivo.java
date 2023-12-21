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
public class Polideportivo extends Edificio{
    private String nombre;
    private String tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo, double ancho, double largo) {
        super(ancho, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }

    
    
    @Override
    public double calcularSuperficie() {
        double superficie= largo * ancho;
        return superficie;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2* (largo + ancho);
        return perimetro;
    }
    
    
    
}
