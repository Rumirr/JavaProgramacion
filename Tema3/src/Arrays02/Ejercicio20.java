package Arrays02;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nominas[][] = new String[3][4];
		float total = 0;
		int posMin = 0, posMax = 0;

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

		// Mostramos los empleados y sus salarios
		System.out.println("Nominas");
		System.out.println("================================");

		for (int i = 0; i < nominas[0].length; i++) {
			for (int j = 0; j < nominas.length; j++) {
				System.out.print(nominas[j][i] + "\t");
			}
			System.out.println();
		}

		// Mostramos el salario total que tiene que pagar la empresa
		System.out.println("\nSalario total a pagar: " + total + "€.");

		// Calculamos el salario mínimo y máximo
		for (int i = 1; i < nominas[0].length; i++) {
			
			if (Float.parseFloat(nominas[2][i]) < Float.parseFloat(nominas[2][posMin])) {
				posMin=i;
			}
			if (Float.parseFloat(nominas[2][i]) > Float.parseFloat(nominas[2][posMax])) {
				posMax=i;
			}
		}
		
		System.out.println("\nEl empleado " + nominas[0][posMin] + " " + nominas[1][posMin]+ " es el que cobra menos. Este empleado cobra: " + nominas[2][posMin] + "€.");
		System.out.println("El empleado " + nominas[0][posMax] + " " + nominas[1][posMax]+ " es el que cobra más. Este empleado cobra: " + nominas[2][posMax] + "€.");

	}

}
