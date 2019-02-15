package Bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int respuesta;

		do {
			System.out.println(
					"¿Cómo se escribe 30 en hexadecimal? \n1) 1E \n2) 2F \n3) 33 \n4) Ninguno de los anteriores.");
			respuesta = entrada.nextInt();

		} while (respuesta < 1 || respuesta > 4);

		if (respuesta == 1) {
			System.out.println("Has acertado.");
		} else {
			System.out.println("Has fallado.");
		}
	}

}
