/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author jopas
 */
public class Paises implements Comparable<Paises> {
 private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + '}';
    }

    
    
    @Override
    public int compareTo(Paises otroPais) {
        return this.nombre.compareTo(otroPais.getNombre());
    }
 
 
    
    

}
