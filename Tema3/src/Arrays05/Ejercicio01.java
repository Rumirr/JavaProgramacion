package Arrays05;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// columnas-filas
		String libros[][] = new String[4][5];

		for (int i = 0; i < libros[0].length; i++) {
			System.out.print("ISBN del libro: ");
			libros[0][i] = entrada.nextLine();

			System.out.print("Título del libro: ");
			libros[1][i] = entrada.nextLine();

			System.out.print("Autor del libro: ");
			libros[2][i] = entrada.nextLine();

			System.out.print("Editorial del libro: ");
			libros[3][i] = entrada.nextLine();

			System.out.println();
		}
		// System.out.println("ISBN \tTítulo \tAutor \tEditorial");

		System.out.printf("%13s %-32s %-32s%-32s", "ISBN", " " + "Título", "Autor", "Editorial");
		System.out.println();
		for (int i = 0; i < libros[0].length; i++) {
			for (int j = 0; j < libros.length; j++) {
				// System.out.print(libros[j][i] + "\t");
				if (j == 0) {
					System.out.printf("%13s", libros[j][i]);
				} else {
					System.out.printf("%-32s", "  " + libros[j][i]);
				}
			}
			System.out.println();
		}

	}

}
