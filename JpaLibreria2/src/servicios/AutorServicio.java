
package servicios;

import entidades.Autor;
import java.util.Scanner;
import persistencia.AutorDAO;


public class AutorServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorDAO dao = new AutorDAO();
   
    public void crearAutor(){
          Autor autor = new Autor();
        do {
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.next();
            autor.setNombre(nombre);
            if (dao.validarNombreAutor(nombre).isEmpty()) {
                break;
            } else {
                System.out.println("Nombre de autor ya registrado.");
            }
        } while (true);

        autor.setAlta(true);
}
