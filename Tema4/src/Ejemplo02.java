import java.util.Scanner;

/*
 * Ordenar un array en tres pasos
 */
public class Ejemplo02 {

	static Scanner entrada = new Scanner(System.in);
	static int edades[] = new int[5];

	public static void main(String[] args) {

		// Leero los datos.
		leerDatos();

		// Ordenarlo.
		ordenarEdades();
		
		
		// Mostrar cómo queda.
		mostrarEdades();

	}

	static void leerDatos() {

		System.out.println("Escribe todas las edades");
		System.out.println("===========================");

		for (int i = 0; i < edades.length; i++) {

			System.out.print("Edad de la persona " + (i + 1) + ": ");
			edades[i] = entrada.nextInt();

		}

	}

	static void ordenarEdades() {

		int posMin, aux;

		for (int i = 0; i < edades.length; i++) {
			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
			}

			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
		}

	}
	
	static void mostrarEdades() {
		System.out.println();
		System.out.println("Edades");
		System.out.println("===========================================");
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Persona " + (i + 1) + ": " + edades[i]);
		}
	}

}
