package Arrays02;

public class Ejercicio17 {

	public static void main(String[] args) {

		String alumnos[][] = {
				{ "Jose Luis Martinez", "Antonia Ruiz", "Marcos Ramírez", "Juana Herranz", "Alberto López" },
				{ "7", "9", "10", "4", "7" } };

		float total = 0;
		int posMin = 0;

		// Mostramos el array en forma de tabla
		System.out.println("Almnos \tNotas");
		System.out.println("============================");
		for (int i = 0; i < alumnos[0].length; i++) {
			for (int j = 0; j < alumnos.length; j++) {
				System.out.print(alumnos[j][i] + "\t");
			}
			System.out.println();
		}

		// Sumamos las notas
		for (int i = 0; i < alumnos[1].length; i++) {
			total += Float.parseFloat(alumnos[1][i]);
		}

		// Calculamos la media y la mostramos
		total /= alumnos[1].length;
		System.out.println("\nMedia del curso: " + total);

		// Buascamos la nota mínima
		for (int i = 1; i < alumnos[1].length; i++) {
			if (Float.parseFloat(alumnos[1][i]) < Float.parseFloat(alumnos[1][posMin])) {
				posMin = i;
			}
		}
		
		System.out.println();
		System.out.println(alumnos[0][posMin] + " tiene la nota más baja, un " + alumnos[1][posMin]);
	}

}
