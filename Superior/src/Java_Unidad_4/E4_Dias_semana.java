package Java_Unidad_4;

import java.util.Scanner;

public class E4_Dias_semana {

	public static void main(String[] args) {
		
		int n;
		
		do {
		System.out.println("Inroduce un numero del 1 al 7");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		}while(n >= 7);
		
		switch(n){
			case 1: System.out.println("Lunes");
			break;
			case 2: System.out.println("Martes");
			break;
			case 3: System.out.println("Miercoles");
			break;
			case 4: System.out.println("Jueves");
			break;
			case 5: System.out.println("Viernes");
			break;
			case 6: System.out.println("Sabado");
			break;
			case 7: System.out.println("Domingo");
			break;
		}

	}

}
