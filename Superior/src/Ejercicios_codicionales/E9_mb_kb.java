package Ejercicios_codicionales;

import java.util.Scanner;

public class E9_mb_kb {

	public static void main(String[] args) {
		
		int decision;
		System.out.println("Introduce el numero de la accion que quieres hacer:");
		System.out.println("1: Mb a Kb			2:Kb a Mb");
		Scanner teclado = new Scanner(System.in);
		
		decision = teclado.nextInt();
		int mb = 0;
		double kb = 0;
		
		
		switch(decision) {
		 case 1: 
			 	System.out.println("Introduce la cantidad de Mb");
			 	mb = teclado.nextInt();
			 	kb = mb * 1000;
			 	System.out.println("Son "+kb+" kilobytes");
			 break;
			 
		 case 2:
			 	System.out.println("Introduce la cantidad de Kb");
			 	kb = teclado.nextDouble();
			 	mb = (int) (kb / 1000);
			 	System.out.println("Son "+mb+" Megabytes");
			 break;
		}

	}

}
