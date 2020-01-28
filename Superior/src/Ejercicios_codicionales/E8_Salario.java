package Ejercicios_codicionales;

import java.util.Scanner;

public class E8_Salario {

	public static void main(String[] args) {

		final int salario=12;
		
		int horas;
		
		System.out.print("Introduce las horas de trabajo: ");
		Scanner teclado = new Scanner(System.in);
		horas = teclado.nextInt();
		
		int sueldo;
		
		sueldo = salario*horas;
		
		System.out.println("----------------------------------------");
		System.out.println("Horas trabajadas: "+ horas+" horas");
		System.out.println("Salario: "+salario+" euros/hora");
		System.out.println("----------------------------------------");
		System.out.println("Sueldo total: "+sueldo+" euros.");
		
	}

}
