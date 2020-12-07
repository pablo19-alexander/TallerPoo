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
public class ejercicio_1 {
    public static void main(String[] args) {
        final int precioPC = 500;
            Scanner input = new Scanner(System.in);
         int cantidadPC=0;
         double VALORcompra,valordescuento,VALORpagar,dto;
         System.out.print("Número de PC a comprar: ");
         cantidadPC=input.nextInt();
         if(cantidadPC<5){
             dto=10;
         }
         else{
             if(cantidadPC<10){
                 dto=20;
             }
             else{
                 dto=40;
             }
         }
         VALORcompra=precioPC*cantidadPC;
         valordescuento=VALORcompra*dto/100;
         VALORpagar=VALORcompra-valordescuento;
         System.out.println("Cantdad de PC=     "+cantidadPC);
         System.out.println("Valor de la Compra=   "+VALORcompra);
         System.out.println("Valor de Descuento="+valordescuento);
         System.out.println("Valor a Pagar=    "+VALORpagar);
  
    }
    
}
