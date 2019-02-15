package condicionales;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int mes;

		System.out.print("Escribe un número de mes: ");
		mes = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mes tiene 31 días.");
			break;
		case 2:
			System.out.println("Tiene 28 días.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tiene 30 días.");
			break;
		default:
			System.out.println("Error. Vuelve a introducir un número de mes.");
		}

	}

}
