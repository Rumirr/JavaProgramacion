package condicionales;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota;

		System.out.print("Nota: ");
		nota = entrada.nextInt();

		if (nota < 5) {
			System.out.println("NSUFICIENTE");
		} else if (nota < 6) {
			System.out.println("SUFICIENTE");
		}else if (nota < 7) {
			System.out.println("BIEN");
		}else if (nota < 9 ) {
			System.out.println("NOTABLE");
		}else {
			System.out.println("EXCELENTE");
		}

	}

}
