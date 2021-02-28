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
public class ejercicioUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite la cantidad de proctos a registrar: ");
        int num=0;
        num=entrada.nextInt();
        int cont=0,cont1=0;
        int[]A =new int[num];
        int[]B =new int[num];
        int[]C =new int[num];
        
        for (int i = 0; i < num; i++)  {
            System.out.print("introduzca el codigo del producto vendido por dia" + (i+1) + " :");
            A[i] = entrada.nextInt();
 
            System.out.print("introduzca cantidad de unidades vendidas en el dia:  ");
            C[i] = entrada.nextInt();  
            cont+=C[i];

            System.out.print("introduzca el valor de cada producto vendido en el dia:  ");
            B[i] = entrada.nextInt();
            cont1+=C[i]*B[i];
        }
        int mayorCantidad=0,indiceCantidad=0;int mayorValor=0,indiceValor=0;
        
        for(int i = 0; i <num ; i++){
            if (mayorCantidad<C[i]) {
                mayorCantidad=C[i];
                indiceCantidad=i;
            } 
           
            
            if (mayorValor< B[i]);
                 mayorValor=B[i];
                 indiceValor=i;
        }
                 
        System.out.println("el producto mas caro es: "+ (B[mayorValor]));
        System.out.println("el producto mas vendido es: "+(C[mayorCantidad]));
        System.out.println("Total productos vendidos en el día:  " + cont);
        System.out.println("Total ingresos por ventas del día :  " + cont1);
    }
}
