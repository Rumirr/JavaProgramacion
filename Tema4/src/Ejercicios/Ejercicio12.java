package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	

	public static void main(String[] args) {
		int enteros[] = new int[3];
		
		pedirDatos(enteros);
		ordenarDatos(enteros);
		System.out.println();
		mostrarDatos(enteros);

	}

	static void pedirDatos(int datos[]) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < datos.length; i++) {
			System.out.print("Número entero " + (i + 1) + ": ");
			datos[i] = entrada.nextInt();
			
		}
	}

	static void ordenarDatos(int datos[]) {
		int posMin, aux;

		for (int i = 0; i < datos.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < datos.length; j++) {
				if (datos[j] < datos[posMin]) {
					posMin = j;
				}
			}
			aux = datos[i];
			datos[i] = datos[posMin];
			datos[posMin] = aux;
		}
	}

	static void mostrarDatos(int datos[]) {
		int ultimaPos = datos.length - 1;

		for (int i = 0; i < datos.length; i++) {
			if (i == ultimaPos) {
				System.out.print(datos[i]);
			} else {
				System.out.print(datos[i] + ", ");
			}
		}
	}
}
