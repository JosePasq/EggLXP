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
public class Carta {
    private int numero;
    private String palo;
    
    
    static final String[] PALOS ={"OROS","ESPADAS","BASTOS","COPAS"};

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo ;
    }
    
    
    
    
}
