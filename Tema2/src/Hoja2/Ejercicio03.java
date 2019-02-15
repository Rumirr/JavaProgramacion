package Hoja2;

public class Ejercicio03 {

	public static void main(String[] args) {

		int potencia = 1, i = 1;

		do {
			System.out.println(potencia);
			potencia = (int) Math.pow(3, i);
			i++;
		} while (potencia < 12000);

	}

}
