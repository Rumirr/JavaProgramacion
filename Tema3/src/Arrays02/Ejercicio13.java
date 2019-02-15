package Arrays02;

public class Ejercicio13 {

	public static void main(String[] args) {

		
		// Cada sub-array es una columna
//		float medidas[][] = { { 8.5f, 14.2f, 11, 7 }, { 1020, 1021, 1022, 1023 }, { 40, 35, 45, 50 } };
//
//		
//		System.out.println("Registros meteorológicos");
//		System.out.println("========================");
//		for (int i = 0; i < medidas[0].length; i++) {
//			for (int j = 0; j < medidas.length; j++) {
//				System.out.print(medidas[j][i] + "\t");
//			}
//			System.out.println("");
//		}
		
		
		 //Cada sub-array es una fila		
		double medidas[][] = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 }, { 11, 1022, 45 }, { 7, 1023, 50 } };

		System.out.println("Registros meteorológicos");
		System.out.println("========================");

		for (int i = 0; i < medidas.length; i++) {
			for (int j = 0; j < medidas[0].length; j++) {
				System.out.print(medidas[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
