package Java_Unidad_5;

import java.util.Scanner;

public class E2_Test {

	public static void main(String[] args) {
		
		int r;
		int puntos = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido al test del curso FESAC");
		System.out.println("-----------------------------------");
		
		System.out.println("");
		System.out.println("Si cursaste FOL �Tienes que volver a cursarlo?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("1��Das java en programaci�n?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("2��Ramon da clase de lenguaje de marcas?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("3� �En lenguaje de marca dais c++?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("4� Usais github para los repositorios?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("5� �Andrea tiene habre siempre?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		
		System.out.println("");
		System.out.println("6� El profesor de sistemas es un sibarita con Apple");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("7� El chema tiene idea de dar clase?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("8� Es necesarion un bachillerato de ciencias para estudiaer esto?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("9� Y uno de letras?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("10� Piensas que es necesario saber hacer piramides para programaci�n");
		System.out.println("         1:SI        2: No pero con ayuda de aliens si       3:NO");
		
		r = teclado.nextInt();
		
		if(r == 3) {
			puntos++;
		}
		
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Has sacado un "+puntos+"/10");
	}

}
