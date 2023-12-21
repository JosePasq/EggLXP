/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class RelacionesEj2Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos*/
        Scanner scanner = new Scanner(System.in);

        ArrayList<Electrodomestico> listaProductos = new ArrayList();

        double sumatoriaPrecio=0;
             
        
        while (true) {
            System.out.println("Ingrese tipo de electrodomestico o escriba 'salir' para finalizar");
            String producto = scanner.nextLine().toLowerCase();

            if (producto.equals("salir")) {
                
            
                break; // Salir del bucle si el usuario ingresa "salir"
            }

            Electrodomestico nuevoProducto = null;

            if (producto.equals("lavadora")) {

                Lavadora lavadora1 = new Lavadora();
                lavadora1.crearLavadora();
                lavadora1.precioFinal();
                sumatoriaPrecio+= lavadora1.precioFinal();
                listaProductos.add(lavadora1);
                
            } else if (producto.equals("televisor")) {
                Televisor televisor1 = new Televisor();
                televisor1.crearTelevisor();
                televisor1.precioFinal();
                sumatoriaPrecio+= televisor1.precioFinal();
                listaProductos.add(televisor1);
            } else {
                System.out.println("Tipo de electrodomestico no válido.");

            }
            System.out.println("Resumen de productos y precios finales:");

            for (Electrodomestico electrodomestico : listaProductos) {
                System.out.println(electrodomestico);
                System.out.println("el precio final de todos los productos ingresados es " + sumatoriaPrecio);
            }

        }

    }
