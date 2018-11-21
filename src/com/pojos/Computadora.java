/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

/**
 *
 * @author UdeG_
 */
public class Computadora extends Tecnologia{
    
       private String procesador;
       private int ram;

    public Computadora(){
    }

    public Computadora(String noSerie, String anio, String modelo, String procesador, int ram) {
        super(noSerie, anio, modelo);
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

   @Override
   public String toString(){
       return super.toString() + ", procesador: " + this.procesador + " RAM: " + this.ram;
   } 
    
}