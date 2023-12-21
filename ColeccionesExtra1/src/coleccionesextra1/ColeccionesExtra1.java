/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesextra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jopas
 */
public class ColeccionesExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numeros enteros. Para finalizar ingrese -99");

        int num;
        do {
            num = scanner.nextInt();
            if (num != -99) {
                numeros.add(num);
            }
            System.out.println("");
        } while (num != -99);

        for (Integer lista : numeros) {
            System.out.println(lista);
        }

        System.out.println("cantidad de numeros ingresados " + numeros.size());
        int suma = 0;
        for (int i : numeros) {
            suma += i;
        }
        System.out.println("la suma de todos los numeros ingresados es igual a " + suma);

        double promedio = suma / numeros.size();
        System.out.println("la media de todos los numeros ingresados es " + promedio);
    }

}
