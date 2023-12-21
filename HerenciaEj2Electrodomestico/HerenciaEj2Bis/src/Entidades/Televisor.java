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
public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
       return super.toString() + " Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }

   
    
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        Scanner scanner = new Scanner(System.in);
        
    System.out.println("ingrese resolucion en  pulgadas");
    int resolucion = scanner.nextInt();
     setResolucion(resolucion);
 scanner.nextLine();
    
        System.out.println("indique si el tv tiene sintonizador. S/N");
        String resp = scanner.nextLine();
         if (resp.equals("S")) {
        setSintonizador(true);
    } else {
        setSintonizador(false);
    }
    }
    
    
    public double precioFinal(){
       double precioFinal = super.precioBase(getConsumoEnergetico(), getPeso());
   
       if (getResolucion() > 40) {
        precioFinal += (precioFinal/100*30);
        
    }
       if (isSintonizador()) {
        precioFinal += 500;
       }
       this.precio = precioFinal;
        return precioFinal;
    }
    
}
