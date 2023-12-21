/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2b;
import Entities.Juego;
import Entities.Jugador;
import Entities.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jopas
 */
public class RelacionesEj2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1, "Jugador 1"));
        jugadores.add(new Jugador(2, "Jugador 2"));
        jugadores.add(new Jugador(3, "Jugador 3"));
        jugadores.add(new Jugador(4, "Jugador 4"));
        jugadores.add(new Jugador(5, "Jugador 5"));
        jugadores.add(new Jugador(6, "Jugador 6"));

        // Crear revolver y llenarlo
        RevolverDeAgua revolver = new RevolverDeAgua();
       

        // Crear juego
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver, juego);

        // Iniciar ronda
        juego.ronda();
    }

