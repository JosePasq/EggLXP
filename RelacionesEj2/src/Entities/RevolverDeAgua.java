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
public class RevolverDeAgua {
    private int posicionTambor;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionTambor, int posicionAgua) {
        this.posicionTambor = posicionTambor;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionTambor=" + posicionTambor + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
}
