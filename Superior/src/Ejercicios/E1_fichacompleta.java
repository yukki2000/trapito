package Ejercicios;

import java.util.Scanner;

public class E1_fichacompleta {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Buenas introduce tu nombre: ");
		String nombre;
		nombre = teclado.nextLine();

		
		System.out.print("Introduce ahora tu edad: ");
		int edad;
		edad = teclado.nextInt();
		
		System.out.print("Introduce ahora tu n�mero de telefono: ");
		int tel;
		tel = teclado.nextInt();
		
		Scanner teclado2= new Scanner(System.in);
		System.out.print("Ahora introduce tu derecci�n: ");
		String direc;
		direc = teclado2.nextLine();
		
		System.out.println("Bienvenido a java "+nombre+" , con "+edad+" a�os puedes usar eclipse. \n Haras tu formacion desde "+direc+"." );
		
	}

}
