package Hoja4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float temp;

		do {
			System.out.print("Temperatura? ");
			temp = entrada.nextFloat();

			if (temp > 10 && temp < 30) {
				System.out.println("Temperatura correcta.\n");
			} else if (temp > 30 && temp <= 40) {
				System.out.print("Activar ventiladores a medida potencia.\n");
			} else if (temp > 40) {
				System.out.println("Activar ventiladores a máxima potencia.\n");
			}
		} while (temp >= 0 && temp <= 50);

	}

}
