package Hoja2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		for (int i = 0; i < 5; i++) {
			System.out.print("Número? ");
			num = entrada.nextInt();
		}
		
		System.out.println("Has fallado");
	}

}
