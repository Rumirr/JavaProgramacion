import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner entrda = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Inserte el dividiendo: ");
		num1 = entrda.nextInt();
		
		System.out.print("Inserte el divisor: ");
		num2 = entrda.nextInt();
		
		System.out.print("El resto es igual a " + num1 % num2);
		
	}

}
