package Ejercicios_codicionales;

import java.util.Scanner;

public class E3_mayordeedad {

	public static void main(String[] args) {
		
		int annio;
		
		System.out.print("Introduce el año de nacimiento: ");
		Scanner teclado= new Scanner(System.in);
		annio = teclado.nextInt();
		
		final int aa= 2020;
		
		int edad;
		
		edad= aa-annio;
		
		if(edad >= 18) {
			System.out.println("Tienes "+edad+" años, eres mayor de edad");
			
		}else {
			System.out.println("Tienes "+edad+" años, eres menor de edad");
		}
	}

}
