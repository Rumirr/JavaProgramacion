package Arrays02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float productos[] = new float[10];
		float total=0;
		boolean precioCorrecto = true;
		int posicion=0;

		for (int i = 0; i < productos.length; i++) {
			System.out.print("Precio del " + (i + 1) + ": ");
			productos[i] = entrada.nextFloat();
		}

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] < 0) {
				precioCorrecto = false;
				posicion = i + 1;
				break;
			} else {
				total+=productos[i];
			}
		}
		
		if (precioCorrecto==false) {
			System.out.println("\nSe ha encontrado un valor no válido en la posición " + posicion);
		} else {
			System.out.println("\nLos productos costará " + total + " € en total.");
		}
	}

}
