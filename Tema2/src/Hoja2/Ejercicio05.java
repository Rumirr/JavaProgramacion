package Hoja2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 10 + 1);
		int num, i = 0;

		do {
			System.out.println("Número? ");
			num = entrada.nextInt();
			if (num == aleatorio) {
				System.out.println("Has acertado.");
				break;
			}
			i++;
		} while (i != 3);
		if (i == 3 ) {
			System.out.println("Has fallado.");
		}

	}

}
