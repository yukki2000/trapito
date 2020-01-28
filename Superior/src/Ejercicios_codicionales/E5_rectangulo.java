package Ejercicios_codicionales;

import java.util.Scanner;

public class E5_rectangulo {

	public static void main(String[] args) {
		
		int base, altura, area;
		
		System.out.print("Introduzca la base del rectangulo: ");
		Scanner teclado = new Scanner(System.in);
		base = teclado.nextInt();
		
		System.out.print("Introduzaca la altura: ");
		altura = teclado.nextInt();
		
		area = base*altura;
		
		System.out.println("El area del rectangulo es: "+area);

	}

}
