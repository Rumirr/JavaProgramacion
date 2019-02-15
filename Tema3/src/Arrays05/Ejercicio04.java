package Arrays05;

public class Ejercicio04 {

	public static void main(String[] args) {

		float temperaturas[] = { 3.2f, 3.5f, 7.2f, 0.1f, 1, -2.3f, -5, 3.4f, 4, 4, 4, 1.4f, 2.5f, -0.4f, -3.6f };

		boolean temp = false;
		int pos = 0;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < 0) {
				temp = true;
				pos = i;
				break;
			}
		}

		if (temp) {
			System.out.println("El número negativo se encuentra en la posición " + pos + " del array.");
		} else {
			System.out.println("-1");
		}
	}

}
