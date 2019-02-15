package Ejercicios;

public class Ejercicio04 {

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
		
		// Llamo al método ordenarNum
		System.out.println("\n");
		System.out.println("Lista de numeros Ordenados");
		System.out.println("====================================");
		ordenarNum(numeros);

	}

	static void ordenarNum(int arrray[]) {
		int ultimaPos = arrray.length - 1;
		int posMin, aux;

		// Ordeno el array
		for (int i = 0; i < arrray.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < arrray.length; j++) {
				if (arrray[j] < arrray[posMin]) {
					posMin = j;
				}
			}

			aux = arrray[i];
			arrray[i] = arrray[posMin];
			arrray[posMin] = aux;
		}
		
		// Muestro el array
		for (int i = 0; i < arrray.length; i++) {
			if (i == ultimaPos) {
				System.out.print(arrray[i]);
			} else {
				System.out.print(arrray[i] + ", ");
			}
		}
	}
}
