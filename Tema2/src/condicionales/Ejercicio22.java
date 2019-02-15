package condicionales;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int dia;
		final String ENTRE_SEMANA = "22:00";
		final String FIN_SEMANA = "14:00";
		String horario;

		System.out.println("********HORARIO DEL SUPERMERCADO**********");
		System.out.println("Escoge una de las opciones: \n1)Entre semana. \n2)Fin de semana.");
		dia = entrada.nextInt();

		horario = (dia == 1) ? ENTRE_SEMANA : FIN_SEMANA;
		System.out.println("\nHorario de cierre: " + horario);

	}

}
