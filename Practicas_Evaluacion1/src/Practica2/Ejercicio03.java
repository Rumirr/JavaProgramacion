package Practica2;

public class Ejercicio03 {

	public static void main(String[] args) {

		String resistividades[][] = { { "Oro", "Estaño", "Cobalto", "Carbón", "Plata" },
				{ "0.0230", "0.1200", "0.0602", "40", "0.0164" } };

		int posMin = 0, posMax = 0;

		System.out.println("Loas materiales con un índice de resistividad mayor de 0,05 son:");

		for (int i = 0; i < resistividades[0].length; i++) {

			// Busco el valor mínimo y máximo
			if (Float.parseFloat(resistividades[1][i]) < Float.parseFloat(resistividades[1][posMin])) {
				posMin = i;
			}else if (Float.parseFloat(resistividades[1][i]) > Float.parseFloat(resistividades[1][posMax])) {
				posMax = i;
			}
			
			// Muestro los materiales con una resistividad mayor a 0.05
			if (Float.parseFloat(resistividades[1][i]) > 0.05f) {
				System.out.print(resistividades[0][i] + ", ");

			}

		}

		// Muestro los valores máximo y mínimo
		System.out.println("\n");
		System.out.println("El mejor conductor de la electricidad = " + resistividades[0][posMin]);
		System.out.println("El peor conductor de la electricidad = " + resistividades[0][posMax]);
	}

}
