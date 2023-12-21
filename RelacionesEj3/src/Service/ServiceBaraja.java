/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Entities.Baraja;
import Entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jopas
 */
public class ServiceBaraja {
    private int indiceActual= 0;
    
    public void barajar(ArrayList<Carta> cartas){
        Collections.shuffle(cartas);
    }
    public void siguienteCarta(ArrayList<Carta> carta, ArrayList<Carta> repartidas){
        
    }
    
    public int cartasDisponibles(ArrayList<Carta> cartas){
        return cartas.size();
    }
    
    public void darCartas(ArrayList<Carta> carta, ArrayList<Carta> repartidas){
        
    } 
    public void cartasMonton(ArrayList<Carta> repartidas){
        if()
         System.out.println("cartas repartidas");
        for (Carta lista: repartidas){
            System.out.println(repartidas);
        }
    }
    public void mostrarBaraja(ArrayList<Carta> cartas){
        System.out.println("cartas aun no repartidas");
        for (Carta lista: cartas){
            System.out.println(cartas);
        }
    }
}

