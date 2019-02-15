package Arrays02;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float temperaturas[] = new float[8];
		float aux;
		int posMin;
		int ultimaPosicion = temperaturas.length - 1;
		
		System.out.println("Inserte la temperatura de las últimas 8 horas.");

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Temperatura: ");
			temperaturas[i] = entrada.nextFloat();
		}

		for (int i = 0; i < temperaturas.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < temperaturas.length; j++) {
				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}
			}
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;
		}
		
		System.out.println("");
		
		for (int i = 0; i < temperaturas.length; i++) {
			if (i == (temperaturas.length - 1)) {
				System.out.print(temperaturas[i] + "ºC");
			} else {
				System.out.print(temperaturas[i] + "ºC, ");
			}
		}

		System.out.println("\n\nLa temperatura mínima es: " + temperaturas[0] + "ºC.");
		System.out.println("La temperatura máxima es:" + temperaturas[ultimaPosicion]+ "ºC.");

	}

}
