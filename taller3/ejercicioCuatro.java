/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class ejercicioCuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        
        int num=0,tarifaNormal=60,extras=90;
        int contador=0;
        System.out.println("digite la cantidad de personas a registrar: ");
        num=entrada.nextInt();
            
        int a=0,o,b;
        int[]E =new int[num];
        int[]H =new int[num];
        int[]T =new int[num];
        String nombre;
           
       for(int i=0;i<num;i++){
           System.out.println("digite el nombre del empleado: ");   
            nombre=entrada.next();
           System.out.println("digite el codigo de la personas a registrar: ");
           E[i]=entrada.nextInt();
        
            System.out.println("horas trabajadas la semana pasada ");
            H[i]=entrada.nextInt();
    
           
           do{
           System.out.println("digite las horas trabajadas para su respectivas tarifas: ");
           T[i]=entrada.nextInt();
           if(i<40){
               a=T[i];
               b=(a-40);
               contador++;
               System.out.println(("su tarifa de") + nombre +"es " +(b*extras+tarifaNormal*40));
           }
         }while(a<=num);
       }
       }
       
}
