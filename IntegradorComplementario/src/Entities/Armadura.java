/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
 
/**
 *
 * @author jopas
 */
public class Armadura {
     private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int medidaDeDureza;
    private int nivelSalud;
    private int bateria;
    
    private int consumoBotas;
    private int consumoGuantes;
    private int consumoPropulsores;
    private int consumoRepulsores;
    private int consumoEnergiaConsola;
    private int consumoEnergiaSintetizador;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int medidaDeDureza, int nivelSalud, int generador, int consumoBotas, int consumoGuantes, int consumoPropulsores, int consumoRepulsores, int consumoEnergiaConsola, int consumoEnergiaSintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.medidaDeDureza = medidaDeDureza;
        this.nivelSalud = nivelSalud;
        this.bateria = generador;
        this.consumoBotas = consumoBotas;
        this.consumoGuantes = consumoGuantes;
        this.consumoPropulsores = consumoPropulsores;
        this.consumoRepulsores = consumoRepulsores;
        this.consumoEnergiaConsola = consumoEnergiaConsola;
        this.consumoEnergiaSintetizador = consumoEnergiaSintetizador;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getMedidaDeDureza() {
        return medidaDeDureza;
    }

    public void setMedidaDeDureza(int medidaDeDureza) {
        this.medidaDeDureza = medidaDeDureza;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getGenerador() {
        return bateria;
    }

    public void setGenerador(int generador) {
        this.bateria = generador;
    }

    public int getConsumoBotas() {
        return consumoBotas;
    }

    public void setConsumoBotas(int consumoBotas) {
        this.consumoBotas = consumoBotas;
    }

    public int getConsumoGuantes() {
        return consumoGuantes;
    }

    public void setConsumoGuantes(int consumoGuantes) {
        this.consumoGuantes = consumoGuantes;
    }

    public int getConsumoPropulsores() {
        return consumoPropulsores;
    }

    public void setConsumoPropulsores(int consumoPropulsores) {
        this.consumoPropulsores = consumoPropulsores;
    }

    public int getConsumoRepulsores() {
        return consumoRepulsores;
    }

    public void setConsumoRepulsores(int consumoRepulsores) {
        this.consumoRepulsores = consumoRepulsores;
    }

    public int getConsumoEnergiaConsola() {
        return consumoEnergiaConsola;
    }

    public void setConsumoEnergiaConsola(int consumoEnergiaConsola) {
        this.consumoEnergiaConsola = consumoEnergiaConsola;
    }

    public int getConsumoEnergiaSintetizador() {
        return consumoEnergiaSintetizador;
    }

    public void setConsumoEnergiaSintetizador(int consumoEnergiaSintetizador) {
        this.consumoEnergiaSintetizador = consumoEnergiaSintetizador;
    }
    
    
    
    public void caminar(int tiempo, int intensidad){
         int consumoTotal = consumoBotas * tiempo * intensidad;
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para caminar
        // Realiza la acción de caminar con la intensidad dada
        System.out.println("La armadura está caminando con intensidad " + intensidad);

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
         throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para caminar con intensidad " + intensidad);
    }
}
    public void correr(int tiempo, int intensidad){
         int consumoTotal = (consumoBotas*2) * tiempo * intensidad;
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para correr
        // Realiza la acción de correr con la intensidad dada
        System.out.println("La armadura está corriendo con intensidad " + intensidad);

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
        throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para correr con intensidad " + intensidad);
    }
    }
    public void propulsar(int tiempo, int intensidad){
        int consumoTotal = (consumoPropulsores*3) * tiempo * intensidad;
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para propulsarse
        // Realiza la acción de propulsarse con la intensidad dada
        System.out.println("La armadura se esta propulsando con intensidad " + intensidad);

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
        throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para propulsarse con intensidad " + intensidad);
    }
    }
    public void volar(int tiempo, int intensidad){
              int consumoTotal = ((consumoBotas*3) * tiempo * intensidad)+((consumoGuantes*2)*tiempo*intensidad);
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para volar
        // Realiza la acción de volar con la intensidad dada
        System.out.println("La armadura  esta volando con intensidad " + intensidad);

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
        throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para volar con intensidad " + intensidad);
    }
    }
    
      public void disparar(int tiempo){
           int consumoTotal = (consumoGuantes*3)*tiempo;
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para disparar
        // Realiza la acción de disparar con la intensidad dada
        System.out.println("La armadura  esta disparando");

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
       throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para disparar");
    }}
    
    
    public void escribir(int tiempo){
      int consumoTotal = (consumoEnergiaConsola)*tiempo;
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para escribir
                System.out.println("La armadura  esta escribiendo");

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
        throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para escribir");
    }  
    }
    public void leer(int tiempo){
     int consumoTotal = (consumoEnergiaConsola)*tiempo;
         
          if (bateria >= consumoTotal) {
        // La armadura tiene suficiente energía para leer
                System.out.println("La armadura  esta leyendo");

        // Actualiza el nivel de energía
        bateria -= consumoTotal;
    } else {
        
        throw new EnergiaInsuficienteException("La armadura no tiene suficiente energía para leer");
    }     
    }
    

    public int energiaRestante(){
         int consumoTotal = (consumoBotas + consumoGuantes + consumoPropulsores + consumoRepulsores
            + consumoEnergiaConsola + consumoEnergiaSintetizador);

    // Resta el consumo total de la batería actual
    int energiaRestante = bateria - consumoTotal;

        if (energiaRestante < 0) {
        energiaRestante = 0;
    }

    return energiaRestante;
}

    
    public void salud(){
        
    }
    
    public void resistencia(){
        
    }
    
    
    
}
