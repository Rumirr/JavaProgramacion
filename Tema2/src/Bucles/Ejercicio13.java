package Bucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num, resultado;
		
		System.out.print("Número a multiplicar: ");
		num = entrada.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			resultado = num * i;
			System.out.println(num + "x" + i + "= " + resultado);
		}

	}

}
