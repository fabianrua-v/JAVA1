/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class ejercicioDiez {
    public static void main(String[] args) {
        double pesoKm,gramo,libra,tonelada;
        Scanner leer= new Scanner (System.in);
        System.out.println("digite el numero de Kilogramos a convertir");
        pesoKm=leer.nextDouble();
        System.out.println("los kilogramos en toneladas son: "+(tonelada=pesoKm*0.001));
        System.out.println("los kilogramos en libras son: "+(libra=pesoKm*2000));
        System.out.println("los kilogramos en gramos son: "+(gramo=pesoKm*1000));
    }
}
