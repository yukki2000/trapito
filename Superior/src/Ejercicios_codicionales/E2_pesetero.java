package Ejercicios_codicionales;

import java.util.Scanner;

public class E2_pesetero {

	public static void main(String[] args) {
		
		float euros, pesetas;
		
		System.out.print("Introduce una cantidad de euros: ");
		Scanner teclado= new Scanner(System.in);
		
		euros = teclado.nextFloat();
		
		pesetas = (float) (euros * 166.386);
		
		System.out.println(euros+ " euros son "+pesetas+" pesetas" );
		

	}

}
