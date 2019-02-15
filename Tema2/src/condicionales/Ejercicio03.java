package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float precio;

		System.out.print("¿Cúal es el precio del producto? ");
		precio = entrada.nextFloat();

		if (precio > 80) {

			System.out.print("Se le hará un descuento del 10%.");
			precio = precio - precio * 10 / 100;
		}
		if (precio < 5 ) {
			System.out.print("Se sumará 2 euros por gastos de gestión.");
			precio = precio + 2;
		}
		System.out.println("El producto costará " + precio + " euros.");
	}
}