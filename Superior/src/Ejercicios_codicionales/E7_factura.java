package Ejercicios_codicionales;

import java.util.Scanner;

public class E7_factura {

	public static void main(String[] args) {
		
		int importe;
		
		System.out.print("Introduzca el precio de la compra: ");
		Scanner teclado = new Scanner(System.in);
		
		importe = teclado.nextInt();
		
		int iva;
		
		iva = (int) (importe*0.21);
		
		int total;
		total = importe+iva;
		System.out.println("---------------------------------------------");
		System.out.println("Precio de la compra: "+importe+" euros");
		System.out.println("IVA aplicado: "+iva+" euros");
		System.out.println("---------------------------------------------");
		System.out.println("Total: "+total+" euros" );

	}

}
