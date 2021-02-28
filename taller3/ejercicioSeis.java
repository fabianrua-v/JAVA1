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
public class ejercicioSeis {
    public static void main(String[] args) {
        int numero=0,contador=0,almacenador=0,mayor=0;
        Scanner num= new Scanner(System.in);
        do{
                
            System.out.println("digite sus numeros: ");
             numero=num.nextInt();
             if(numero>mayor){
                 mayor=numero;
                 
              System.out.println("el numero mayor hasta ahora: "+mayor);
              System.out.println ("Contando... " + (contador+1) );
              contador += 1;
             }
             
        }while(contador<10);
        System.out.println("este fue su ultimo numero: "+numero);
        
    }
}
 

                   
