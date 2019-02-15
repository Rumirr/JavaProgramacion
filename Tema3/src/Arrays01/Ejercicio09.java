package Arrays01;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String pregunta;
		String test[] = new String[4];

		char letra = 'a';

		System.out.println("Indique la pregunta para el test (no hace falta porner los signos de interrogación):");
		pregunta = entrada.next();

		for (int i = 0; i < test.length; i++) {
			System.out.print("Opción número " + (i + 1) + ": ");
			test[i] = entrada.next();
		}

		System.out.println("\n¿" + pregunta + "?");
		for (int i = 0; i < test.length; i++) {
			System.out.println("\t" + letra + ") " + test[i]);
			letra += 1;
		}

	}

}
