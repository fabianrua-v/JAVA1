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
public class ejercicioCuatro {
    public static void main(String[] args) {
        double R;
        double Pi=3.1416;
        Scanner radio=new Scanner(System.in);
        System.out.println("ingrese el valor del radio");
        R=radio.nextDouble();
        System.out.println("el radio de su circunferencia es: "+(2*R));
        System.out.println("el radio de su longitud : "+(Pi*R*R));
        
    }
}