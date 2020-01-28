package Java_Unidad_4;

import java.util.Scanner;

public class E2_Numeros_pedidos {

	public static void main(String[] args) {
		
		int n;
		int num;
		int suma=0;
		System.out.println("Introduce el numero maximo de numeros");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		for(int i = 1; i<=n ; i++) {
			
			System.out.print("Introduce el "+i+"º numero: ");
			num = teclado.nextInt();
			suma = suma+ num;
		}
		System.out.println("--------------------------------------------");
		System.out.println("La suma de los "+n+" numeros es: "+suma );
	}

}
