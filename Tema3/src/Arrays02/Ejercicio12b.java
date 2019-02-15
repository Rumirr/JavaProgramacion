package Arrays02;

public class Ejercicio12b {

	public static void main(String[] args) {

		int numerosAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int posMax, aux;
		int ultimaPosicion = numerosAtomicos.length - 1;

		// Ordenamos los datos de menor a mayor
		
		for (int i = 0; i < numerosAtomicos.length - 1; i++) {
			posMax = i;

			// Buscamos el mínimo
			
			for (int j = i + 1; j < numerosAtomicos.length; j++) {
				if (numerosAtomicos[j] > numerosAtomicos[posMax]) {
					posMax = j;
				}
			}
			
			// Intercambiamos las posiciones posMin e i
			aux = numerosAtomicos[i];
			numerosAtomicos[i] = numerosAtomicos[posMax];
			numerosAtomicos[posMax] = aux;
		}
		
		// Mostramos los datos ordenados
		
		for (int i = 0; i < numerosAtomicos.length; i++) {
			if (i == ultimaPosicion) {
				System.out.print(numerosAtomicos[i]);
			}else {
				System.out.print(numerosAtomicos[i] + ", ");
			}
		}
		
		
		System.out.println("\n\nNúmero atómico mayor: " + numerosAtomicos[0]);
		System.out.println("Número atómico menor: " + numerosAtomicos[ultimaPosicion]);

	}

}
