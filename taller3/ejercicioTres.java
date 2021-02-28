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
public class ejercicioTres {
    public static void main(String[] args) {
        Scanner salida= new Scanner(System.in);
        
        int venta=0,sueldo=200;
        String clase;
        String producto;
               
        System.out.println("digite la clase del empleado (a o b): ");
        clase=salida.next();
        System.out.println("digite lo vendido semanal por el empleado: ");
          venta=salida.nextInt();
        System.out.println("digite el nombre de los productos por el empleado: ");   
          producto=salida.next();
          
          if(clase.equals("a")){
              if(venta>=3000 && venta<5000){                  
                  System.out.println("sueldo es"+(((venta*9)/100)+((venta*5)/100)+200));
              }else{
                  if(venta>=5000 && venta<=7000){
                      System.out.println("sueldo es:  " +  (((venta*9)/100)+((venta*7)/100)+200));
                  }else{
                      if(venta>7000){
                          System.out.println("del sueldo es"+(((venta*9)/100)+((venta*10)/100)+200));
                          
                      }
                  }
                  
              }
          }
        if("b".equals(clase)){
            if(venta>=5000 && venta<10000){
                 System.out.println("sueldo es"+(((venta*9)/100)+((venta*7)/100)+200));
                
            }else{
                if(venta>=10000 && venta<15000){
                    System.out.println("sueldo es"+(((venta*9)/100)+((venta*10)/100)+200));
                    
                }else{
                    if(venta>=15000){
                         System.out.println("sueldo es"+(((venta*9)/100)+((venta*13)/100)+200));
                        
                    }
                    
                }
            }
        }
         System.out.println("los productos vendidos fueron: "+(producto));
    }
}
