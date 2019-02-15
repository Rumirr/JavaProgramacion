import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Inserte el primer número para la mutiplicaión: ");
		num1 = entrada.nextInt();
		
		System.out.print("Indique el segundo número de la multiplicación: ");
		num2 = entrada.nextInt();
		
		System.out.print("El resultada es " + num1 * num2);
	}

}
