/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author Fabian
 */
import java.util.Scanner;

public class ejercicioDiez {
    
    public static void main(String[] args) {
        Scanner obtener= new Scanner(System.in);
        System.out.println("ingrese su primer numer a invertir: ");
        int numero=obtener.nextInt();
        
        if (numero > 999 & numero < 10000){
            int a= numero/1000;
            int b=numero -(a * 1000);
            int c=b /100;
            int d=b-(c*100);
            int e= d/10;
            int f=d-(e*10);
            int g=(f*1000)+(e*100)+(c*10)+a;
            
                System.out.println("este es el numero invertido: " + g);
        }
        
    }
}
