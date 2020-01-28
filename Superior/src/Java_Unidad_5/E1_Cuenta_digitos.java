package Java_Unidad_5;

import java.util.Scanner;

public class E1_Cuenta_digitos {

	public static void main(String[] args) {
		int n;
		//Hacemos lo normal de pillar una variable
		Scanner teclado =new Scanner(System.in);
		System.out.println("Introduce un numerico: ");
		
		n= teclado.nextInt();
		//con eso transofrmamos el int en una cadena llmada X
		String x = Integer.toString(n);
		//Y con ese cuenta los digitos de la cadena con x.length()
		System.out.println(n + " tiene " + x.length() + " dígitos");
	}

}
