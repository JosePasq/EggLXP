/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2;
import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import java.util.ArrayList;
        
/**
 *
 * @author jopas
 */
public class HerenciaExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  ArrayList<Edificio> listaEdificios = new ArrayList();
  
  Polideportivo p1 = new Polideportivo ("DeporV", "techado", 20, 30);
  Polideportivo p2 = new Polideportivo ("Altos", "abierto", 15, 30);
  EdificioDeOficinas e1= new EdificioDeOficinas(5, 6, 4, 15, 20);
  EdificioDeOficinas e2= new EdificioDeOficinas(6, 4, 8, 10, 20);
  
  listaEdificios.add(e1);
  listaEdificios.add(e2);
  listaEdificios.add(p1);
  listaEdificios.add(p2);
  
        for (Edificio edificio : listaEdificios) {
            System.out.println("Información del edificio:");
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Perímetro: " + edificio.calcularPerimetro());

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                System.out.println("Nombre: " + poli.getNombre());
                System.out.println("Tipo: " + poli.getTipo());
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edifOficinas = (EdificioDeOficinas) edificio;
                System.out.println("Número de oficinas por piso: " + edifOficinas.getNrOficinasPorPiso());
                System.out.println("Cantidad de personas por oficina: " + edifOficinas.getCantPeronasPorOficina());
                System.out.println("Número de pisos: " + edifOficinas.getPisos());
            }

            System.out.println("--------------");
        }

        // Tabla para mostrar los resultados finales
        System.out.println("Resultados finales:");
        System.out.println("--------------------------------------------------------");
        System.out.println("|   Edificio    | Superficie | Perímetro | Información Adicional |");
        System.out.println("--------------------------------------------------------");
        for (Edificio edificio : listaEdificios) {
            String nombreEdificio = "";
            String informacionAdicional = "";

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                nombreEdificio = poli.getNombre();
                informacionAdicional = "Tipo: " + poli.getTipo();
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edifOficinas = (EdificioDeOficinas) edificio;
                nombreEdificio = "Edificio de Oficinas";
                informacionAdicional = "Número de oficinas por piso: " + edifOficinas.getNrOficinasPorPiso() +
                        ", Personas por oficina: " + edifOficinas.getCantPeronasPorOficina() +
                        ", Pisos: " + edifOficinas.getPisos();
            }

            System.out.printf("| %-13s | %-10.2f | %-9.2f | %-20s |\n", nombreEdificio, edificio.calcularSuperficie(), edificio.calcularPerimetro(), informacionAdicional);
        }
        System.out.println("--------------------------------------------------------");
    }
}



