/*
10.Un obrero necesita calcular su salario semanal,
el cual se obtiene de la sig. manera:
•Si trabaja 40 horas o menos se le paga $5000 por hora
•Si trabaja más de 40 horas se le paga $5000 por cada una
de las primeras 40 horas y un aumento del 20% por cada
hora extra.

 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int hrs,Tapagar;
        
        System.out.println("DIJITE EL NUMERO DE HORAS TRABAJADAS");
        hrs=input.nextInt();
        
        if(hrs>=40){
            Tapagar=40*5000+((hrs-40)*6000);
            
            
            
            
            
        }
        else
        {
            Tapagar=hrs*5000;
        }
        System.out.println("SU SUELDO SERIA DE: "+Tapagar);
    }
}
