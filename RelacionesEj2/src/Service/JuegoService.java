/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Random;
import Entities.Juego;
import Entities.Jugador;
import Entities.RevolverDeAgua;
import java.util.ArrayList;
/**
 *
 * @author jopas
 */
public class JuegoService {
    RevolverDeAgua revolver = new RevolverDeAgua();
    ArrayList<Jugador> jugadores = new ArrayList();  
    
    public void llenarRevolver(){
        Random random = new Random();
        revolver.setPosicionTambor(random.nextInt(6)+1);
        revolver.setPosicionAgua(random.nextInt(6)+1);
        
    }
    public boolean mojar(){
        return revolver.getPosicionAgua() == revolver.getPosicionTambor();
       
    }
    
    public void siguienteChorro(){
       int nuevaPosicion = (revolver.getPosicionTambor() + 1) % 6;
    revolver.setPosicionTambor(nuevaPosicion);
        
    }
      
  
}
    
        public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver, Juego juego) {
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
    }
        
        public void ronda(){
            for(Jugador jugador: jugadores){
                if(!jugador.isMojado()){
                    System.out.println("siguiente jugador");
                }else{
                    System.out.println("juego terminado");
                    return;
                }
                
            }
        }
}
