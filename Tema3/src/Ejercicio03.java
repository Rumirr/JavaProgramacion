
public class Ejercicio03 {

	public static void main(String[] args) {

		String edades[][] = { { "Pepe Sánchez", "Raúl Verne", "Carlos Peréz", "Luis Mateos" },
				{ "21", "20", "32", "27" } };
		int posMin;
		String aux;

		// Ordenamos la tabla
		for (int i = 0; i < edades[0].length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < edades[0].length; j++) {
				if (Integer.parseInt(edades[1][j]) < Integer.parseInt(edades[1][posMin])) {
					posMin = j;
				}
			}
			// Intercambiamos las edades
			aux = edades[1][i];
			edades[1][i] = edades[1][posMin];
			edades[1][posMin] = aux;

			// Intercambiamos los nombres
			aux = edades[0][i];
			edades[0][i] = edades[0][posMin];
			edades[0][posMin] = aux;
		}
		
		// Mostramos la tabla
		System.out.println("Nombre \t\tEdad");
		for (int i = 0; i < edades[0].length; i++) {
			for (int j = 0; j < edades.length; j++) {
				System.out.print(edades[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
