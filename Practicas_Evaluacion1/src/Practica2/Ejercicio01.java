package Practica2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int telefonos[] = new int[3];
		int posMin, aux;
		int ultimaPos = telefonos.length - 1;

		// Pido los datos
		for (int i = 0; i < telefonos.length; i++) {
			System.out.print("Teléfono " + (i +1) +": ");
			if(entrada.hasNextInt()) {
			telefonos[i] = entrada.nextInt();
			} else {
				System.out.println("ERROR. Se pidió un número de teléfono.");
				entrada.nextLine();
				i--;
			}
		}
		
		// Ordeno los datos
		for (int i = 0; i < telefonos.length -1; i++) {
			posMin = i;
			
			for (int j = i +1; j < telefonos.length; j++) {
				if (telefonos[j] < telefonos[posMin]) {
					posMin=j;
				}
			}
			aux=telefonos[i];
			telefonos[i]=telefonos[posMin];
			telefonos[posMin]=aux;
		}
		
		// Muestro los datos
		System.out.println();
		for (int i = 0; i < telefonos.length; i++) {
			if (i == ultimaPos) {
				System.out.print(telefonos[i]);
			} else {
				System.out.print(telefonos[i] + ", ");
			}
		}
	}

}
