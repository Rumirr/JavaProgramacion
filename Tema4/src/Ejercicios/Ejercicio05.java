package Ejercicios;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		int ultimaPos = numeros.length - 1;
		
		System.out.println("Lista de numeros desordenados");
		System.out.println("====================================");
		// inserto datos en el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10 + 1);
			if (i == ultimaPos) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");
			}
		}
		
		System.out.println("\n");
		System.out.println("Lista de numeros Ordenados");
		System.out.println("====================================");
		// Guardo el array devuelto por el método en el array números
		numeros = ordenarNum(numeros);
		
		// Muestro los números ordenados
		for (int i = 0; i < numeros.length; i++) {
			if (i == ultimaPos) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");
			}
		}

	}

	static int[] ordenarNum(int enteros[]) {
		int ultimaPos = enteros.length - 1;
		int posMin, aux;
		
		// Ordeno el array
		for (int i = 0; i < enteros.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < enteros.length; j++) {
				if (enteros[j] < enteros[posMin]) {
					posMin = j;
				}
			}

			aux = enteros[i];
			enteros[i] = enteros[posMin];
			enteros[posMin] = aux;
		}

		// Devuelvo el array
		return enteros;
	}
}
