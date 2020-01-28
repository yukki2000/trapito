package Egiptos;

import java.util.Scanner;

public class Piramides {

	public static void main(String[] args) {
		int base;
		System.out.println("Se van a generar planos primaides");
		System.out.print("Introduce la base: ");
		Scanner y = new Scanner(System.in);
		base = y.nextInt();
		
		for(int i=0;i<base;i++){
			
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
		
		
		
		System.out.println("\n");
		
		
		for(int i=base;i>0;i--){
					
		            for(int j=0; j<i ; j++){
		                System.out.print("*");
		            }
		            
		            System.out.println("");
		        }
		
		
		System.out.println("\n");
		
		for(int altura = 1; altura<=base; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=base-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
