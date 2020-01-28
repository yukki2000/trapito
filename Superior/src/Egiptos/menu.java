package Egiptos;

import java.util.Scanner;
import java.util.regex.Pattern;

public class menu {

	public static void main(String[] args) {

		
		
		Scanner teclador = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("Salir (S)		");
		System.out.println("Checklist (L)");
		System.out.println("Cálculos (C)");
		System.out.println("Planos de Pirámides (P)");
		
		char respuesta;
		respuesta = teclador.next().charAt(0);
		
		switch(respuesta){
			case 's':
				System.exit(0);
				break;
			
			case 'l':
				System.out.println("Es la l");
				break;
				
			case 'c':
				System.out.println("es la c");
				break;
				
			case 'p':
				System.out.println("Es la p");
				break;
		}
		
		

	}

	private static void Switch(char respuesta) {
		// TODO Auto-generated method stub
		
	}

}
