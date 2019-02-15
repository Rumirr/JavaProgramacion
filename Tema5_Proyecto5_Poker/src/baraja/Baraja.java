package baraja;

import java.util.Arrays;

import baraja.Carta.Palo;

public class Baraja {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private Carta[] cartas = new Carta[52];

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public void ordenar() {
		int posCarta = 0;

		for (Palo p : Palo.values()) {
			for (int j = 1; j <= 13; j++) { // para los valores de las cartas
				cartas[posCarta] = new Carta(j, p);
				posCarta++;
			}
		}

//		
//		for (int i = 0; i < 4; i++) { // para los palos
//			for (int j = 1; j <= 13; j++) { // para los valores de las cartas
//				cartas[j + 13 * i] = new Carta(j + 1, i);
//			}
//		}

	}

	public void barajar() {

		Carta aux;
		int cartaAleatoria;
		int cartaAleatoria2;

		for (int i = 0; i <= 30; i++) {
			cartaAleatoria = (int) (Math.random() * 52);
			cartaAleatoria2 = (int) (Math.random() * 52);

			aux = cartas[cartaAleatoria];
			cartas[cartaAleatoria] = cartas[cartaAleatoria2];
			cartas[cartaAleatoria2] = aux;

		}

	}

//	public void cortar() {
//
//		int posCortar = 2;
//		Carta posUno;
//
//		for (int i = 0; i < posCortar; i++) {
//
//			posUno = cartas[0];
//			
//			for (int j = 0; j < cartas.length - 1; j++) {
//				cartas[j] = cartas[j + 1];
//			}
//			cartas[cartas.length - 1] = posUno;
//		}
//	}

	public void cortar() {
		int posCortar = (int) (Math.random() * 52);
		Carta aux[] = Arrays.copyOf(cartas, cartas.length);

		System.arraycopy(aux, posCortar, cartas, 0, cartas.length - posCortar);
		System.arraycopy(aux, 0, cartas, cartas.length - posCortar, posCortar);
	}

	public Carta extraer() {

		Carta auxCarta = cartas[0];

		for (int i = 0; i < cartas.length; i++) {
			if (cartas[i] != null) {
				auxCarta = cartas[i];
				cartas[i] = null;
				break;
			}
		}
		return auxCarta;
	}

	public void mostrar() {
		for (int i = 0; i < cartas.length; i++) {
			if (cartas[i] == null) {
				continue;
			}
			System.out.println(cartas[i].toString() + ", ");
		}
	}
}
