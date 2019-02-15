package Arrays02;

public class Ejercicio05 {

	public static void main(String[] args) {

		float temp[] = { 15, 16.1f, 16, 15.4f, 15, 14, 10.2f, 11, 11.5f, 10, 10.1f, 9.8f, 9, 6 };

		int posMin = 0, posMax = 0;

		for (int i = 1; i < temp.length; i++) {

			if (temp[i] < temp[posMin]) {
				posMin = i;
			}
			
			if (temp[i] > temp[posMax]) {
				posMax = i;
			}
		}

		System.out.println("La temperatura mínima es " + temp[posMin] + " ºC y se encuentra en la posición " + posMin
				+ " del array.");

		System.out.println("\nLa temperatura máxima es " + temp[posMax] + " ºC y se encuentra en la posición " + posMax
				+ " del array.");
	}

}
