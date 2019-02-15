package Arrays02;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String alumnos[][] = new String[4][3];

		float notaTrismestre, examenes, trabajos, actitud;

		// Insertamos los datos
		System.out.println("Introducción de notas");
		System.out.println("===================================");

		for (int i = 0; i < alumnos[0].length; i++) {
			System.out.print("Nombre: ");
			alumnos[0][i] = entrada.nextLine();

			System.out.print("Exámenes: ");
			alumnos[1][i] = entrada.nextLine();

			System.out.print("Trabajos: ");
			alumnos[2][i] = entrada.nextLine();

			System.out.print("Actitud: ");
			alumnos[3][i] = entrada.nextLine();

			System.out.println();
		}

		// Calculamos y mostramos las notas del trimestre para cada alumno
		System.out.println("Notas de evaluación");
		System.out.println("===============================");
		for (int i = 0; i < alumnos[0].length; i++) {

			// paso las notas a número y lo guardo dentro de la variable correspondiente
			examenes = Float.parseFloat(alumnos[1][i]);
			trabajos = Float.parseFloat(alumnos[2][i]);
			actitud = Float.parseFloat(alumnos[3][i]);

			// Calculo la nota del trimestre
			notaTrismestre = (examenes * 50 + trabajos * 40 + actitud * 10) / 100;

			System.out.println(alumnos[0][i] + ": " + notaTrismestre);
		}
	}

}
