package Bucles;

import java.util.Scanner;

public class Ejercicio09_while {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dividendo = 0, divisor, resto =0;
		
		System.out.print("Introduce el dividendo: ");
		dividendo = entrada.nextInt();
		
		System.out.print("Introduce el divisor: ");
		divisor = entrada.nextInt();
		
		while (dividendo >= divisor) {
			resto = dividendo - divisor;
			System.out.println(dividendo + " - " + divisor + " = " + resto);
			dividendo = resto;
		}
		System.out.println("El resto es " + resto);
	}

}
