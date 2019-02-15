package Bucles;

import java.util.Scanner;

public class Ejercicio18_19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0, total = 0;

		for (int i = 1; i <= 4; i++) {
			do {
				System.out.print("Nota: ");
				if (entrada.hasNextInt()) {
					num = entrada.nextInt();
					if (num <1 || num >10) {
						System.out.println("ERROR. Número inesperado.");
					}
				} else {
					System.out.println("ERROR. Se esperaba un número entero.");
					entrada.next();
				}
			} while (num < 1 || num > 10);
			total += num;
		}
		total /= 4;
		System.out.println("La media es: " + total);
	}

}
