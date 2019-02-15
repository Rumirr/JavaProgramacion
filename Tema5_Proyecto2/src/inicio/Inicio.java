package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una distancia en kilómetros: ");
		System.out.println("Son " + Conversor.km(entrada.nextDouble()) + " millas.");
	
		System.out.println();
		System.out.print("Introduce una presión en milibares: ");
		System.out.println("Son " + Conversor.atmosferas(entrada.nextDouble()) + " atmosferas.");
		
		System.out.println();
		System.out.print("Intrudice una cantidad de energía en calorías: ");
		System.out.println("Son " + Conversor.julios(entrada.nextDouble()) + " julios.");
	}
}
