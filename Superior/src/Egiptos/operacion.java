package Egiptos;

import java.util.Scanner;

public class operacion {

	public static void main(String[] args) {

		int apb;
		int h;
		int inter;
		
		Scanner tecladoh =new Scanner(System.in);
		System.out.print("Introduzca la altura: ");
		h = tecladoh.nextInt();
		
		System.out.print("Introduzca la apotema de la base: ");
		apb = tecladoh.nextInt();
		
		inter = (h*h)+(apb*apb);
		float ap = (float) Math.sqrt(inter);
		
		System.out.println("LA apotema de la piramide es: "+ ap);
	}

}
