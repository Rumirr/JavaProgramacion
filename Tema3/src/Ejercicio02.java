import java.util.Scanner;

/*
 * Escribe un programa que almacene los nombres de marcas de coches en un array de 50 elememntos.
 * La condición de parada será que el usuario escriba la palabra "stop".
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String coches[] = new String[50];
		final String PARADA= "stop";

		for (int i = 0; i < coches.length; i++) {
			System.out.print("Introduce la marca del coche " + (i + 1) + ": ");
			coches[i] = entrada.nextLine();
			if (coches[i].toLowerCase().equals(PARADA)) {
				break;
			}
		}
		
		for (int i = 0; i < coches.length; i++) {
			System.out.println("Marca " + (i + 1) +": " +coches[i]);
			if (coches[i].equals(PARADA)) {
				break;
			}
		}
	}

}
