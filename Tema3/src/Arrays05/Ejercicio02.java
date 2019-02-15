package Arrays05;

public class Ejercicio02 {

	public static void main(String[] args) {

		float cotizaciones[] = { 47.5f, 47.8f, 48, 48.1f, 47.7f, 47.3f, 46, 47.9f, 48.05f, 48.7f };

		int posMin = 0, posMax = 0;

		for (int i = 1; i < cotizaciones.length; i++) {
			if (cotizaciones[i] < cotizaciones[posMin]) {
				posMax = i;
			}
			if (cotizaciones[i] > cotizaciones[posMax]) {
				posMax = i;
			}
		}

		System.out.println("Valor máximo es \"" + cotizaciones[posMax] + "\" y se encuentra en la posición " + posMax);
		System.out.println("Valor mínimo es \"" + cotizaciones[posMin] + "\" y se encuentra en la posición " + posMin);

	}

}
