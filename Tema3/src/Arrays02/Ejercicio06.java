package Arrays02;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int votos[] = new int[6];
		int posMin = 0, posMax = 0;

		for (int i = 0; i < votos.length; i++) {
			System.out.print("Número de vostos del " + (i + 1) + " partido: ");
			votos[i] = entrada.nextInt();
		}

		for (int i = 1; i < votos.length; i++) {
			if (votos[i] < votos[posMin]) {
				posMin=i;
			}
			if (votos[i] > votos[posMax]) {
				posMax=i;
			}
		}
		
		System.out.println("\nEl partido " + (posMax + 1) + " es el partido con más votos (" + votos[posMax] + ") y esta guardado en la posición en " + (posMax + 1) + ".");
		
		System.out.println("El partido " + (posMin + 1) + " es el partido con menos votos (" + votos[posMin] + ") y esta guardado en la posición en " + (posMin + 1) + ".");

	}

}
