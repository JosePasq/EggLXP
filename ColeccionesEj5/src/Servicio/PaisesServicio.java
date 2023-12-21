/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.HashSet;
import Entidad.Paises;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author jopas
 */
public class PaisesServicio {
    public TreeSet<Paises> cargarPaises(){
        TreeSet<Paises> listaPaises = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        char respuesta;

        do {
            Paises paises = new Paises();
            System.out.println("ingrese pais");
            paises.setNombre(scanner.nextLine());
            
            listaPaises.add(paises);
            
            System.out.println("¿Desea agregar otro pais? (S/N)");
            respuesta = scanner.next().charAt(0);
            scanner.nextLine();
             } while (respuesta == 'S' || respuesta == 's');

        return listaPaises;
            
        }
    public void mostrar (TreeSet<Paises> listaPaises){
       
        for(Paises paises: listaPaises){
            System.out.println(paises);
        }
    }
    
   /* public static Comparator<Paises> mostrarOrdenado = new Comparator<Paises>(){
        @Override
        public int compare(Paises p1, Paises p2){
            return p1.getNombre().compareTo(p2.getNombre());
        }
        
    };*/

    public void eliminarPais(TreeSet<Paises> listaPaises){
        Scanner scanner = new Scanner(System.in);
        System.out.println("desea eliminar algun pais?(S/N)");
            char resp = scanner.next().charAt(0);
        if(resp == 'S' || resp == 's'){
             scanner.nextLine();
        
        System.out.println("ingrese pais a eliminar");
        String paisAEliminar = scanner.nextLine();
      
        Paises paisBuscado = null;
        for(Paises paises: listaPaises){
        if (paises.getNombre().equalsIgnoreCase(paisAEliminar)){
            paisBuscado = paises;
            break;
            
        }
        
    }
    if(paisBuscado !=null){
        listaPaises.remove(paisBuscado);
        System.out.println("el pais ingresado ha sido eliminado");
    }else{
        System.out.println("el pais ingresado no estaba en la lista");
    }
    }

}
    
     

