package Arrays02;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Planta-Fila-Columna
		float temperaturas[][][] = new float[3][3][3];
		float total = 0;
		int habFuncionales=0;

		temperaturas[0][1][1] = 24.5f;
		temperaturas[1][0][2] = 22;
		temperaturas[2][2][2] = 36.5f;
		temperaturas[0][2][2] = 28;
		temperaturas[1][2][0] = 35;

		// Sumamos las temperaturas
		// Recorremos las plantas (i = planta)
		for (int i = 0; i < temperaturas.length; i++) {

			// Para cada planta recorremos las filas (j = filas)
			for (int j = 0; j < temperaturas[0].length; j++) {
				
				// Recorremos cada columna (k = columna)
				for (int k = 0; k < temperaturas[0][0].length; k++) {
					total += temperaturas[i][j][k];
					if (temperaturas[i][j][k] != 0) {
						habFuncionales++;
					}
				}
			}
			
		}
		System.out.println("Suma de temperaturas = " + total + " ºC");
		System.out.println("La temperatura media = " + total / habFuncionales + " ºC");
	}

}
