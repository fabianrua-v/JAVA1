 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Fabian
 */
public class ejercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0,num2=0;
        Scanner n=new Scanner(System.in);
        
        System.out.println("ingrese el primer numero: ");
            num1=n.nextInt();
            
        System.out.println("ingrese el segundo  numero: ");
            num2=n.nextInt();
            
        System.out.println( "los numeros son: " + num1 +","+num2);
        System.out.println("la suma es: " + (num1+num2));
        System.out.println("la resta es: " + (num1-num2));
        System.out.println("la multiplicacion es: " + (num1*num2));
     
     
    }
    
}
