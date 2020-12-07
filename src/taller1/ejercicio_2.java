/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
