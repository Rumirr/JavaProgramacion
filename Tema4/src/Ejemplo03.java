import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		/*
		 * Procedimiento: no devuelve datos. Función: devuelve un dato. Método:
		 * Procedimiento o función en una clase. Rutina o subrutina: Procedimiento o
		 * función.
		 */

		Scanner entrada = new Scanner(System.in);

		String nombre, apellidos;

		System.out.print("Apellidos: ");
		apellidos = entrada.nextLine();

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();

		mostrar(apellidos, nombre);
	}

	static void mostrar(String apellidos, String nombre) {

		System.out.println("*********************");
		System.out.println("Me llamo " + nombre + apellidos);
		System.out.println("*********************");

	}

}
