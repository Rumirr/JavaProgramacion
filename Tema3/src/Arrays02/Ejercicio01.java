package Arrays02;

public class Ejercicio01 {

	public static void main(String[] args) {

		int edades[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };
		boolean edadEncontrada = false;

		for (int edad : edades) {
			if (edad == 35) {
				edadEncontrada = true;
			}
			if (edadEncontrada) {
				System.out.println("Localizada persona de 35 años.");
			}
			break;
		}
		if (edadEncontrada == false) {
			System.out.println("No se encontro la persona buscada.");
		}
	}

}
