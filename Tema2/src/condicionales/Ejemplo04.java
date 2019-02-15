package condicionales;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float nota;

		System.out.print("Nota: ");
		nota = entrada.nextFloat();

		if (nota < 0 || nota > 10) {
			System.out.println("Error");
		} else if (nota < 5) {
			System.out.println("INSUFICIENTE");
		} else if (nota < 6) {
			System.out.println("SUFICIENTE");
		} else if (nota < 7) {
			System.out.println("BIEN");
		} else if (nota < 9) {
			System.out.println("NOTABLE");
		} else if (nota <= 10) {
			System.out.println("EXCELENTE");
		}

	}

}
