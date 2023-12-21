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
public class Alojamientos {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    
    
    
}
