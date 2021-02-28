/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class ejercicioSiete {
    public static void main(String[] args) {
        double precioVenta,precioCompra;
       Scanner w= new Scanner (System.in);
       
       System.out.println("ingrese el precio de compra del prodeucto: ");
       precioCompra=w.nextDouble();
       
       System.out.println("ingrese el precio de venta del prodeucto: ");
       precioVenta=w.nextDouble();
       
        System.out.println("el % de utilidad es: " + ( precioVenta-precioCompra)/(precioVenta)*(100)+"%");
    }
}
