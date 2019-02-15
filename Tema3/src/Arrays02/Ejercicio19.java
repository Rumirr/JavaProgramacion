package Arrays02;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nominas[][] = new String[3][4];
		float total = 0;

		
		// Insertamos los datos en el array
		for (int i = 0; i < nominas[0].length; i++) {
			System.out.print("Nombre del empleado: ");
			nominas[0][i] = entrada.nextLine();

			System.out.print("Apellidos del empleado: ");
			nominas[1][i] = entrada.nextLine();
			
			System.out.print("Salario del empleado: ");
			nominas[2][i] = entrada.nextLine();
			System.out.println();
		}

		// Calculamos el total
		for (int i = 0; i < nominas[0].length; i++) {
			total += Float.parseFloat(nominas[2][i]);
		}

		System.out.println("Nominas");
		System.out.println("================================");
		
		for (int i = 0; i < nominas[0].length; i++) {
			for (int j = 0; j < nominas.length; j++) {
				System.out.print(nominas[j][i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nSalario total a pagar:" + total + "€.");

	}

}
