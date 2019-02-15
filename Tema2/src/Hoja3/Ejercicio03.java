package Hoja3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int aleatorio1, aleatorio2, resultado, suma;
		while (true) {
			aleatorio1 =(int) (Math.random() * 100 + 1); 
			aleatorio2 = (int) (Math.random() * 100 + 1);
			System.out.println("Suma los dos siguientes números: " + aleatorio1 + " y " + aleatorio2
					+ ". E indique el resultado para confimar que has acertado.");
			resultado = entrada.nextInt();
			suma = aleatorio1 + aleatorio2;
			if (resultado == suma) {
				System.out.println("Has acertado.");
			} else {
				System.out.println("Estudia más.");
			}

		}
	}

}
