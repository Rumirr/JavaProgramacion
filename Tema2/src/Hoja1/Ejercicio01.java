package Hoja1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		final String CLAVE_REQUERIDA = "java8";
		
		Scanner entrada = new Scanner(System.in);
		
		
		String clave;
		
		System.out.print("Clave de acceso: ");
		clave = entrada.next();
		if (clave.equals(CLAVE_REQUERIDA)) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}
	}

}
