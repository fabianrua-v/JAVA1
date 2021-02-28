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
public class ejercicioOnce {
    public static void main(String[] args) {
        int numero,decena,centena,unidad;
        Scanner particion= new Scanner (System.in);
       
        do{
            System.out.println("ingrese su numero de 0 a 1000");
             numero=particion.nextInt();
             System.out.println("las centenas son: "+(numero/100));
             System.out.println("las decenas son: "+(decena=numero%100)/10);
             System.out.println("las unidades son: "+(unidad=numero%10));
             numero--;
        }while((numero<0)||(numero>999));
    }
    
}
