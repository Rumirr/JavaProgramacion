package condicionales;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int edad;
		boolean mayorEdad;

		System.out.print("Edad? ");
		edad = entrada.nextInt();

		mayorEdad = (edad < 18) ? false : true;
		
		System.out.println(mayorEdad);

	}

}
