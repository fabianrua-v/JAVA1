/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class ejercicioSiete {
    public static void main(String[] args) {
        Scanner salida= new Scanner(System.in);
        int lado;
         
        do{
            System.out.println("digite el saldo inicial o lo que debe: ");
            lado=salida.nextInt();
        }while(lado<0 || lado>20);
        
         
        for (int i = 0; i < lado; i++)  {
            for (int j= 0; j < lado; j++)  {
                if(i==0){
                     System.out.print("*");
                }
                else{
                    if(i==lado-1){
                        System.out.print("*");
                    }  else {
                        if(j==0){
                           System.out.print("*"); 
                        }else{
                            if(j==lado-1){
                               System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }  
                    
                    
                }

            }
            System.out.println("");
           
        }
    }
}