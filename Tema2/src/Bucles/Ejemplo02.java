package Bucles;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String capital;
		
		do {
			System.out.print("Capital de Italia? ");
			capital = entrada.nextLine();
		} while (!capital.equals("Roma"));
		
		System.out.println("Has acertado!!!");
	}

}
