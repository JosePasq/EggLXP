
package Entities;
import Entities.Alquiler;


public class Veleros extends Barcos{
    private int mastiles;
    private Alquiler alquiler;

    public Veleros() {
    }

    public Veleros(int mastiles, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
        this.alquiler= alquiler;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
    public double calcularPrecio(){
        double moduloBase = alquiler.calculoModulo();
        double precioAlquilerVelero= moduloBase + mastiles ;
        return precioAlquilerVelero;
    }
    
}
