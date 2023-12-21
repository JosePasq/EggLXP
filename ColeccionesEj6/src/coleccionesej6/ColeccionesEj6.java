/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej6;

import Entidad.Tienda;
import Servicio.ServicioTienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ColeccionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Double> listaProductos = new HashMap<>();
        ServicioTienda servicioTienda = new ServicioTienda();

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        while (continuar) {
            System.out.println("MENU");
            System.out.println("1. cargar productos");
            System.out.println("2. modificar precios");
            System.out.println("3. eliminar productos");
            System.out.println("4. mostrar listado de productos");
            System.out.println("5. salir");
            System.out.println("");

            eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {
                case 1:
                    listaProductos = servicioTienda.cargarProductos();
                    break;
                case 2:
                    servicioTienda.modificarPrecio(listaProductos);
                    break;
                case 3:
                    servicioTienda.eliminarProducto(listaProductos);
                    break;
                case 4:
                    servicioTienda.mostrarproductoPrecio(listaProductos);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("ingrese una opcion correcta");
            }
        }

    }

}
