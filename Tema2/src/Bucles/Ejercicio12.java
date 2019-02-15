package Bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int respuesta;

		do {
			System.out.println(
					"Quién es el autor de la novela \"Ready Player One\"? \n1)Douglas Capland. \n2)Isaac Asimov. \n3)Ernest Cline. \4)Ray Bradbury");
			respuesta = entrada.nextInt();
		} while (respuesta < 1 || respuesta > 4);
		if (respuesta == 3) {
			System.out.println("Has acetado!!!");
		} else {
			System.out.println("Has fallado!!!");
		}

	}

}
