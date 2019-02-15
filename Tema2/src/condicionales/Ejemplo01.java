package condicionales;
import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		
		if (edad < 18) {
			
			System.out.print("No puedes pasar.");
			
		} else {
			
			System.out.println("Adelante.");
			
		}
	}
}
