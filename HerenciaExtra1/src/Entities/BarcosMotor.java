
package Entities;


public class BarcosMotor extends Barcos{
    protected int potencia;
    private Alquiler alquiler;

    public BarcosMotor() {
    }

    public BarcosMotor(int potencia, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
        this.alquiler= alquiler;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
        double precioAlquilerBarco= moduloBase + potencia;
        return precioAlquilerBarco;
    }
    
}
