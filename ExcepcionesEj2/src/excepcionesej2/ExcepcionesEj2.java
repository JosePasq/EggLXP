/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej2;
import Entities.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

public class ExcepcionesEj2 {

   
    public static void main(String[] args) {
 
        AlumnoService aServ1= new AlumnoService();
         Scanner scanner = new Scanner(System.in);
         
         
        aServ1.agregarAlumno(new Alumno("juan", 20, "mate"));
        aServ1.agregarAlumno(new Alumno("maria", 10, "lengua"));
        aServ1.agregarAlumno(new Alumno("pedro", 20, "lengua"));
        aServ1.agregarAlumno(new Alumno("nacho", 21, "biologia"));
       
        
        
     System.out.print("Ingrese la posición del alumno a buscar: ");
        int posicionBuscada = scanner.nextInt();
        try{
       Alumno alumno=  aServ1.obtenerAlumno(posicionBuscada);
        
        if(alumno != null){
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Curso: " + alumno.getCurso());
        } 
        
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

        }
        
    }
