package Arrays02;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int edades[] = new int[10];
		int posMin, aux;

		for (int i = 0; i < edades.length; i++) {
			System.out.print("Edad del alumno " + (i + 1) + ": ");
			edades[i] = entrada.nextInt();
		}

		for (int i = 0; i < edades.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
			}
			
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
		}
		
		System.out.println("");
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Edad del alumno " + (i + 1) +  ": " + edades[i]);
		}

	}

}
