/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Principal;

import com.pojos.Computadora;
import com.servicios.ServiciosComputadora;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author UdeG_
 */
public class Principal {
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanLine = new Scanner(System.in);
   
    public static void main(String[] args) {
    
     menu();
    }

    private static void menu() {
        boolean bandera = true;
        ServiciosComputadora servicios = new ServiciosComputadora();
        System.out.println("----------- Bienvenido a TecnologÃ­a "
                + "Integradora----------------");
        do{
            System.out.println("Ingresa la opciÃ³n deseada"
                    + "\n   1) AÃ±adir computadora"
                    + "\n   2) Revisar la lista"
                    + "\n   3) Modificar en la lista"
                    + "\n   4) Eliminar"
                    + "\n   5) SALIR");
            int opcion = scanInt.nextInt();
            switch(opcion){
                case 1:
                    Computadora compu = pedirDatosAUsuario();
                    boolean exito = servicios.agregar(compu);
                    if(exito)
                        System.out.println("Se agregÃ³ con Ã©xito");
                    else
                        System.out.println("NEL MORRO NO SE HACE");
                    break;  
                case 2:
                    LinkedList listaDeCompus = servicios.leer();
                    imprimir(listaDeCompus);
                    break;
                    
                    
                case 3:
                    Computadora compu = modificarDatosAUsuario();
                    boolean exito = servicios.modificar(compu);
                    if(exito)
                        System.out.println("Se modifico con exito");
                    else
                        System.out.println("NEL MORRO NO SE HACE");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Usted ha salido del programa! Vuelva pronto");
                    bandera = !bandera;
                    break;
            }
        }while(bandera);
    }

    private static Computadora pedirDatosAUsuario() {
        System.out.println("Ingrese el No. serie");
        String noSerie = scanLine.nextLine();
        System.out.println("Ingrese el aÃ±o de la computadora");
        String anio = scanLine.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = scanLine.nextLine();
        System.out.println("Ingrese el procesador");
        String procesador = scanLine.nextLine();
        System.out.println("Ingrese RAM");
        int ram = scanInt.nextInt();
        Computadora compu = new Computadora(noSerie, anio, modelo, procesador, ram);
        return compu;
    }

    private static void imprimir(LinkedList<Computadora> listaDeCompus) {
        for(Computadora compu : listaDeCompus){
            System.out.println(compu);
        }
    }
    
}