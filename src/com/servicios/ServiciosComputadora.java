/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.pojos.Computadora;
import java.util.LinkedList;

/**
 *
 * @author UdeG_
 */
public class ServiciosComputadora implements ICRUD{
    
    LinkedList<Computadora> listaDeCompus = new LinkedList();

    @Override
    public boolean agregar(Computadora compu) {
        return listaDeCompus.add(compu);
    }
    
   public LinkedList leer() {
        return listaDeCompus;
   }
   
   public  boolean modificar(Computadora compu){
        return false;
       
       
       
   }
    
}