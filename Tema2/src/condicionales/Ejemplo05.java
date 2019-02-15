package condicionales;

import java.util.Scanner;


/*
 * Ejercicio que pida las notas de tres evaluaciones y calcule la media.
 */

public class Ejemplo05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float nota1 = 0, nota2 = 0, nota3 = 0, media;
		
		System.out.print("Nota del primer trimestre: ");
		
		if (entrada.hasNextFloat() == true) {
			nota1 = entrada.nextFloat();
		}else {
			System.out.println("El programa esperaba un número. ERROR");
			System.exit(0);
		}
		
		System.out.print("Nota del segundo trimestre: ");
		if (entrada.hasNextFloat() == true) {
			nota2 = entrada.nextFloat();
		}else {
			System.out.println("El programa esperaba un número. ERROR");
			System.exit(0);
		}		
		
		System.out.print("Nota del tercero trimestre: ");
		if (entrada.hasNextFloat() == true) {
			nota3 = entrada.nextFloat();
		}else {
			System.out.println("El programa esperaba un número. ERROR");
			System.exit(0);
		}		
		
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("\nMedia del curso: " + media);
		
	}

}
