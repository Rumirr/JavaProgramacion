package condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float precio, precioFinal;
		int unidades;

		System.out.print("Precio del producto: ");
		precio = entrada.nextFloat();

		System.out.print("Número de unidades: ");
		unidades = entrada.nextInt();
		
		precioFinal = precio * unidades;
		
		if (precioFinal > 75) {

			precioFinal = precioFinal - precioFinal * 15 / 100;
			System.out.println("Se le hará un descuento del 15% a su compra, la cual costará " + precioFinal + " euros ahora.");

		} else {

			precioFinal = precioFinal - precioFinal * 5 / 100;
			System.out.println("Se le hará un descuento del 5% a su compra, la cual costará " + precioFinal + " euros ahora.");

		}

	}

}
