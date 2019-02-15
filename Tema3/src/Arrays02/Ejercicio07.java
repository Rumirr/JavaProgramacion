package Arrays02;

public class Ejercicio07 {

	public static void main(String[] args) {

		String dias[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		int espectadores[] = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };
		int posMin = 0, posMax = 0;

		for (int i = 1; i < espectadores.length; i++) {

			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			}

			if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
		}

		System.out.println("Esta semana la audiencia máxima fue el " + dias[posMax] + " con " + espectadores[posMax] + " de espectadores.");
		System.out.println("Esta semana la audiencia mínima fue el " + dias[posMin] + " con " + espectadores[posMin] + " de espectadores.");

	}

}
