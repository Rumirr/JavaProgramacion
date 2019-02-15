package Arrays01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String companyeros[] = new String[4];

		for (int i = 0; i < companyeros.length; i++) {
			System.out.print("Nombre de cuatro compañeros: ");
			companyeros[i] = entrada.next();
		}

		for (int i = 0; i < companyeros.length; i++) {
			System.out.println(companyeros[i]);
		}
	}

}
