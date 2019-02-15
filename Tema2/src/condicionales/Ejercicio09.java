package condicionales;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float precio, precioTotal;
		int unidades;

		System.out.print("Precio del producto: ");
		precio = entrada.nextFloat();

		System.out.print("Número de unidades: ");
		unidades = entrada.nextInt();

		precioTotal = precio * unidades;

		if (precioTotal < 100) {
			System.out.println("El total es: " + precioTotal + " euros.");
		} else if (precioTotal > 200) {
			System.out.println("El total es de " + precioTotal + " euros y se le hará un descuento del 15%.");
			precioTotal = precioTotal - precioTotal * 15 / 100;
			System.out.println("El total es de " + precioTotal + " euros.");
		} else {
			precioTotal = precioTotal - precioTotal * 10 / 100;
			System.out.println("Se le a hará un descuento del 10%.\nEl total es de " + precioTotal + " euros.");
		}

	}

}
