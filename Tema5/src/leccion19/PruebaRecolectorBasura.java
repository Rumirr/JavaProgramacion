package leccion19;

import leccion19.Carta.Palo;

public class PruebaRecolectorBasura {

	public static void main(String[] args) {

		Carta cartas[] = new Carta[100000];

		for (int j = 0; j < 10; j++) {

			// Rellenamos el array
			for (int i = 0; i < cartas.length; i++) {
				cartas[i] = new Carta(1, Palo.diamante);
			}

			// Ponemos a null todas las posiciones del array para perder las referencias de
			// los objetos recién creados
			for (int i = 0; i < cartas.length; i++) {
				cartas[i] = null;
			}
		}
		System.out.println("fin");
	}
}
