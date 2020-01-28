package Java_Unidad_4;

import java.util.Scanner;

public class E10_Pasar_decimal_entero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		float n;
		n = teclado.nextFloat();
		
		int entero = (int)n;
		
		System.out.println("Numero entero:"+entero);
		
		
	}

}
