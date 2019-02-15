
public class Ejemplo07 {

	public static void main(String[] args) {

		int notas[] = { 6, 7, 9, 10, 10, 8, 8, 5, 10, 4 };

		int posMin, aux;

		for (int i = 0; i < notas.length - 1; i++) {
			posMin = i;
			
			for (int j = i + 1; j < notas.length; j++) {
				
				if (notas[j] < notas[posMin]) {
					posMin = j;
				}
				
				// Intercambiamos el primer elemento de la parte no ordenada del array
				
				aux = notas[i]; //guardamos el valor original de notas[i]
				notas[i] = notas[posMin]; //hacemos el intercambio. Guardomos el valor más pequeño en notas[i]
				notas[posMin] = aux; // después guardamos el valor original de notas[i] en la posición donde se encontraba el valor más pequeño.
				
			}
		}
		
		for (int i : notas) {
			System.out.print(i + ", ");
		}

	}

}
