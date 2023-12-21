
package Entities;

public class Barcos {
    protected int matricula;
    protected int eslora;
    protected int anio;

    public Barcos() {
    }

    public Barcos(int matricula, int eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
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

    @Override
    public String toString() {
        return "Barcos{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }
    
    
}
