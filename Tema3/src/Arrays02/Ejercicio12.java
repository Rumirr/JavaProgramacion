package Arrays02;

public class Ejercicio12 {

	public static void main(String[] args) {

		int numerosAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int posMin, aux;
		int ultimaPosicion = numerosAtomicos.length - 1;

		// Ordenamos los datos de menor a mayor
		
		for (int i = 0; i < numerosAtomicos.length - 1; i++) {
			posMin = i;

			// Buscamos el mínimo
			
			for (int j = i + 1; j < numerosAtomicos.length; j++) {
				if (numerosAtomicos[j] < numerosAtomicos[posMin]) {
					posMin = j;
				}
			}
			
			// Intercambiamos las posiciones posMin e i
			aux = numerosAtomicos[i];
			numerosAtomicos[i] = numerosAtomicos[posMin];
			numerosAtomicos[posMin] = aux;
		}
		
		// Mostramos los datos ordenados
		
		for (int i = 0; i < numerosAtomicos.length; i++) {
			if (i == ultimaPosicion) {
				System.out.print(numerosAtomicos[i]);
			}else {
				System.out.print(numerosAtomicos[i] + ", ");
			}
		}
		
		
		System.out.println("\n\nNúmero atómico mayor: " + numerosAtomicos[ultimaPosicion]);
		System.out.println("Número atómico menor: " + numerosAtomicos[0]);

	}

}
