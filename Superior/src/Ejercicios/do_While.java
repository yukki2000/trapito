package Ejercicios;

import java.util.Scanner;

public class do_While {

	public static void main(String[] args) {
		int numeros=0;
		int n=1;
		int suma=0;
		System.out.println("Todos los numeros que introducas se sumaran");
		System.out.println("-------------------------------------------");
		System.out.println("Escribe un 0 o numero menor para finalizar");
		
		Scanner teclado = new Scanner (System.in);
		
		while(n >= 1 ) {
		n = teclado.nextInt();
		suma = suma +n;	
			
		numeros++;	
		
		}
		numeros--;
		System.out.println("------------------------------------------");
		System.out.println("Es un total de: "+suma);
		System.out.println("Numeros introducidos: "+numeros);

	}

}
