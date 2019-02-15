package Bucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Escribe un número entero: ");
			num= entrada.nextInt();
		} while (num <1 || num > 10);
		System.out.println("Has acertado!!!");
	}

}
