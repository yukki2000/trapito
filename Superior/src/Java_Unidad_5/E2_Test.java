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
		System.out.println("Si cursaste FOL ¿Tienes que volver a cursarlo?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("1º¿Das java en programación?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("2º¿Ramon da clase de lenguaje de marcas?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("3º ¿En lenguaje de marca dais c++?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("4º Usais github para los repositorios?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("5º ¿Andrea tiene habre siempre?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		
		System.out.println("");
		System.out.println("6º El profesor de sistemas es un sibarita con Apple");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 1) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("7º El chema tiene idea de dar clase?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("8º Es necesarion un bachillerato de ciencias para estudiaer esto?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("9º Y uno de letras?");
		System.out.println("         1:SI                  2:NO");
		
		r = teclado.nextInt();
		
		if(r == 2) {
			puntos++;
		}
		
		System.out.println("");
		System.out.println("10º Piensas que es necesario saber hacer piramides para programación");
		System.out.println("         1:SI        2: No pero con ayuda de aliens si       3:NO");
		
		r = teclado.nextInt();
		
		if(r == 3) {
			puntos++;
		}
		
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Has sacado un "+puntos+"/10");
	}

}
