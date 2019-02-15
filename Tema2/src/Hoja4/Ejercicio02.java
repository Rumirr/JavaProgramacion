package Hoja4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Número: ");
		num = entrada.nextInt();
		
		for (int i = 1; i <= num ; i++) {
			System.out.println(i);
		}

	}

}
