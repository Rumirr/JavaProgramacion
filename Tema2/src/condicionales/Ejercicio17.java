package condicionales;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float num1, num2, total;
		int opcion;

		System.out.println("********CALCULADORA PARA IDIOTAS********");
		System.out.print("Escoje una de las opciones: \n1) Suma. \n2) Resta. \n3) Mutiplicaión. \n4) División.");
		opcion = entrada.nextInt();

		System.out.print("Inserte el primer número: ");
		num1 = entrada.nextFloat();
		System.out.print("Inserte el segundo número: ");
		num2 = entrada.nextFloat();

		switch (opcion) {
		case 1:
			total = num1 + num2;
			System.out.println("El resultado de: " + num1 + " + " + num2 + " = " + total);
			break;
		case 2:
			total = num1 - num2;
			System.out.println("El resultado de: " + num1 + " - " + num2 + " = " + total);
			break;
		case 3:
			total = num1 * num2;
			System.out.println("El resultado de: " + num1 + " x " + num2 + " = " + total);
			break;
		case 4:
			total = num1 / num2;
			System.out.println("El resultado de: " + num1 + " / " + num2 + " = " + total);
		default:
			System.out.println("Opción incorrecta.");
			break;
		}
	}

}
