package Java_Unidad_4;

import java.util.Scanner;

public class E3_Separar_numero {

	public static void main(String[] args) {
		
		
		int n;
		int tres;
		int dos;
		int uno;
		do {
		System.out.println("Introduce un numero de 3 cifras");
		Scanner teclado = new Scanner(System.in);
		n= teclado.nextInt();
		}while(n <= 100);
		
		tres = n%10;
		
		n = n/10;
		dos = n%10;
		
		n=n/10;
		uno= n%10;
		
		System.out.println("Numero 1: "+ uno);
		System.out.println("Numero 2: "+ dos);
		System.out.println("Numero 3: "+ tres);
		

	}

}
