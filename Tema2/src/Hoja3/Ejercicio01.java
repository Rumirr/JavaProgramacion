package Hoja3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = (int) (Math.random()*10+1);
		int intentos = 1, num;
		while (intentos !=4) {
			System.out.print("Adivina el número: ");
			num = entrada.nextInt();
			
			if (num == aleatorio) {
				System.out.println("Has acertado en " + intentos + " intentos.");
				break;
			}
			intentos++;
		}
		
		if (intentos == 4) {
			System.out.println("Has fallado.");
		}
	}

}
