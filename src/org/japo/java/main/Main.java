/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Ros Meseguer -javiscorner@gmail.es
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in,"ISO-8859-1");
        scn.useLocale(Locale.ENGLISH);
        
        final int UNIDADES = 100;
        final int PRECIO = 5;
        final double SUELTOS = 0.07;
        
        System.out.print("Introduce la cantidad de caramelos que quiere comprar: ");
    
    try{
        
        int caramelos;
        int bolsas;
        int sueltos;
        double importe;
        double importesuelto;
        double importeprevio;
        double iva;
        double importepvp;
        
        caramelos = scn.nextInt();
        
        bolsas = (caramelos/UNIDADES);
        sueltos = (caramelos%100);
        importe = (PRECIO*bolsas);
        importesuelto = (sueltos*SUELTOS);
        importeprevio = (importe+importesuelto);
        iva = (importeprevio*0.21);
        importepvp = (importeprevio+iva);
        
        System.out.printf("CARAMELOS PARA BAUTIZOS\n");
        System.out.printf("=======================\n");
        System.out.printf("\n");
        System.out.printf("Bolsas completas: %d\n", bolsas);
        System.out.printf("Caramelos sueltos: %d\n", sueltos);
        System.out.printf("\n");
        System.out.printf("Importe bolsas: %.2f €\n", importe);
        System.out.printf("Importe suelto: %.2f €\n", importesuelto);
        System.out.printf("\n");
        System.out.printf("Importe previo: %.2f €\n", importeprevio);
        System.out.printf("\n");
        System.out.printf("IVA: %.2f €\n", iva);
        System.out.printf("\n");
        System.out.printf("Importe PVP: %.2f €\n", importepvp);
    
    }catch (Exception e){
        System.out.printf("No ha introducido un formato valido \n");
    }
    }
}
