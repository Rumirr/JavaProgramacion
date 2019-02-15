import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, resto, cociente;
		
		System.out.print("Inserte el dividiendo: ");
		num1 = entrada.nextInt();
		
		System.out.print("Inserte el divisor: ");
		num2 = entrada.nextInt();
		
		resto = num1 % num2;
		cociente = num1 / num2;
		
		System.out.print("El resto es igual a " + resto + " y el cociente es igual a " + cociente);
	}

}
