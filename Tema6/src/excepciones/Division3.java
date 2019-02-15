package excepciones;

import java.util.Scanner;

public class Division3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº.");

		System.out.print("Escribe un no entero: ");
		String numero = entrada.nextLine();

		dividir(numero);

	}
	
	static void dividir(String numero) {
		try {

			// instrucciones que pueden dar algún error
			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
		} catch (NumberFormatException | ArithmeticException ex) {
			// Instrucciones a ejecutar si se produce una excepción de tipo
			// NumberFormatException
			System.out.println("Error. Se esperaba que escribieras un número entero y distinto de cero.");
			return;
		} catch (Exception e) {
			System.out.println("Sr ha producido un error en la operación.");
			return;
		} finally {
			// Instrucciones que se van ejecutar siempre, haya habido un error ono. Además,
			// incluso aunque en el catch que ha capturado el error exista un return
			System.out.println("Instrucciones finales ...");
		}
		
		System.out.println("Fin del método.");
	}
}