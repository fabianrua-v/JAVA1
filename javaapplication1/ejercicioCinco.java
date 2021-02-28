/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class ejercicioCinco {
    public static void main(String[] args) {
        String caracter;
        Scanner c=new Scanner(System.in);
        System.out.println("ingrese solamente un caracter");
        caracter=c.next();
        
        byte[] bytes = caracter.getBytes(StandardCharsets.US_ASCII);
        System.out.println("ASCII Numeric Value: "+bytes[0]);
    }
}
