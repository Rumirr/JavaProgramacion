import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[5];

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Precio " + i + ": ");
			precios[i] = entrada.nextDouble();
		}

		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}
	}

}
