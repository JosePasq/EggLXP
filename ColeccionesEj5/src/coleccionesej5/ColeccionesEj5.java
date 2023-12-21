/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej5;
import Entidad.Paises;
import Servicio.PaisesServicio;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author jopas
 */
public class ColeccionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet<Paises> listaPaises;
       PaisesServicio paisesServicio = new PaisesServicio();
       
        listaPaises= paisesServicio.cargarPaises();
        
         System.out.println("listado de paises ingresados");
        paisesServicio.mostrar(listaPaises);
        
       /* TreeSet<Paises> listaPaisesOrdenada = new TreeSet<>(PaisesServicio.mostrarOrdenado);
        listaPaisesOrdenada.addAll(listaPaises);
        System.out.println("lista paises ordenados");*/
        
        paisesServicio.eliminarPais(listaPaises);
        
        System.out.println("lista paises luego de eliminar");
        paisesServicio.mostrar(listaPaises);
        
    }
    
        
        
    
}
}