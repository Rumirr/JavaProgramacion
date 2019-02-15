package Practica1;

public class Ejercicio01 {

	public static void main(String[] args) {

		String animales[] = { "gato", "pez", "perro", "caballo", "rana", "pajaro", "pollo", "mosca" };
		int ultimaPos = animales.length - 1;

		ordenar(animales);

		for (int i = 0; i < animales.length; i++) {
			if (i == ultimaPos) {
				System.out.print(animales[i]);
			} else {
				System.out.print(animales[i] + ", ");
			}
		}
	}

	static void ordenar(String[] datos) {

		int posMin;
		String aux;

		for (int i = 0; i < datos.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < datos.length; j++) {
				if (datos[j].compareTo(datos[posMin]) < 0) {
					posMin = j;
				}
			}

			aux = datos[i];
			datos[i] = datos[posMin];
			datos[posMin] = aux;
		}

	}
}
