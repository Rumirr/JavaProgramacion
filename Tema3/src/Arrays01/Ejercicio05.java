package Arrays01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float notas[] = new float[5];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + " : ");
			notas[i] = entrada.nextFloat();
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

	}

}
