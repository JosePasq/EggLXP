/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ExcepcionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1Str = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2Str = scanner.nextLine();

        try {
            // Convierte las cadenas a enteros
            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);

           
          
                int resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
           
            
        } catch (InputMismatchException e) { /*se intenta leer un 
            valor de un tipo incorrecto utilizando un objeto 
          Scanner. Por ejemplo usuario ingresa un valor que no es 
            un número (como letras o caracteres especiales)*/
            System.out.println("Error: Ingrese un valor válido.");
             e.printStackTrace();
        } catch (NumberFormatException e) {
            /*se intenta convertir una cadena a un número y la cadena 
            no tiene el formato adecuado para ser interpretada como un 
            númeronválido. Esjemplo cadena contiene caracteres que no 
            son dígitos numéricos*/
            System.out.println("Error: Ingrese números válidos.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
             e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}


