/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import java.util.Scanner;
import Entities.Juego;
import Entities.Jugador;
import Entities.RevolverDeAgua;
import Service.JuegoService;
import java.util.ArrayList;

/**
 *
 * @author jopas
 */
public class RelacionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese nuemro de jugadores");
        int numJugadores = scanner.nextInt();
        numJugadores= Math.min(Math.max(numJugadores, 1), 6);

        
        ArrayList<Jugador> jugadores = new ArrayList<>();
         for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);

        while (true) {
            juego.ronda();
        }
    }
        
    }
    
}
