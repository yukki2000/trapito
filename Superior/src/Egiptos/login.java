package Egiptos;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		
		
		int contl=0;
		
		//hola
		System.out.println("Bienvenido al arquitecto de piramides");
		System.out.println("-------------------------------------");
		String usuario;
		String contra;
		Scanner tecladou = new Scanner(System.in);
		Scanner tecladoc = new Scanner(System.in);
		do{
	
		System.out.print("Introduzca el usuario: ");
		usuario= tecladou.nextLine();
		
		System.out.print("Introduzca la contraseña: ");
		contra= tecladoc.nextLine();
		
		contl++;
		
		
		}while(usuario!="imhotep"&& contra!="saqqara");
		
		System.out.println("Bienvenido");
		
	}

}
