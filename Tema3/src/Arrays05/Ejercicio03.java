package Arrays05;

public class Ejercicio03 {

	public static void main(String[] args) {

		float cotizaciones[] = { 47.5f, 47.8f, 48, 48.1f, 47.7f, 47.3f, 46, 47.9f, 48.05f, 48.7f };

		int ultimaPos = cotizaciones.length - 1;
		int posMin;
		float aux;

		for (int i = 0; i < cotizaciones.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < cotizaciones.length; j++) {
				if (cotizaciones[j] < cotizaciones[posMin]) {
					posMin = j;
				}
			}

			aux = cotizaciones[i];
			cotizaciones[i] = cotizaciones[posMin];
			cotizaciones[posMin] = aux;
		}

		for (int i = 0; i < cotizaciones.length; i++) {
			if (i == ultimaPos) {
				System.out.print(cotizaciones[i]);
			} else {
				System.out.print(cotizaciones[i] + ", ");
			}
		}
	}

}
