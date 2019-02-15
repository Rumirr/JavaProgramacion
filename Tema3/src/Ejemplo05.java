import java.util.Scanner;

/*
 * Programa para leer y mostrar los nombres de una clase.
 */

public class Ejemplo05 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		String nombres[] = new String[50];

		// Lectura de los nombres.
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Alumno " + (i + 1) + ": ");
			nombres[i] = entrada.nextLine();

			if (nombres[i].equals("")) {
				break;
			}
		}

		// Mostrar los nombre de los alumnos.
		System.out.println("\n=================================================\n");
		for (int i = 0; i < nombres.length; i++) {
			
			if (!nombres[i].equals("")) {
				System.out.println("Alumno " + (i + 1) + ": " + nombres[i]);
			}else {
				break;
			}
		}

	}

}
