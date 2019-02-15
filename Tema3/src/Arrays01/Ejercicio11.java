package Arrays01;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		String comandos[]= new String[1000];
		final String PARADA="ejecutar";
		
		
		for (int i = 0; i < comandos.length; i++) {
			System.out.print("Comandos a seguir mi maestro: ");
			comandos[i]=entrada.nextLine();
			
			if (comandos[i].toLowerCase().equals(PARADA)) {
				break;
			}
		}
		System.out.println("\nComandos a ejecutar maestro");
		System.out.print("==============================================\n");
		for (int i = 0; i < comandos.length; i++) {
			System.out.println("> " + comandos[i]);
			if (comandos[i].equals(PARADA)) {
				break;
			}
		}
		System.out.println("\nEJECUTANDO COMANDOS.....");
	}

}
