package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final int SECRETO = 7;
		int numeroSecreto;

		System.out.print("Escribe un número entre 1 al 10: ");
		numeroSecreto = entrada.nextInt();

		if ((numeroSecreto <= 10) && (numeroSecreto >= 1)) {
			if (numeroSecreto == SECRETO) {
				System.out.println("Has acertado el número secreto!");
			} else {
				System.out.println("Vuelve a intentar.");
			}
		}
	}

}
