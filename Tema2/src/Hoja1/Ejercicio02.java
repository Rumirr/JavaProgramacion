package Hoja1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		final String NOMBRE_REQUERIDO = "prog";
		final String  PASSWORD_REQUERIDO = "java8";
		
		Scanner entrada = new Scanner(System.in);
		
		String usuario, contrasena;

		System.out.print("Usuario: ");
		usuario = entrada.next();
		
		System.out.print("Clave de acceso: ");
		contrasena = entrada.next();
		
		if (NOMBRE_REQUERIDO.equals(usuario) && PASSWORD_REQUERIDO.equals(contrasena)) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}
		
	}

}
