package Bucles;

import java.util.Scanner;

public class Ejercicio04c {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int num = 0; num != 3; ) {
			System.out.print("Introduce un número entre 1 y 5: ");
			num = entrada.nextInt();

		}
		System.out.println("Has acertado!!!");
	}

}
