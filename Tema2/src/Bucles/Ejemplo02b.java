package Bucles;

import java.util.Scanner;

public class Ejemplo02b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String capital;
		
		System.out.print("Capital de Italia? ");
		capital = entrada.nextLine();
		
		while (!capital.equals("Roma")) {
			System.out.print("Has equivocado. Intenta otra vez: ");
			capital=entrada.nextLine();
		}
		
		System.out.println("Has acertado!!!");
	}

}
