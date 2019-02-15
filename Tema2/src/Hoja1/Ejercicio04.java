package Hoja1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float nota;

		System.out.print("Nota: ");
		nota = entrada.nextFloat();

		if (nota < 4 && nota >= 1) {
			System.out.println("ROJO");
		} else if (nota >= 4 && nota < 5) {
			System.out.println("VERDE");
		} else if (nota > 5 && nota <= 10) {
			System.out.println("AZUL");
		}
	}

}
