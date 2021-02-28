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
public class ejercicioNueve {
    final float cuota=2.0f;
    final int horabase=3;
    final float costoexcedente=0.50f;
    final float cargomaximo=10.0f;
    
    public float calcularcargos(float hr){
        float hrextras=0;
        float fraccion =0;
        float cargo =0;
        int hentera=0;
        
        if(hr>horabase){
            hrextras=hr-horabase;
            hentera = (int) hr-horabase;
            fraccion=hrextras -hentera;
            System.out.println("horas totales son: "+hr);
            System.out.println("horas base "+ horabase);
            System.out.println("horas excedentes "+hrextras);
            cargo=(int) cuota + (hentera*costoexcedente);
            if(fraccion>0){
                cargo= cargo + costoexcedente;
            }
        }else{
            System.out.println("no hay excedente");
            cargo= cuota;
            
        }
        if(cargo>cargomaximo){
            cargo=cargomaximo;
        }
        return cargo;
    }
    
    
}
