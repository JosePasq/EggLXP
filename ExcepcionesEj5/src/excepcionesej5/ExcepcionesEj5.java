/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ExcepcionesEj5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(500) + 1;
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        System.out.println("Para adivinar el número secreto entre 1 y 500, ingrese un número.");

        try {
            int eleccion=-1;
            do {
                contador++; // Incrementa el contador en cada iteración.
                try {
                    eleccion = scanner.nextInt();
                    if (eleccion >= 1 && eleccion <= 500) {
                        if (eleccion == numeroSecreto) {
                            System.out.println("¡Felicitaciones! Has adivinado el número secreto. Has realizado " + contador + " intentos.");
                        } else {
                            if (eleccion > numeroSecreto) {
                                System.out.println("El número a descubrir es menor al ingresado.");
                            } else {
                                System.out.println("El número a descubrir es mayor al ingresado.");
                            }
                        }
                    } else {
                        System.out.println("Ingrese un número dentro del rango [1, 500].");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un valor válido.");
                    scanner.next(); // Limpiar el búfer del Scanner para evitar un bucle infinito.
                }
            } while (eleccion != numeroSecreto);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor válido.");
        }
    }
}