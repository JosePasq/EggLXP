/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesextra2;

import Entidad.CantanteFamoso;
import Servicio.ServicioCantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ColeccionesExtra2 {

    public static void main(String[] args) {
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();
        ServicioCantanteFamoso servicio = new ServicioCantanteFamoso();

        System.out.println("CARGA DE CANTANTE FAMOSOS");
        servicio.crearLista();
        System.out.println("");
        System.out.println("LISTA RESULTANTE");
        servicio.mostrarLista();
        System.out.println("");

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        while (continuar) {
            System.out.println("MENU");
            System.out.println("1.agregar un cantante");
            System.out.println("2.mostrar todos los cantantes");
            System.out.println("3. eliminar un cantante");
            System.out.println("4. salir del programa");

            eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {
                case 1:
                    servicio.agregarCantante();
                    break;
                case 2:
                    servicio.mostrarLista();
                    break;
                case 3:
                    servicio.eliminarCantante();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("LISTA RESULTANTE");
                    servicio.mostrarLista();
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("ingrese una opcion correcta");
            }

        }
    }

}
