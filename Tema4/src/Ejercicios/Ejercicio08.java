package Ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {

		System.out.println("Máximo: " + max(10, 2));
		System.out.println("Mínimo: " + min(10, 2));

	}

	static int max(int x, int y) {
		if (x < y) {
			return y;
		} else {
			return x;
		}
	}

	static int min(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

}
