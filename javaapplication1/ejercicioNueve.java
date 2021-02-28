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
public class ejercicioNueve {
    public static void main(String[] args) {
      double nDia,kilometros,pagoEstacionamiento,pagoPeaje,costoGasolona,promedioKilometros;
      double totalKm,totalPeaje,totalEstacionamiento,totalLitros,totalPREgasolina;
      Scanner dinero= new  Scanner(System.in);  
      
       System.out.println("ingrese el numero de dias del viaje: ");
       nDia=dinero.nextDouble();
       
       System.out.println("ingrese kilometros recorridos por dia: ");
       kilometros=dinero.nextDouble();
       
        System.out.println("ingrese precio de estacionamiento por dia: ");
       pagoEstacionamiento=dinero.nextDouble();
       
       System.out.println("ingrese precio de peaje por dia: ");
       pagoPeaje=dinero.nextDouble();
       
       System.out.println("ingrese precio de litro de gasolina: ");
       costoGasolona=dinero.nextDouble();
       
       System.out.println("ingrese el promedio de kilometros por litro de gasolina: ");
       promedioKilometros=dinero.nextDouble();
       
        System.out.println("total de kilometros de viaje: "+(totalKm=kilometros* nDia));
        
        System.out.println("total costo de peaje por viaje: "+(totalPeaje=pagoPeaje*nDia));
        
        System.out.println("total pagado de estacionamiento por viaje: " +( totalEstacionamiento= pagoEstacionamiento*nDia));
         
        System.out.println("total litros de gasolina: " + (totalLitros=totalKm/promedioKilometros));
                
        System.out.println("total pagado de gasolina del viaje: " +(totalPREgasolina=costoGasolona*totalLitros));
 
        System.out.println("total pagado por todo el viaje es: "+(totalPREgasolina+totalEstacionamiento+totalPeaje));
    }
}


