package condicionales;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int edad;
		
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Nombre: ");
		nombre = entrada.nextLine();
		
	}

}
