package Bucles;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Número para crear la tabla de multiplicar: ");
			num = entrada.nextInt();

			if (num == 1) {
				System.out.println("¡No seas tonto!");
				i--;
				continue;
			} else {
				for (int j = 0; j <= 10; j++) {
					System.out.println(num + " x " + j + " = " + num * j);
				}
			}
		}

	}

}
