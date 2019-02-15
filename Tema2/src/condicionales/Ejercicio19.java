package condicionales;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce un número: ");
		if (entrada.hasNextInt()) {
			
			num = entrada.nextInt();
			if (num == 3) {
				System.out.println("Has acertado!");
			} else if (num >=1 && num <= 10) {
				System.out.println(num);
			}else {
				
				System.out.println("Vueleve a intentar!");
				
			}			
		} else {
			
			System.out.println("Se esperaba un número entero. ERROR");
		}
		
	}

}
