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
public class ejercicioTres {
    public static void main(String[] args) {
        float num1=0,num2=0,num3=0;
        
        Scanner m=new Scanner(System.in);
        System.out.println("ingrese solamente numeros decimales");
        
        System.out.println("ingrese el primer numero decimal: ");
        
        num1=m.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        num2=m.nextFloat();
        System.out.println("ingrese el tercer numero: ");
        num3=m.nextFloat();
        
        System.out.println( "los numeros son: " + num1 +","+num2 + ","+ num3);
        System.out.println("la suma de estos numeros es: " + (num1+num2+num3));
        System.out.println("la multiplicacion es: "+(num1*num2*num3));
        System.out.println("la division es: "+ (num1/num2/num3));
        System.out.println("la modulacion es: "+ (num1%num2%num3));
    }
}
