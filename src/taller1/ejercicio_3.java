/*
4.Una frutería ofrece las manzanas con descuento según la siguiente tabla:
		NUM. DE KILOS COMPRADOS		% DESCUENTO
			  0 - 2 		  0%
			  2.01 - 5 	         10%
			  5.01 - 10		 15%
			10.01 en adelante	 20%

Determinar cuánto pagara una persona que compre manzanas en esa frutería.
EL PRECIO DEL UN KILO DE MANZANAS ES DE U$1000

 */
package taller1;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class ejercicio_3 {
    public static void main(String[] args) {
      final int precioKiloM = 4000;
      Scanner input = new Scanner(System.in);
      int cantidadKilosM=0;
      double VALORcompra,valordescuento,VALORpagar,dto;
      System.out.print("cuantos kilos de manzana compro: ");
      cantidadKilosM=input.nextInt();
       if(cantidadKilosM<=2){
            dto=0;
            System.out.println("no tiene descuento");
            System.out.println("su total a pagar es: "+precioKiloM*cantidadKilosM);
         }
         else{
             if(cantidadKilosM<=5){
                 dto=10;
             }
             else{
                 if(cantidadKilosM<=10){
                 dto=15;
                 }
                 else{
                 dto=20;
                        
                }
             }
              VALORcompra=precioKiloM*cantidadKilosM;
              valordescuento=VALORcompra*dto/100;
              VALORpagar=VALORcompra-valordescuento;
              System.out.println("CANTIDAD DE KILOS QUE SE LLEVA= "+cantidadKilosM);
              System.out.println("VALOR DE LA COMPRA= "+VALORcompra);
              System.out.println("VALOR DEL DESCUENTO= "+valordescuento);
              System.out.println("VALOR A PAGAR= "+VALORpagar);
              
         }
      
      
      
    }
    
}
