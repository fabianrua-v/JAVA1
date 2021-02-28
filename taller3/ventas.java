/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author Fabian
 */
import java.util.Scanner;
public class ventas{
    
    public static void main(String[] args ){
        vendedor alma = new vendedor();
        int producto, cantidad;
        
        do{
        System.out.println("¿Que deseas comprar?");
        System.out.println("1. Computadora \n 2.Laptop \n 3.Celular \n 4.Tablet \n 5.Smart Watch");
        producto = alma.obtenerProducto();
        cantidad = alma.obtenerCantidad();
        alma.producto(producto, cantidad);
        }while(alma.obtenerRespuesta());
        
        System.out.println("Pieza****************Cantidad*********Precio***********Total********");
        System.out.println("1.Computadora\t\t"+alma.getVendidos1()+"\t\t$2.98\t\t"+ String.format("%.2f", alma.getVendidos1()*2.98)  );
        System.out.println("2.Laptop\t\t"+alma.getVendidos2()+"\t\t$4.50\t\t"+ String.format("%.2f", alma.getVendidos2()* 4.50)  );
        System.out.println("3.Celular\t\t"+alma.getVendidos3()+"\t\t$9.98\t\t"+ String.format("%.2f", alma.getVendidos3()*9.98)  );
        System.out.println("4.Tablet\t\t"+alma.getVendidos4()+"\t\t$4.49\t\t"+ String.format("%.2f", alma.getVendidos4()*4.49)  );
        System.out.println("5.Smart Watch\t\t"+alma.getVendidos5()+"\t\t$6.87\t\t"+ String.format("%.2f", alma.getVendidos5()*6.87)  );
        
        System.out.println("\n\t\t\tLa venta total fue de:  "+ String.format("%.2f",(alma.getVendidos1()*2.98+ alma.getVendidos2()* 4.50 + alma.getVendidos3()*9.98
                                                        +alma.getVendidos4()*4.49  + alma.getVendidos5()*6.87)));       
    }
}


