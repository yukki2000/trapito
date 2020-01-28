package Egiptos;

import java.util.Scanner;

public class P2T2_Carlos_San_Jose_Sole {

	public static void main(String[] args) {
		//este el contador del logueo
		int contl=0;
		
		
		System.out.println("Bienvenido al arquitecto de piramides");
		System.out.println("-------------------------------------");
		String usuario;
		String usu="imhotep";
		String pass="saqqara";
		String contra;
		Scanner tecladou = new Scanner(System.in);
		Scanner tecladoc = new Scanner(System.in);
	//declaracion de variables para escribir y variable para comparar
		do {
			
			if(contl >= 3) {
				System.exit(0);
			}
		System.out.print("Introduzca el usuario: ");
		usuario= tecladou.nextLine();
		
		System.out.print("Introduzca la contraseña: ");
		contra= tecladoc.nextLine();
		
		System.out.println("--------------------------");
		contl++;
		
		}while(!usuario.equals(usu)&& !contra.equals(pass));
		//Comparacion de las variable hasta que esten iguales
		System.out.println("Bienvenido "+usuario);
		System.out.println("---------------------------------------");
		
		
		int repe;
		Scanner x = new Scanner(System.in);
		//Aqui se encuentra el menu realizado con el switch
		do {
		Scanner teclador = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("Salir (S)		");
		System.out.println("Checklist (L)");
		System.out.println("Cálculos (C)");
		System.out.println("Planos de Pirámides (P)");
		System.out.println("----------------------------");
		
		char respuesta;
		respuesta = teclador.next().charAt(0);
		//Segun la letra que escojas se ira a una operacion
		switch(respuesta){
			case 's':
				System.exit(0);
				break;
			
			case 'l':
				Scanner e = new Scanner(System.in);
				
				System.out.println("Pregunta 1: ¿Cuál es el centro del universo?");
				String r1 = e.next();
		    	System.out.println();//esto es para poder escribir con el mismo teclado todas las respuestas
		    	
		    	
		    	System.out.println("Pregunta 2: ¿Qué nombre le damos al cielo?");
				String r2 = e.next();
		    	System.out.println();
		    	
		    	System.out.println("Pregunta 3: ¿Y al más allá?");
				String r3 = e.next();
		    	System.out.println();
		    	
		    	System.out.println("Pregunta 4: ¿Nombre del padre del Rey Dyeser?");
				String r4 = e.next();
		    	System.out.println();
		    	
		    	System.out.println("Pregunta 5: ¿Sobrenombre del Rey?");
				String r5 = e.next();
		    	System.out.println();
		    	int puntos=0;
		    	//Qui uso of para comprobar respuestas y decir los fallos
		    	if(r1.equals("egipto")) {
		    		System.out.println("respuesta 1 correcta");
		    		puntos++;
		    	}else {
		    		System.out.println("respuesta 1 incorrecta");
		    	}
		    	
		    	
		    	if(r2.equals("nut")) {
		    		System.out.println("respuesta 2 correcta");
		    		puntos++;
		    	}else {
		    		System.out.println("respuesta 2 incorrecta");
		    	}
		    	
		    	
		    	if(r3.equals("duat")) {
		    		System.out.println("respuesta 3 correcta");
		    		puntos++;
		    	}else {
		    		System.out.println("respuesta 3 incorrecta");
		    	}
		    	
		    	
		    	if(r4.equals("sanajt")) {
		    		System.out.println("respuesta 4 correcta");
		    		puntos++;
		    	}else {
		    		System.out.println("respuesta 4 incorrecta");
		    	}
		    	
		    	if(r5.equals("necherjet")) {
		    		System.out.println("respuesta 5 correcta");
		    		puntos++;
		    	}else {
		    		System.out.println("respuesta 5 incorrecta");
		    	}
		    	
		    	System.out.println("Tu puntuación es de: "+puntos);
		    	System.out.println("----------------------------");
				break;
				
			case 'c':
				int apb;
				int h;
				int inter;
				//aqui realizo la operacion con las variables que he recogido
				Scanner tecladoh =new Scanner(System.in);
				System.out.print("Introduzca la altura: ");
				h = tecladoh.nextInt();
				
				System.out.print("Introduzca la apotema de la base: ");
				apb = tecladoh.nextInt();
				
				inter = (h*h)+(apb*apb);
				float ap = (float) Math.sqrt(inter);
				
				System.out.println("LA apotema de la piramide es: "+ ap);
				break;
				
			case 'p':
				int base;
				System.out.println("Se van a generar planos primaides");
				System.out.print("Introduce la base: ");
				Scanner y = new Scanner(System.in);
				base = y.nextInt();
				//aqui esta la piramide normal que el contador i va ascendiendo hasta la base inrtroducida
				for(int i=0;i<base;i++){
					
		            for(int j=0;j<i+1;j++){//Con eso podra pintar * segun lo que tengamos de base
		                System.out.print("*");//para pintar los asteriscos
		            }
		            
		            System.out.println("");// esto es para el salto de linea
		        }
				
				
				
				System.out.println("\n");
				
				
				for(int i=base;i>0;i--){//apara hacer esta es lo mismo que la otra solo que estaen vez de aumentar resta hasta hacer la punta
							
				            for(int j=0; j<i ; j++){
				                System.out.print("*");
				            }
				            
				            System.out.println("");
				        }
				
				
				System.out.println("\n");
				
				for(int altura = 1; altura<=base; altura++){
		            //Espacios en blanco
		            for(int blancos = 1; blancos<=base-altura; blancos++){
		                System.out.print(" ");
		            }
		 
		            //Asteriscos
		            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
		                System.out.print("*");
		            }
		            System.out.println();
		        }
				System.out.println("----------------------------");
				break;
		}
		System.out.println("----------------------------");
		System.out.println("¿Desea volver a hacer otra operacion?");
		System.out.println("1: Salir     2:Nueva operación");
		System.out.println("----------------------------");
		repe = x.nextInt();
		
		}while(repe == 2);
		
		System.out.println("Sistema apagado");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
