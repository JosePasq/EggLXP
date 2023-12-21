/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1;
import Entities.Alquiler; 
import Entities.Barcos; 
import Entities.BarcosMotor; 
import Entities.Veleros; 
import Entities.Yates; 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class HerenciaExtra1 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        ArrayList<Barcos> lista = new ArrayList();
        
        Veleros v1 = new Veleros(11, 20, 2021, 3);
        Veleros v2 = new Veleros(15, 40, 2019, 4);
        Veleros v3 = new Veleros(18, 30, 2018, 5);
        BarcosMotor b1= new BarcosMotor(20, 30, 2015,100);
        BarcosMotor b2= new BarcosMotor(21, 20, 2020,150);
        BarcosMotor b3= new BarcosMotor(22, 35, 2015,100);
        Yates y1= new Yates(30, null, 20, 2020, 100, 2);
        Yates y2= new Yates(33, null, 30, 2022, 100, 3);
        Yates y3= new Yates(35, null, 40, 2023, 100, 4);
        
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        lista.add(y1);
        lista.add(y2);
        lista.add(y3);
        
        System.out.println("Listado de barcos disponibles");
        for (Barcos barcos: lista){
           System.out.println(barcos);
           
        }
        System.out.println("que barco desea alquilar? v1/v2/v3/b1/b2/b3/y1/y2/y3");
       String opcionElegida = scanner.nextLine();
       Alquiler a1= new Alquiler();
       
        switch(opcionElegida){
            case "v1":
                a1.solicitarDatosAlquiler();
                double precioV1 = v1.calcularPrecio();
                System.out.println("el precio del barco seleccionado es "+ precioV1);
                
                  break;      
            case "v2":
            
            case "v3":
                
        }
        
     
     
    }
    
}
