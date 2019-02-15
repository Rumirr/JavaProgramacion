package Bucles;

import java.util.Scanner;

public class Ejercicio04b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		do {
			System.out.print("Introduce un número entre 1 y 5: ");
			num = entrada.nextInt();
		} while (num != 3);
		System.out.println("Has acertado.");

	}

}
