package Bucles;

import java.util.Scanner;

/*
 * Programa que solicita al usuario un número y si es el número secreto, le felicita y si no, repite la pregunta.
 */

public class Ejemplo04 {

	public static void main(String[] args) {
		
		
		final int SECRETO = 9;
		
		
		Scanner entrada = new Scanner(System.in);
		int num;
		boolean haAcertado = false; // variable semáfaro.

		do {
			System.out.print("Número secreto? ");
			num = entrada.nextInt();
			
			if (num==SECRETO) {
				haAcertado=true;
			} 
		} while (haAcertado == false);
		System.out.println("Has acetado!!!!!");
	}

}
