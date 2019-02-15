package Hoja1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idioma;

		System.out.println("(1) Francés \n(2) Inglés \n(3) Alemán \n(4) Italiano");
		idioma = entrada.nextInt();

		switch (idioma) {
		case 1:
			System.out.println("Bonjour.");
			break;
		case 2:
			System.out.println("Good Mornig.");
			break;
		case 3:
			System.out.println("Guten Morgen.");
			break;
		case 4:
			System.out.println("Buongiorno.");
			break;

		default:
			System.out.println("Buenos días.");
			break;
		}

	}

}
