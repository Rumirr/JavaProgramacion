package Practica2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int posMax = 0;

		// El primer número indica las columnas (2) y el segundo el número de filas (5)
		String estaturas[][] = new String[2][2];

		System.out.println("Buscador de personas altas (inserte la medida de la estatura en metros)");
		System.out.println("=============================================================================");

		// Pido los datos para insertalos en el array y también comprobo que
		// los datos insertados sean los deseados
		for (int i = 0; i < estaturas[0].length; i++) {
			System.out.print("Nombre de la persona " + (i + 1) + ": ");
			
			// Miro si insertó un número si es así le resto 1 a la "i",
			// se borra lo que hay dentro del scanner y vuelvo al principio del bucle con el "continue"
			if (!entrada.hasNextInt()) {
				estaturas[0][i] = entrada.nextLine();
			} else {
				System.out.println("ERROR. No se esperaba números.\n");
				i--;
				entrada.nextLine();
				continue;
			}

			System.out.print("Estatura de la persona " + (i + 1) + ": ");
			
			// Miro si insertó un número con decimales, si no es así se le resta 1 a la "i" y 
			// se borra lo que hay dentro del scanner
			if (entrada.hasNextFloat()) {
				estaturas[1][i] = entrada.nextLine();
				
				// Como el "Float.parseFloat" solo acepta un "." y no una coma reemplazo la coma con un punto
				// porque ".hasNextFloat" solo acepta comas y no puntos
				estaturas[1][i] = estaturas[1][i].replace(',', '.');
			} else {
				System.out.println("ERROR. Se esperaba un número o un número separado por una coma no por un punto.");
				i--;
				entrada.nextLine();
			}
			

			System.out.println();
		}

		System.out.printf("%-40s %5s", "Nombre", "Estatura");
		System.out.println();

		// Muestro los datos
		for (int i = 0; i < estaturas[0].length; i++) {
			for (int j = 0; j < estaturas.length; j++) {
				if (j == 0) {
					System.out.printf("%-40s", estaturas[j][i]);
				} else {
					System.out.printf("%5s", estaturas[j][i]);
				}
			}
			System.out.println();

		}

		// Busco la estatura más alta
		for (int i = 1; i < estaturas[0].length; i++) {
			if (Float.parseFloat(estaturas[1][i]) > Float.parseFloat(estaturas[1][posMax])) {
				posMax = i;
			}
		}

		// Muestro nla persona más alta
		System.out.println();
		System.out.println("La persona más alta es \"" + estaturas[0][posMax] + "\" con " + estaturas[1][posMax]
				+ " metros de altura.");
	}

}
