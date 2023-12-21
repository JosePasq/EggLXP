
package Entities;


public class Yates extends BarcosMotor{
    private int camarotes;
    private Alquiler alquiler;

    public Yates() {
    }

    public Yates(int camarotes, Alquiler alquiler, int potencia, int matricula, int eslora, int anio) {
        super(potencia, matricula, eslora, anio);
        this.camarotes = camarotes;
        this.alquiler = alquiler;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
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

    

    
    public double calcularPrecio(){
        double moduloBase = alquiler.calculoModulo();
        double precioAlquilerYate= moduloBase + potencia + camarotes;
        return precioAlquilerYate;
    }
}
