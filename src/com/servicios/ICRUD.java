/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.pojos.Computadora;

/**
 *
 * @author UdeG_
 */
public interface ICRUD {
    boolean agregar(Computadora compu);
    
    
    boolean modificar(Computadora compu);
    
}
