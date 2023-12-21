/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej3;

import Entities.Circulo;
import Entities.Rectangulo;
import Interfaces.CalculosFormas;

/**
 *
 * @author jopas
 */
public class HerenciaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0, 6.8);
         System.out.println("Medidas del círculo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Diámetro: " + circulo.getDiametro());
        System.out.println("Area del circulo= " + circulo.calcularArea());
        System.out.println("Perimetro del circulo= " + circulo.calcularPerimetro());;
        
        
        System.out.println("");
        
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        System.out.println("Medidas del rectángulo:");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area del rectangunlo= " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo= " + rectangulo.calcularPerimetro());

    }
