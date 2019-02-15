package Bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num =0;
		
		while (num != 3) {
			System.out.print("Número? ");
			if (entrada.hasNextInt()) {
				num = entrada.nextInt();

			} else {
				System.out.println("Se esperaba un número. ERROR");
				entrada.next();
			}
		}
		System.out.println("Has acertado!");
	}

}