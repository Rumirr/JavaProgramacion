package Practica1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio02 {

	public static void main(String[] args) {

		// 3 = culumnas. 5 = filas.
		String vehiculos[][] = new String[3][5];

		leerDaatos(vehiculos);
		mostrarDatos(vehiculos);
		System.out.println();
		mayorPotencia(vehiculos);
	}

	// Método para leer los datos por consola
	static void leerDaatos(String[][] datos) {

		Scanner entrada = new Scanner(System.in);

		// primero indico que solo puede acepar una de las combinaciones dentro del
		// parentisis.
		// después indico que tiene que tener un guión, seguido de 4 números y seguido
		// cualquier letra (menos la q y r) una o dos veces.
		String matricula1 = "(A|AB|AL|AV|B|BA|BI|BU|C|CA|CC|CS|CE|CO|CR|CU|GC|GE|GI|GR|GU|H|HU|PM|IB|J|L|LE|LO|LR|LU|M|MA|ML|MU|NA|O|OR|OU|P|PO|S|SA|SE|SG|SH|SO|SS|T|TE|TF|TO|V|VA|VI|Z|ZA)\\-\\d{4}\\-[A-PS-Z]{1,2}";

		// primero indico que tiene que empezar con cuatro números seguido de 3 letras
		// (menos las vocales).
		String matricula2 = "\\d{4}\\s[B-DF-HJ-NP-TV-Z]{3}";

		boolean matriculaCorrecta = false;

		for (int i = 0; i < datos[0].length; i++) {
			System.out.println("Vehículo " + (i + 1) + ":");

			System.out.print("Matrícula? ");
			datos[0][i] = entrada.nextLine();

			// primero compruebo que una de los dos patrones es true. si es asi en la
			// variable "matriculaCorrecta" se guarda true
			// y se saltará en siguiente if que muestra un mensaje de error.
			// Si algún de los dos patrones devuelve false la variable "matriculaCorrecta"
			// continuará valiendo false y por lo tanto se mostrará el mensaje
			// del siguiente if.
			if (Pattern.matches(matricula1, datos[0][i]) || Pattern.matches(matricula2, datos[0][i])) {
				matriculaCorrecta = true;
			}

			if (matriculaCorrecta == false) {
				System.out.println(
						"Matrícula equivocada. Solo se acepta los siguientes tipos de matrículas y las letra tienen que estar en mayúsculas:");
				System.out.println("XX-0000-X");
				System.out.println("XX-0000-XX");
				System.out.println("0000 XXX");
				System.out.println();
				i--;
				continue;
			}

			System.out.print("Potencia? ");

			// compruebo que los datos son los correctos
			if (entrada.hasNextInt()) {
				datos[1][i] = entrada.nextLine();

				// compruebo que el valor insetado no sea negativo
				if (Integer.parseInt(datos[1][i]) < 0) {
					System.out.println("Error. No se acepta números negativos.");
					System.out.println();
					i--;
					continue;
				}
			} else {
				System.out.println("Error. Se espera una número.");
				System.out.println();
				i--;
				entrada.nextLine();
				continue;
			}

			System.out.print("Precio? ");

			// compruebo que los datos son los correctos
			if (entrada.hasNextFloat()) {
				datos[2][i] = entrada.nextLine();

				// compruebo que el valor insetado no sea negativo
				if (Float.parseFloat(datos[2][i]) < 0) {
					System.out.println("Error. No se acepta números negativos.");
					i--;
				}

			} else {
				System.out.println("Error. Se espera una número o un número separado por una coma no por un punto.");
				i--;
				entrada.nextLine();
			}

			System.out.println();
		}
		entrada.close();
	}

	static void mostrarDatos(String[][] datos) {

		System.out.printf("%10s|%10s|%10s", "Matrícula", "Potencia", "Precio");

		for (int i = 0; i < datos[0].length; i++) {
			System.out.println();
			System.out.printf("%10s|%10s|%10s€", datos[0][i], datos[1][i], datos[2][i]);
		}

	}

	static void mayorPotencia(String[][] datos) {
		int posMax = 0;

		for (int i = 1; i < datos[0].length; i++) {
			if (Integer.parseInt(datos[1][i]) > Integer.parseInt(datos[1][posMax])) {
				posMax = i;
			}
		}

		System.out.println("Vehículo más potente: ");
		System.out.println("\tMatrícula: " + datos[0][posMax]);
		System.out.println("\tPotencia: " + datos[1][posMax]);
		System.out.println("\tPrecio: " + datos[2][posMax]);
	}
}
