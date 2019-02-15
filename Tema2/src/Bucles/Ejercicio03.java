package Bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.print("Escribe un número entero: ");
		num = entrada.nextInt();

		while (num <1 || num > 10) {

			System.out.print("\nVuelve a intentar: ");
			num = entrada.nextInt();

		}
		System.out.println("Has acertado!");
	}

}
