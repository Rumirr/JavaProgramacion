package Hoja1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;
		String respuesta;

		System.out.print("Número: ");
		num = entrada.nextInt();

		respuesta = num % 2 == 0 ? "Es par" : "Es inpar";
		
		System.out.println(respuesta);

	}

}
