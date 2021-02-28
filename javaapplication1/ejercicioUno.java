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
public class ejercicioUno {
    public static void main(String[] args) {
        int num1,num2;
        Scanner guardar= new Scanner (System.in);
        
        System.out.println("digite el primer numero: ");
        num1=guardar.nextInt();
        System.out.println("digite el segundo numero: ");
        num2=guardar.nextInt();
        
         System.out.printf("x=%d\n",num1);
         System.out.printf("el valor de %d+%d es %d\n", num1,num1,(num1+num1));
         System.out.printf("x=%.2f",num1);
         System.out.printf("%d-%d\n",(num1+num2),(num2+num1));
    }
    
}
