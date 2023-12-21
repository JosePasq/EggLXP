/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import Entities.Carta;
/**
 *
 * @author jopas
 */
public class Baraja {
    
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> repartidas;

    public Baraja(ArrayList<Carta> cartas, ArrayList<Carta> repartidas) {
        this.cartas = cartas;
        this.repartidas = repartidas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getRepartidas() {
        return repartidas;
    }

    public void setRepartidas(ArrayList<Carta> repartidas) {
        this.repartidas = repartidas;
    }

    
    

    public Baraja() {
        cartas = new ArrayList<>();
        for (String palo : Carta.PALOS) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }
    
}
