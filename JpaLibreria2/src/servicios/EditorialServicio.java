
package servicios;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.AutorDAO;
import persistencia.DAO;


public class EditorialServicio {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorDAO dao = new AutorDAO();
    
    public void crearEditorial(){
        Editorial editorial = new Editorial();
        System.out.println("ingrese nombre de la editorial");
        String nombre = leer.next();
        editorial.setNombre(nombre);
        
        
    }
    
}
