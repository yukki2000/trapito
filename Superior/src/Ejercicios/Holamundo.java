package Ejercicios;

import java.util.Scanner;

public class Holamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Hola Mundo");
		
		
		System.out.println("Como te llamas?");
		nombre = teclado.nextLine();
		
		System.out.println("Hola " + nombre + ", cuantos años tienes?");
		int edad;
		edad=teclado.nextInt();
		
		System.out.println("Hola "+ nombre+ ", Tienes "+edad+ " años" );
		
		
	}

}
