package Arrays01;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precio[] = new float[10];

		for (int i = 0; i < precio.length; i++) {
			System.out.print("Precio " + (i + 1) + " : ");
			precio[1] = entrada.nextFloat();
		}

		for (int i = 0; i < precio.length; i++) {
			System.out.println(precio[i]);
		}
	}

}
