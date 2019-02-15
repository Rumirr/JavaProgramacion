package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float precio;
		float descuento = 0;

		System.out.print("¿Cúal es el precio del producto? ");
		precio = entrada.nextFloat();

		if (precio > 80) {

			System.out.print("Se le hará un descuento del 10%.");
			descuento = precio * 10 / 100;
		}
		System.out.println("El producto costará " + (precio - descuento) + " euros.");
	}

}
