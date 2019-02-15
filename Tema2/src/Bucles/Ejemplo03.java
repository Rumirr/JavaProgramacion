package Bucles;

import java.util.Scanner;

/*
 * Programa que pida números hasta que la suma de todos los números introducidos pase de 21.
 */
public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num, sum = 0;

		do {
			System.out.print("Introduce un número: ");
			num = entrada.nextInt();
			sum += num;
		} while (sum <= 21);
		System.out.println("Tus números suma " + sum);
	}

}
