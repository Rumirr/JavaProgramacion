package condicionales;

import java.util.Scanner;

public class Ejercicio22b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String dia, cierre;
		
		System.out.println("Dia? ");
		dia = entrada.nextLine();
		
		dia = dia.toLowerCase();
		
		cierre = (dia.equals("entre semana")) ? "22:00" : "14:00";
		
		System.out.println("Horario de cierre " + cierre);
	}

}
