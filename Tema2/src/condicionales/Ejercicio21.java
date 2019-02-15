package condicionales;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombre, desconocido;

		System.out.print("Nombre? ");
		nombre = entrada.nextLine();

		nombre = (nombre.equals("")) ? "Desconocido" : nombre;

		System.out.println(nombre);
	}

}
