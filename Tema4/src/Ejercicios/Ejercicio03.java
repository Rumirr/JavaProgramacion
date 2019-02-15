package Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		System.out.println(persona());
		
	}
	
	static String persona() {
		
		Scanner entrada = new Scanner(System.in);
		String nombre;
		
		System.out.print("Nombre: ");
		nombre=entrada.nextLine();
		
		return nombre;
		
	}
	
}
