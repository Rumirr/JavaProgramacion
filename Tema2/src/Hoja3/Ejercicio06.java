package Hoja3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 1;

		do {
			System.out.print("Número a multiplicar: ");
			if (entrada.hasNextInt()) {
				num = entrada.nextInt();
			} else {

				System.out.println("ERROR.");
				entrada.nextLine();
				continue;
			}

			if (num == 1) {
				System.out.println("No seas tonto.");
				continue;
			}
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}
			System.out.println();
		} while (num != 0);

	}

}
