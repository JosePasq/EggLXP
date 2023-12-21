/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import Entities.Jugador;
import Entities.RevolverDeAgua;
import java.util.Scanner;
/**
 *
 * @author jopas
 */
public class Juego {
     private ArrayList<Jugador> jugadores;
   private RevolverDeAgua revolver;

    public Juego() {
        jugadores = new ArrayList<>();
        revolver = new RevolverDeAgua();
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
   
     public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver, Juego juego) {
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
    }
        
        public void ronda(){
            for(Jugador jugador: jugadores){
                if (!jugador.isMojado()) {
                System.out.println("Es el turno de " + jugador.getNombre());
                System.out.print("Presiona enter para disparar...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();

                if (revolver.mojar()) {
                    jugador.setMojado(true);
                    System.out.println(jugador.getNombre() + " se ha mojado!");
                    return; // Juego terminado
                } else {
                    System.out.println(jugador.getNombre() + " se ha salvado.");
                }

                revolver.siguienteChorro();
    }
}


        }
