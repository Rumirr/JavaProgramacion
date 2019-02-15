package Bucles;

import java.util.Scanner;

public class Ejercicio05b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, i=0, resultado;
		
		System.out.print("Introduce un número a multiplicar: ");
		num = entrada.nextInt();
		
		do {
			resultado =i * num;
			System.out.println(num + " x " + i + " = " + resultado);
			i++;
		} while (i != 11);
	}
}