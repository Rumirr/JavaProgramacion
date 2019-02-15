package Arrays01;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float productos[] = new float[100];
		float producto = 1;

		for (int i = 0; i < productos.length && producto !=0; i++) {
			System.out.print("Precio del producto " + (i + 1) + ": ");
			producto = entrada.nextFloat();
			productos[i]=producto;
		}
		for (int i = 0; i < productos.length && productos[i] !=0; i++) {
			System.out.println(productos[i]);
			
		}

	}

}
