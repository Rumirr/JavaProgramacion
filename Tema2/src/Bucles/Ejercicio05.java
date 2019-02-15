package Bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num, resultado;
		int i = 0;

		System.out.println("Tabla de multiplicar de que número? ");
		num = entrada.nextInt();
		
		while (i <= 10) {
		
			resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);
			i++;
		}
	}
}
