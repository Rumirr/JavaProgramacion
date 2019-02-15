package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int mes;

		System.out.print("Número de mes: ");
		mes = entrada.nextInt();

		if ((mes <= 12) && (mes >= 1)) {

			System.out.println("Mes correcto.");

		} else {

			System.out.println("Mes no válido.");

		}

	}

}
