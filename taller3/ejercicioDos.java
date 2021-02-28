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
public class ejercicioDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a,num=0;
        int limiteCredito;
        System.out.println("digite el numero de clientes que va a evaluar: ");
        num=entrada.nextInt();
        
        int[]saldoInicio  =new int[num];
        int[]abono =new int[num];
        int[]crédito =new int[num];
        int limite;
        for (int i = 0; i < num; i++)  {
         
         System.out.println("digite el saldo inicial o lo que debe: ");
         saldoInicio[i]=entrada.nextInt();
         
         System.out.println("digite abono del cliente: ");
         abono[i]=entrada.nextInt();
         
         System.out.println("digite crédito del cliente: ");
         crédito[i]=entrada.nextInt();
         System.out.println("digite crédito maximo del cliente: ");
         limite=entrada.nextInt();
         
         System.out.println("el saldo nuevo del cliente es: "+(saldoInicio[i]+abono[i]-crédito[i]));
            if (saldoInicio[i]+abono[i]-crédito[i]+limite >=0){
                System.out.println("usted a excedido su credito ");
            }
        }
        
               
    }
    
}
