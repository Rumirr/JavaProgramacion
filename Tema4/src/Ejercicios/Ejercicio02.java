package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String nombre;
		int edad;

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();

		System.out.print("Edad: ");
		edad = entrada.nextInt();
		
		System.out.println(persona(nombre, edad));
		
	}

	static String persona(String nombre, int edad) {

		return "Hola, " + nombre + ", no parece que tengas " + edad + " años.";

	}
}
