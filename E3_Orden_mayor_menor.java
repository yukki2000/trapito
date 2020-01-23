package Java_Unidad_5;

import java.util.Scanner;

public class E3_Orden_mayor_menor {

	public static void main(String[] args) {
		
		
		int n1, n2, n3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		n1 = teclado.nextInt();
		
		System.out.print("Introduce otro numero: ");
		n2 = teclado.nextInt();
		
		System.out.print("Introduce otro numero mas: ");
		n3 = teclado.nextInt();
		
		System.out.println("Ordenados de mayor a menor:");
		
		if(n1 > n2 && n1 > n3) {
			if(n2>n3) {
				System.out.println(n1+" > "+n2+" > "+n3);
			}else if(n2 < n3) {
				System.out.println(n1+" > "+n3+" > "+n2);
			}
		}
		
		
		if(n2 > n1 && n2 > n3) {
			if(n1>n3) {
				System.out.println(n2+" > "+n1+" > "+n3);
			}else if(n1 < n3) {
				System.out.println(n2+" > "+n3+" > "+n1);
			}
		}
		
		
		if(n3 > n2 && n3 > n1) {
			if(n2>n1) {
				System.out.println(n3+" > "+n2+" > "+n1);
			}else if(n2 < n1) {
				System.out.println(n3+" > "+n1+" > "+n2);
			}
		}
	}

}
