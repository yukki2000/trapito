package Java_Unidad_5;

import java.util.Scanner;

public class E4_Notas {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		double nota;
		String rec = null;	
		Scanner teclado = new Scanner(System.in); 
				
		System.out.println("---------------------------");
		
		System.out.print("Nota del Primer control: ");
		n1 = teclado.nextInt();
		
		System.out.print("Nota del Segundo control: ");
		n2 = teclado.nextInt();
		
		System.out.println("---------------------------");
		nota = (n1+n2)/2;
		System.out.println("Nota de Programacion: "+nota);
		
		
		
		if(nota >= 5) {
			System.out.println("Estas aprobado en esta asignatura");
		}
		
		if(nota <=5){
			System.out.println("-----------------------------");
			System.out.println("Introduce resutado de la recuperación");
			System.out.println("         apto/ no apto");
			
			Scanner teclado2 = new Scanner(System.in); 
			rec = teclado2.nextLine();
			
			if (rec == "apto") {
				System.out.println("--------------------------------");
				nota =5;
				System.out.println("Tu nuta es: "+nota);
			}else if(rec == "no apto") {
				System.out.println("Tu nota es de: "+nota);
			}
		}	
		
			
			
			
			
		}
		
		
		
	}
	


