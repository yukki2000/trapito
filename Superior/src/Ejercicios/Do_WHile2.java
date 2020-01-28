package Ejercicios;

import java.util.Scanner;

public class Do_WHile2 {

	public static void main(String[] args) {
		
		int numeros=0;
		int n=1;
		int suma=0;
		System.out.println("Introduce solo numeros pares");
		System.out.println("-------------------------------------------");
		System.out.println("es una aviso");
		
		Scanner teclado = new Scanner (System.in);

		do {
			
			n = teclado.nextInt();
			
		}while(n%2 == 0);
		
		System.out.println("PUÑETAZO EN EL PANCREAS");
		
	}

}
