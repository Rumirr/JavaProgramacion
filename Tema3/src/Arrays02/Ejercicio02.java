package Arrays02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		float estaturas[]=new float[10];
		
		for (int i = 0; i < estaturas.length; i++) {
			System.out.println("Altura de la " + (i+1) + " persona: ");
			estaturas[i]=entrada.nextFloat();
		}
		
		for (float estatura : estaturas) {
			if (estatura > 1.90f) {
				System.out.println("Estatura mayor a 1.90 m encontrada.");
				break;
			}
		}
	}

}
