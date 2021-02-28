/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Fabian
 */
import java.util.Scanner;
public class ejercicioSeis {
    public static void main(String[] args) {
        double peso,altura;
       Scanner m= new Scanner (System.in);
       
       System.out.println("ingrese su peso en kilogramos");
       peso=m.nextDouble();
       
       System.out.println("ingrese su altura em metros");
       altura=m.nextDouble();
       
        System.out.println("su masa corporal es : " + (peso/altura*altura));
               
    }
}
