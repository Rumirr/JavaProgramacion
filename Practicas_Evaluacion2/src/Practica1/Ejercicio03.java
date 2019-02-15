package Practica1;

public class Ejercicio03 {

	public static void main(String[] args) {

		// array en forma de columna-fila
		String animales[][] = { { "Tigre", "Caballo", "Elefante", "Ciervo", "Cerdo" },
				{ "22", "40", "70", "35", "25" } };

		ordenar(animales);

		System.out.printf("%-15s%-3s", "Especie", "Esperanza de vida");
		System.out.println("\n__________________________________");
		for (int i = 0; i < animales[0].length; i++) {
			System.out.printf("%-15s%3s",animales[0][i],animales[1][i]);
			System.out.println();
		}
	}

	static void ordenar(String[][] datos) {
		int posMin;
		String aux;

		for (int i = 0; i < datos[0].length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < datos[0].length; j++) {
				if (Integer.parseInt(datos[1][j]) < Integer.parseInt(datos[1][posMin])) {
					posMin = j;
				}
			}

			// ordeno los animales
			aux = datos[0][i];
			datos[0][i] = datos[0][posMin];
			datos[0][posMin] = aux;

			// ordeno la esperanza de vida
			aux = datos[1][i];
			datos[1][i] = datos[1][posMin];
			datos[1][posMin] = aux;
		}
	}
}
