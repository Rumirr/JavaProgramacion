package condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String pass;

		System.out.print("Contraseña: ");
		pass = entrada.nextLine();

		if (pass.equals("1234")) {
			System.out.println("Acceso concedido.");
		}
	}

}
