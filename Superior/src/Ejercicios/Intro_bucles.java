package Ejercicios;

import java.util.Scanner;

public class Intro_bucles {

	public static void main(String[] args) {
		
		int i;
		int n;
		
		System.out.println("Introduce un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		for(i=0; i<=10; i++) {
			
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
