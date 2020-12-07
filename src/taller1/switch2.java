/*
12.	Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen
que sacar de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo
pero de otra canasta, los premios se dan bajo la siguiente tabla:	

	HOMBRES				    MUJERES
	# Bolita	Premio		    # bolita		Premio
	1		Desodorante		1		Loción
	2		Six-Pack de cerveza	2		Bikini
	3		Camiseta		3		Crema para la cara
	4		Pantaloneta		4		Plancha para el cabello
	5		Sudadera		5		Esmalte de uñas	

 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author pablo 
 */
public class switch2 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System. in);
    int hm, bolita;
        System.out.println(">>SI ES HOMBRE ESCOJA EL NUMERO 1<<");
        System.out.println(">>SI ES MUJER ESCOJA EL NUMERO  2<<");
        hm=input.nextInt();
        if (hm==1){
            System.out.println(">>QUE NUMERO DE LA BOLITA LE SALIO<<");
            bolita=input.nextInt();
            
            switch (bolita){
                case 1: 
                    System.out.println("--SU PREMIO ES UN DESODORANTE--");
                    break;
                case 2:
                    System.out.println("--SU PREMIO ES UN SIX-PACK DE CERVEZA--");
                    break;
                case 3:
                    System.out.println("--SU PREMIO ES UNA CAMISETA--");
                    break;
                case 4:
                    System.out.println("--SU PREMIO ES UNA PANTALONETA--");
                    break;
                case 5:
                    System.out.println("SU PREMIO ES UNA SUDADERA");
                    break;
                default:
                    System.out.println(">>NO GANO NADA, SUERTE PARA LA PROXIMA<<");
                    
        
            } 
            
        }
        else{
            if (hm==2){
                System.out.println(">>QUE NUMERO DE LA BOLITA LE SALIO<<");
            bolita=input.nextInt();
            
            switch (bolita){
                case 1: 
                    System.out.println("--SU PREMIO ES UNA LOCION--");
                    break;
                case 2:
                    System.out.println("--SU PREMIO ES UN BIKII--");
                    break;
                case 3:
                    System.out.println("--SU PREMIO ES UNA CREMA PARA LA CARA--");
                    break;
                case 4:
                    System.out.println("--SU PREMIO ES UNA PLANCHA PARA EL CABELLO--");
                    break;
                case 5:
                    System.out.println("--SU PREMIO ES UN ESMALTE DE UÑAS--");
                    break;
                default:
                    System.out.println(">>NO GANO NADA, SUERTE PARA LA PROXIMA<<");
                    
        
            } 
            }
            else{
                System.out.println("INTRODUJO UN NUMERO EQUIVOCADO");
            }
        }
            
    }
    

}