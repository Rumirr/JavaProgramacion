package Arrays01;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precios[] = new float[10];
		int preciosMayores = 0;
		float total = 0;

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Precio del producto " + (i + 1) + ": ");
			precios[i] = entrada.nextFloat();

			total += precios[i];

			if (precios[i] > 10) {
				preciosMayores++;
			}
		}

		System.out.println("\nPrecio total a pagar: " + total + " €.");
		System.out.println("Número de productos con un valor mayor a 10 €: " + preciosMayores);

	}

}
