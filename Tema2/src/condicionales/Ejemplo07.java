package condicionales;

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precio, descuento;

		System.out.print("Precio? ");
		precio = entrada.nextFloat();

//		if (precio < 100) {
//			descuento = 5;
//		} else {
//			descuento = 15;
//		}

		descuento = (precio < 100) ? 5 : 15;

		System.out.println("Descuento " + descuento);
	}

}
