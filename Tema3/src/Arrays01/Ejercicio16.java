package Arrays01;

public class Ejercicio16 {

	public static void main(String[] args) {

		float temp[] = { 15f, 15.1f, 16f, 15.4f, 15f, 14f, 10.2f, 11, 11.5f, 10f, 10.1f, 9.8f, 9f, 6f };
		float total = 0;
		int i = 0;

		for (float f : temp) {
			if (f > 12) {
				i++;
			}
			total += f;
		}
		total /= temp.length;
		
		System.out.printf("Temperatura media: %.2f ", total);
		System.out.println("\nLa temperatura a sobrepasado los 12ºC " + i + " veces.");

	}

}
