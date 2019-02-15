package Arrays01;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double notas[]=new double[10];
		int i =0;
		
		while (i < notas.length) {
			System.out.print("Nota " + (i +1) + " : ");
			notas[i]=entrada.nextDouble();
			i++;
		}
		i=0;
		while (i < notas.length) {
			System.out.println(notas[i]);
			i++;
		}
	}

}
