package Egiptos;

import java.util.Scanner;

public class Cuestionario {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Pregunta 1: ¿Cuál es el centro del universo?");
		String r1 = e.next();
    	System.out.println();
    	
    	
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
    	
	}

}
