
package com.pojos;


public abstract class Tecnologia {
   private String noSerie;
    private String anio;
    private String modelo;

    public Tecnologia() {
    }

    public Tecnologia(String noSerie, String anio, String modelo) {
        this.noSerie = noSerie;
        this.anio = anio;
        this.modelo = modelo;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "El modelo es " + this.modelo + ", el aÃ±o es " + this.anio 
                + ", No.Serie: " + this.noSerie;
    }
    
}

