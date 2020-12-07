/*
 9.Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades
si a este se le asigna un porcentaje de su salario mensual que depende de su antigüedad
en la empresa de acuerdo con la siguiente tabla:
Tiempo					        Utilidad
Menos de 1 año			12Ms		5 % del salario
1 año o más y menos de 2 años	12-23Ms		7% del salario
2 años o más y menos de 5 años	24-59Ms		10% del salario
5 años o más y menos de 10 años	60-119Ms		15% del salario
10 años o más	120Ms				20% del salario

 */
package taller1;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario;
        int tiempoT;
            System.out.println("INGRESE SU SALARIO");
            salario=input.nextInt();
        System.out.println("CUANTO TIEMPO LLEVA EN LA EMPRESA");
        tiempoT =input.nextInt();
        
        if(tiempoT<12){
            
            salario=(salario*0.05)+salario;
           
        }
        else {
            if((tiempoT>=12)&&(tiempoT<=23)){
                salario=salario+(salario*0.07);
                
            }
        else{
            if((tiempoT>=24)&&(tiempoT<=59)){
                    salario=salario+(salario*0.1);
            }
        else{
            if((tiempoT>=60)&&(tiempoT<=119)){
                salario=salario+(salario*0.15);
                
                }
                else
                salario=salario+(salario*0.2);
            }
            }
            }
        System.out.println("SU SALARIO ES DE: "+salario);
    }
}
            
             
            
            
        
         
       
    
      
  
    
    

