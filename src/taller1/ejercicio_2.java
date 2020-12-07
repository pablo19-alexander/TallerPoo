/*
 2.En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”,
dicha promoción consiste en lo siguiente:
•Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75
si se compran de cinco a 10 y de U$50 si se compran más de 10.
•Obtener la cantidad de dinero que una persona tiene que pagar por cada una de
las llantas que compra y la que tiene que pagar por el total de la compra.

 */
package taller1;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class ejercicio_2 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int cantidadLLanta=0;
        System.out.print("Número de llantas que va a comprar: ");
        cantidadLLanta=input.nextInt();
        if(cantidadLLanta<=5){
             cantidadLLanta=100;
         }
         else{
             if(cantidadLLanta<=10){
                 cantidadLLanta=75;
             }
             else{
                 cantidadLLanta=50;
             }
         }
        System.out.println("el valor de la compra es de: "+cantidadLLanta);
        
    }
    
}
