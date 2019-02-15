package Bucles;

import java.util.Scanner;


public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int secreto, i;
		
		for (i = 1; i <= 10; i++) {
			System.out.print("Número secreto: ");
			secreto = entrada.nextInt();
			
			if (secreto == 6) {
				System.out.println("Has acertado.");
				break;
			}
		}
		if (i == 11) {
			System.out.println("Has perdido.");
		} 
	}

}
