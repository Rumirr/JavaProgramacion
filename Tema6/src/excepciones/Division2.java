package excepciones;

import java.util.Scanner;

public class Division2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº.");

		System.out.print("Escribe un no entero: ");
		String numero = entrada.nextLine();

		try {

			// instrucciones que pueden dar algún error
			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
		} catch (NumberFormatException | ArithmeticException ex) {
			// Instrucciones a ejecutar si se produce una excepción de tipo
			// NumberFormatException
			System.out.println("Error. Se esperaba que escribieras un número entero y distinto de cero.");
		} catch (Exception e) {
			System.out.println("Sr ha producido un error en la operación.");
		}
	}
}