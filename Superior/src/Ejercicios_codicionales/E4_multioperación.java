package Ejercicios_codicionales;

import java.util.Scanner;

public class E4_multioperación {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Introduce el primer número");
		Scanner teclado= new Scanner(System.in);
		x = teclado.nextInt();
		
		System.out.println("Introduce el sefundo número");
		y = teclado.nextInt();
		
		int suma, resta, multi;
		float div;
		
		suma = x+y;
		resta = x-y;
		multi = x*y;
		div = x/y;
		
		System.out.println("Resultado de la suma: "+suma);
		System.out.println("Resultado de la resta: "+resta);
		System.out.println("Resultado de la multiplicacion: "+multi);
		System.out.println("Resultado de la division: "+div);
				
		
		
	}

}
