package condicionales;
import java.util.Scanner;

/*
 * 
 * Ejercicio: Crea un programa que guarde el precio de un producto 
 * en una constante y que pida una cantidad al usuario.
 * Si la cantidad es menor, indicará que falta dinero.
 * En caso contrario, dirá "Gracias por la compra".
 * 
 */



public class Ejemplo02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		final float PRECIO = 152.35f;
		float dineroUsuario;
		
		System.out.print("Inserte la cantidad de dinero que posees: ");
		dineroUsuario = entrada.nextFloat();
		
		if (PRECIO <= dineroUsuario) {
			
			System.out.println("Gracias por su compra!");
			
		} else {
			
			System.out.println("Importe insuficiente para comprar el producto!");

		}
		
	}

}
