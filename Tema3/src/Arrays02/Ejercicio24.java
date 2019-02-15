package Arrays02;

public class Ejercicio24 {

	public static void main(String[] args) {

		String hueco[][][] = new String[3][3][3];

		int numAleatorio, rojo = 0, azul = 0;

		// Insertamos datos
		for (int i = 0; i < hueco.length; i++) {
			for (int j = 0; j < hueco[0].length; j++) {
				for (int k = 0; k < hueco[0][0].length; k++) {
					numAleatorio = (int) (Math.random() * 2 + 1);
					if (numAleatorio == 1) {
						hueco[i][j][k] = "rojo";
						rojo++;
					} else {
						hueco[i][j][k] = "azul";
						azul++;
					}
				}
			}
		}

//		// Contamos los datos
//		for (int i = 0; i < hueco.length; i++) {
//			for (int j = 0; j < hueco[0].length; j++) {
//				for (int k = 0; k < hueco[0][0].length; k++) {
//					if (hueco[i][j][k].equals("rojo")) {
//						rojo++;
//					} else {
//						azul++;
//					}
//				}
//			}
//		}

		for (int i = 0; i < hueco.length; i++) {
			System.out.println("Planta " + (i + 1));
			System.out.println("=====================");
			for (int j = 0; j < hueco.length; j++) {
				for (int k = 0; k < hueco.length; k++) {
					System.out.print(hueco[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println("Bolas rojas = " + rojo);
		System.out.println("Bolas azules = " + azul);

	}

}
