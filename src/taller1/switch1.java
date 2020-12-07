/*
13.	Una empresa automotriz necesita un sistema para seleccionar el tipo de carro 
(auto, SUV o camioneta) lo cual debe de aparecer en un menú, y
el color (negro, blanco o rojo) en otro menú. 
Al final se necesita que despliegue la selección realizada. 
Nota. Debe de anidarse una estructura de selección múltiple dentro de otra.
 */
package taller1;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class switch1 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System. in);
        System.out.println("   > CLASE DE CARRO <   ");
        System.out.println("");
        System.out.println("1. >para carro< ");
        System.out.println("2. >para SUV< ");
        System.out.println("3. >para CAMIONETA< ");
        
        int n1,n2;
        String claseA = "a",color="a";
        n1=input.nextInt();
        switch (n1){
            case 1:
                claseA=">carro<";
                System.out.println("  >ESCOJA EL COLOR<  ");
                System.out.println("");
                System.out.println("1. >Para negro<  ");
                System.out.println("2. >para rojo<  ");
                System.out.println("3. >para blanco<  ");
                n2=input.nextInt();
                switch (n2){
                    case 1:
                        color=">negro<";
                        break;
                    case 2:
                        color=">rojo<";
                        break;
                    case 3: 
                        color=">blanco<";
                        break;
                         default:
                            System.out.println(">ESCOJA UN NUMERO ERRONEO< ");
                       
                }
           break;
            case 2:
                claseA=">SUV<";
                System.out.println("  >ELIJA EL COLOR DEL CARRO<  ");
                System.out.println("");
                System.out.println("1. >para negro<");
                System.out.println("2. >para rojo<");
                System.out.println("3. >para blanco< ");
                n2 = input.nextInt();
                switch (n2){
                       case 1:
                            color=">negro<";
                            break;
                       case 2: 
                            color=">rojo<";
                            break;
                       case 3:
                            color=">blanco<";
                            break;
                         default:
                              System.out.println(">ESCOJA UN NUMERO ERRONEO<"); }
                break;
            case 3:
                claseA=">Camioneta<";
                System.out.println("  >ELIJA EL COLOR DEL CARRO<  ");
                System.out.println("");
                System.out.println("1. >para negro<");
                System.out.println("2. >para rojo<");
                System.out.println("3. >para blanco<");
                  n2 = input.nextInt();
                  switch (n2){
                      case 1:
                          color=">negro<";
                          break;
                      case 2: 
                          color=">rojo<";
                          break;
                      case 3:
                          color=">blanco<";
                          break;
                      default:
                           System.out.println(">ESCOJA UN NUMERO ERRONEO<");}
          break;
          default:System.out.println(">ESCOJA UN NUMERO ERRONEO<"); }
        System.out.println("SU CLASE DE AUTO ES: "+claseA);
        System.out.println("SU COLOR DE AUTO ES: "+color);
                      
                  }
                
        }
    
    

