package Practica1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float notas[]=new float[10];
		int aprobados = 0, suspendidos = 0;
		
		// Preguntamos la nota y comprobamos que haya introdicido un número y que haya introducido una nota
		// entre 0 y 10 
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			if (entrada.hasNextFloat()) {
				notas[i]=entrada.nextFloat();
				
				if (notas[i] < 0 || notas[i] > 10) {
					System.out.println("Las notas se evaluan sobre 10. Vuelve a introducir la nota.");
					i--;
				}
			} else {
				System.out.println("ERROR. Introduce un número.");
				i--;
				entrada.next();
			}
		}
		
		// Contamos las notas suspendidas y aprobadas
		for (float nota : notas) {
			if (nota < 5) {
				suspendidos++;
			} else {
				aprobados++;
			}
		}
		
		System.out.println("\nNúmero de aprobados: " + aprobados);
		System.out.println("Número de suspendidos: " + suspendidos);
	}

}
