package condicionales;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce un número entre 1 y 10: ");
		if (entrada.hasNextInt()) {
			
			num = entrada.nextInt();
			System.out.println(num);
			
		} else {
			
			System.out.println("Se esperaba un número entero. ERROR");

		}
		
	}

}
