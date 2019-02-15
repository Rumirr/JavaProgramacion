package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int temperatura;

		System.out.print("¿Cúal es la temperatura? ");
		temperatura = entrada.nextInt();

		if (temperatura > 120) {

			System.out.print("TEMPERATURA DEL REACTOR CRÍTICCA. ¡CORRED, INSENSATOS!");

		}
	}

}
