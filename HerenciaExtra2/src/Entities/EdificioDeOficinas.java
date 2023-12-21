/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.Scanner;
/**
 *
 * @author jopas
 */
public class EdificioDeOficinas extends Edificio {
    private int nrOficinasPorPiso;
    private int cantPersonasPorOficina;
    private int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nrOficinas, int cantPeronasPorOficina, int pisos, double ancho, double largo) {
        super(ancho, largo);
        this.nrOficinasPorPiso = nrOficinasPorPiso;
        this.cantPersonasPorOficina = cantPeronasPorOficina;
        this.pisos = pisos;
    }

    public int getNrOficinasPorPiso() {
        return nrOficinasPorPiso;
    }

    public void setNrOficinasPorPiso(int nrOficinasPorPiso) {
        this.nrOficinasPorPiso = nrOficinasPorPiso;
    }

    public int getCantPeronasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPeronasPorOficina(int cantPeronasPorOficina) {
        this.cantPersonasPorOficina = cantPeronasPorOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
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
        return "EdificioDeOficinas{" + "nrOficinasPorPiso=" + nrOficinasPorPiso + ", cantPersonasPorOficina=" + cantPersonasPorOficina + ", pisos=" + pisos + '}';
    }

    
    
    @Override
    public double calcularSuperficie() {
    double superficiePorPlanta=  largo*ancho;
    double supTotal= superficiePorPlanta * pisos;
    return supTotal;
            }

    @Override
    public double calcularPerimetro() {
    double perimetro = 2* (largo + ancho);
        return perimetro;
        }
    
    public void cantPersonas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cantidad de personas que entran por oficina");
        cantPersonasPorOficina=scanner.nextInt();
        System.out.println("ingrese numero de oficinas por piso");
        nrOficinasPorPiso = scanner.nextInt();
        
        System.out.println("el numero de personas que puede trabajar por piso es igual a "+ cantPersonasPorOficina * nrOficinasPorPiso);
        System.out.println("el numero total de personas que pueden trabajar en el edificio es igual a " +cantPersonasPorOficina * nrOficinasPorPiso* pisos);
    }
    
    
    
    
    
    
}
