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
public class ejercicioCinco {
    
     
 
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        boolean esBinario = true;
        int binario, decimal;
         
            do {
                System.out.print("Introduce un número binario: ");
                binario = sc.nextInt();
                esBinario = comprobarBinario(binario);
               } while (!esBinario);
         
        decimal = calcularDecimal(binario);
        System.out.printf("%nBinario: %d, Decimal: %d", binario, decimal);
         CalculadoraBinaria();
    }
     
    private static int calcularDecimal(int binario){
        int decimal = 0, exponente = 0;
        int digito;
         while(binario>0){
            digito = binario%10;
            decimal = decimal + digito * (int)Math.pow(2, exponente);
            binario /= 10;
            exponente++;
        }
        return decimal;
    }
     
    private static boolean comprobarBinario(int num){       
        int digito;
        while(num>0){
            digito = num%10;
            if(digito!=0 && digito!=1){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    
    private static void CalculadoraBinaria() {
        int cociente=0,a,numero, exp=0, digito;
        Scanner sc = new Scanner(System.in);
        String binario;
        int bite;
        System.out.println("Introduce un numero entero > 0: ");                                                
        numero = sc.nextInt();
        cociente=numero;
        binario=" ";
          do{
              cociente=cociente/2;
              bite=(numero%2);
              binario=bite+binario;
          }while(cociente>1);
          binario=cociente+binario;
          System.out.println("EL BINARIO ES "+binario);    
          }
           

    }


