package Bucles;

import java.util.Scanner;

/*
 * Programa que sume 5 precios. pero si se introduce un precio negativo, termine enseguida.
 */

public class Ejemplo06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float precio, total = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Precio " + i + "? ");
			precio = entrada.nextFloat();
			
			if (precio < 0) {
				System.out.println("Precio equivocado");
				break;
			}
			
			total +=precio;
		}
		System.out.println("Total "+ total + " €.");
	}

}
