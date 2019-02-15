package Bucles;

public class Ejemplo08 {

	public static void main(String[] args) {

		int aleatorio;

//		Números aleatorios entre 0 y 0.9999999......
//		for (int i = 0; i < 20; i++) {
//
//			System.out.println(i + "\t" + Math.random());
//		}

		// Lanzamiento de una moneda.

//		for (int i = 0; i < 20; i++) {
//			aleatorio = (int) (Math.random() * 2 + 1);
//			System.out.println(i + "\t" + aleatorio);
//		}
		
		//Lanzamiento de un dado.
		
		for (int i = 0; i < 20; i++) {
			aleatorio = (int) (Math.random() * 6 + 1);
			System.out.println(i + "\t" + aleatorio);
		}

	}

}
