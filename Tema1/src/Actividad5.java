import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String producto;
		float precio, precioFinal;
		int descuento;

		System.out.print("¿Cúal es el nombre del producto? ");
		producto = entrada.nextLine();

		System.out.print("¿Cúal es el precio del producto? ");
		precio = entrada.nextFloat();

		System.out.print("¿Cúal es el descuento del producto? ");
		descuento = entrada.nextInt();

		precioFinal = precio - ((precio * descuento) / 100);

		System.out.print("\nEl producto, " + producto + ", con el precio de " + precio + " euros y un descueto de "
				+ descuento + "%. Costará " + precioFinal + ", rebajado.");

	}

}
