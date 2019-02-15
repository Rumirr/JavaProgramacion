package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		int edad;

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();

		System.out.print("Edad: ");
		edad = entrada.nextInt();

		persona(nombre, edad);
	}

	static void persona(String nombre, int edad) {

		System.out.println("Hola, " + nombre + ", no parece que tengas " + edad + " años.");

	}
}
