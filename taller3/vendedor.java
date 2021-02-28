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



/**

 *

 * @ @author Fabian

 */

public class vendedor {

      String entradaTeclado="";
      Scanner entradaEscaner = new Scanner (System.in);

    int respuesta=0;
    int productos=0;
    int cantidad=0;
    int vendidos1=0,vendidos2=0,vendidos3=0,vendidos4=0,vendidos5=0 ;
    double  total1,total2,total3,total4,total5 ;



 

    public int getVendidos1() {
        return vendidos1;

    }



    public void setVendidos1(int vendidos1) {
        this.vendidos1 = vendidos1;

    }



    public int getVendidos2() {
        return vendidos2;

    }



    public void setVendidos2(int vendidos2) {
        this.vendidos2 = vendidos2;

    }



    public int getVendidos3() {
        return vendidos3;

    }



    public void setVendidos3(int vendidos3) {
        this.vendidos3 = vendidos3;

    }



    public int getVendidos4() {
        return vendidos4;

    }



    public void setVendidos4(int vendidos4) {
        this.vendidos4 = vendidos4;

    }



    public int getVendidos5() {
        return vendidos5;

    }



    public void setVendidos5(int vendidos5) {
        this.vendidos5 = vendidos5;

    }

    public int obtenerProducto(){
        
     System.out.println("Escribe el número del producto");
     entradaTeclado = entradaEscaner.nextLine ();
     try{
        productos= Integer.parseInt(entradaTeclado);
     }catch(Exception ex){
         productos=0;

     }
     return productos;

    }

 

     public int obtenerCantidad(){
     System.out.println("Escribe la cantidad del producto");

     entradaTeclado = entradaEscaner.nextLine ();
     try{
     cantidad= Integer.parseInt(entradaTeclado);
     }catch(Exception ex){
         cantidad=0;
     }
     return cantidad;
    }

     public boolean obtenerRespuesta(){
     System.out.println("Desea adquirir otro producto\n \t 1.Si \n \t 2.No \n. Elige una opción");

     entradaTeclado = entradaEscaner.nextLine ();
    try{
      respuesta = Integer.parseInt(entradaTeclado);
     }catch(Exception ex)
     {

     respuesta=0;
     }
     if (respuesta==1)
         return true;     
     else
         return false;

     }

 

 

    public void producto(int producto, int cantidadVendidos){

         switch (producto){
            case 1:

                vendidos1 = vendidos1 + cantidadVendidos;
                setVendidos1(vendidos1);
                break;

            case 2:

                vendidos2 = vendidos2 + cantidadVendidos;
                setVendidos2(vendidos2);

                break;
                
            case 3:

                vendidos3 = vendidos3 + cantidadVendidos;
                setVendidos3(vendidos3);
                break;
            
            case 4:

                vendidos4 = vendidos4 + cantidadVendidos;
                setVendidos4(vendidos4);
                break;
            
            case 5:

                vendidos5 = vendidos5 + cantidadVendidos;
                setVendidos5(vendidos5);
                break;
                
            default:

                System.out.println("Este articulo no hay en existencia");

                     

                }

         }

}
