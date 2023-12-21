/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import Entities.Barcos;
import Entities.BarcosMotor;
import Entities.Veleros;
import Entities.Yates;
import java.util.Scanner;
 import java.time.format.DateTimeFormatter;       

/**
 *
 * @author jopas
 */
public class Alquiler {
    private String nombre;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barcos barcoAlquilado;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barcos barcoAlquilado) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoAlquilado = barcoAlquilado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barcos getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barcos barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barcoAlquilado=" + barcoAlquilado + '}';
    }
    
     Scanner scanner = new Scanner(System.in);
    
    public void solicitarDatosAlquiler(){
        System.out.println("indique fecha de inicio alquiler: dd/mm/aaa");
                String fechaInicio = scanner.nextLine();
                fechaAlquiler = LocalDate.parse(fechaInicio, formatter);
                
         System.out.println("Por favor, ingrese la fecha de finalización del alquiler (dd/MM/yyyy): ");
         String fechaFin = scanner.nextLine();
                fechaDevolucion = LocalDate.parse(fechaFin, formatter);
    }
    
    public double calculoModulo(){
        //para calcular cant de dias entre dos fechas
       long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
       double moduloBase = diasOcupacion * (barcoAlquilado.eslora*10);
       
       return moduloBase;
    }
    
    
    
    
}
