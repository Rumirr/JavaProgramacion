package Bucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float total=0;
		
		
		for (int i = 0; i < 4 ; i++) {
			System.out.print("Precio del producto: ");
			 total += entrada.nextFloat();
		}
		System.out.println(total);
	}

}
