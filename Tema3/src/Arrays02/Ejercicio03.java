package Arrays02;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombres[]= new String[10];
		
		final String PARADA="nadie";
		final String NOMBRE_A_ENCONTRAR="calderón";
		
		boolean nombreEncontrado=false;

		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre " + (i+1) + ": ");
			nombres[i]=entrada.nextLine();
			
			if (nombres[i].toLowerCase().equals(PARADA)) {
				break;
			}
		}
		
		for (String nombre : nombres) {
			if (nombre != null && nombre.toLowerCase().equals(NOMBRE_A_ENCONTRAR)) {
				nombreEncontrado=true;
				break;
			}
		}
		
		if (nombreEncontrado) {
			System.out.println("\nCalderón de la Barca");
		} else {
			System.out.println("\nNombre no encontrado.");
		}

	}

}
