package Arrays01;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[10];
		double nota = 0;
		int i = 0;

		while (i < notas.length && nota >= 0) {
			System.out.print("Nota " + (i + 1) + " : ");
			nota = entrada.nextDouble();
			notas[i]=nota;
//			notas[i] = entrada.nextDouble();
//			if (notas[i] < 0) {
//				break;
//			}
			i++;
		}
		i = 0;
		System.out.println();
		while (i < notas.length) {
			System.out.println("Nota " + (i + 1) + " : " + notas[i]);
			i++;
		}
	}

}
