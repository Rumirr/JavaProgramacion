package Bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char caracter;
		int contador = 1;
		int veces;

		System.out.print("Introduce una carácter: ");
		caracter = entrada.next().charAt(0);

		System.out.print("Número de veces que se repita el carácter: ");
		veces = entrada.nextInt();

		while (contador <= veces) {
			System.out.println(caracter);
			contador++;
		}
	}

}
