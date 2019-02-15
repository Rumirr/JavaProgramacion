package Bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String caracter;
		int contador = 0;

		System.out.print("Introduce una carácter: ");
		caracter = entrada.nextLine();

		while (contador <= 99) {
			System.out.println(caracter);
			contador++;
		}
	}

}
