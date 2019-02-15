package Arrays01;

import java.util.Scanner;

public class Ejercicio11b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int comandos[] = new int[1000];
		final int PARADA = 5;

		System.out.println("Comandos a seguir mi maestro: ");
		System.out.println("1)Izquierda. \n2)Derecha. \n3)Arriba. \n4)Abajo. \n5)Matar \n6)Ejecutar los comandos.");
		for (int i = 0; i < comandos.length; i++) {
			comandos[i] = entrada.nextInt();

			if (comandos[i] == (PARADA)) {
				break;
			}
		}
		System.out.println("\nComandos a ejecutar maestro");
		System.out.print("==============================================\n");
		for (int i = 0; i < comandos.length; i++) {

			switch (comandos[i]) {
			case 1:
				System.out.println("> Izquierda");
				break;
			case 2:
				System.out.println("> Derecha");
				break;
			case 3:
				System.out.println("> Arriba");
				break;
			case 4:
				System.out.println("> Abajo");
				break;
			case 5:
				System.out.println("> Matar");
			default:
				break;
			}
		}
		System.out.println("\nEJECUTANDO COMANDOS.....");
	}
}
