/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Entities.Alumno;
import java.util.ArrayList;
/**
 *
 * @author jopas
 */
public class AlumnoService {
    private ArrayList<Alumno> listaAlumnos= new ArrayList<>();
    
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

     public Alumno obtenerAlumno(int posicion) {
       
        if (posicion >= 0 && posicion < listaAlumnos.size()) {
            return listaAlumnos.get(posicion);
        } else {
                throw new IndexOutOfBoundsException("Error: Índice fuera de rango");
       
        }
    }
     
     
     
      public int obtenerCantidadAlumnos() {
          
      
        return listaAlumnos.size();
    
    
      }
}
