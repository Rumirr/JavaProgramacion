package Hoja3;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		do {

			System.out.print("Número a multiplicar: ");
			num = entrada.nextInt();

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}

		} while (num != 0);

	}

}
