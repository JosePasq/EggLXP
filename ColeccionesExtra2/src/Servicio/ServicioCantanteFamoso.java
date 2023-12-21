

package Servicio;
import java.util.ArrayList;
import Entidad.CantanteFamoso;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ServicioCantanteFamoso {
     private ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();
     
             public void crearLista(){
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= 5; i++) {
        
            CantanteFamoso cantanteFamoso = new CantanteFamoso();
        
            System.out.println("Ingrese nombre del cantante " + i);
           cantanteFamoso.setNombre(scanner.nextLine());
            System.out.println("Ingrese disco más vendido del cantante " + i);
            cantanteFamoso.setDiscoConMasVentas(scanner.nextLine());
            
            listaCantantes.add(cantanteFamoso);
        }
    
     }

    
 public void mostrarLista(){
     for(CantanteFamoso cantanteFamoso: this.listaCantantes){
          System.out.println("Nombre: " + cantanteFamoso.getNombre() + ", Disco más vendido: " + cantanteFamoso.getDiscoConMasVentas());
     }
 }
 public void agregarCantante( ){
     Scanner scanner = new Scanner(System.in);
       CantanteFamoso cantanteFamoso = new CantanteFamoso();
        
            System.out.println("Ingrese nombre del cantante a agregar");
           cantanteFamoso.setNombre(scanner.nextLine());
            System.out.println("Ingrese disco más vendido del cantante ");
            cantanteFamoso.setDiscoConMasVentas(scanner.nextLine());
            
            this.listaCantantes.add(cantanteFamoso);
 
 }
 
 public void eliminarCantante (){
      Scanner scanner = new Scanner(System.in);
     System.out.println("ingrese nombre del cantante a eliminar");
     String cantanteAEliminar = scanner.nextLine();
     
     CantanteFamoso cantanteEncontrado = null;
     
     for(CantanteFamoso cantanteFamoso: this.listaCantantes){
     if(cantanteFamoso.getNombre().equalsIgnoreCase(cantanteAEliminar)){
        cantanteEncontrado = cantanteFamoso;
            break;
        }
    }

    if (cantanteEncontrado != null) {
        this.listaCantantes.remove(cantanteEncontrado);
        System.out.println("Cantante eliminado correctamente.");
    } else {
        System.out.println("El cantante no fue encontrado en la lista.");
    }
 }
 
}


