/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ServicioTienda {

    private HashMap<String, Double> listaProductos = new HashMap<>();

    public HashMap<String, Double> cargarProductos() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;

        do {

            Tienda tienda = new Tienda();
            System.out.println("ingrese nombre del producto");
            tienda.setNombre(scanner.nextLine());
            System.out.println("ingrese precio del producto");
            tienda.setPrecio(scanner.nextDouble());

            listaProductos.put(tienda.getNombre(), tienda.getPrecio());

            System.out.println("¿Desea agregar otro producto? (S/N)");
            respuesta = scanner.next().charAt(0);
            scanner.nextLine();
        } while (respuesta == 'S' || respuesta == 's');

        return listaProductos;
    }

    public void modificarPrecio(HashMap<String, Double> listaProductos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a modificar el precio:");
        String productoAModificar = scanner.nextLine();
        
        if (listaProductos.containsKey(productoAModificar)) {
        System.out.println("Ingrese el nuevo precio del producto:");
        double nuevoPrecio = scanner.nextDouble();
        listaProductos.put(productoAModificar, nuevoPrecio);
        System.out.println("Precio del producto actualizado correctamente.");
    } else {
        System.out.println("El producto no existe en la lista.");
    }
    }

    public void eliminarProducto(HashMap<String, Double> listaProductos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese producto a eliminar");
        String prodAEliminar = scanner.nextLine();

        if (listaProductos.containsKey(prodAEliminar)) {
            listaProductos.remove(prodAEliminar);
            System.out.println("El producto ha sido eliminado.");
        } else {
            System.out.println("El producto no existe en la lista.");
        }
    }

    public void mostrarproductoPrecio(HashMap<String, Double> listaProductos) {
        System.out.println("Listado de productos:");
        for (String producto : listaProductos.keySet()) {
            double precio = listaProductos.get(producto);
            System.out.println(producto + ": $" + precio);
        }
    }
}


