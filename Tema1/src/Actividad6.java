import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String producto;
		float precio, total;
		int unidades;
		
		System.out.print("¿Cómo se llama el producto? ");
		producto = entrada.nextLine();
		
		System.out.print("¿Cúal es el precio del producto? ");
		precio = entrada.nextFloat();
		
		System.out.print("¿Cúal es el número de productos comprados? ");
		unidades = entrada.nextInt();
		
		total = precio * unidades;
		
		System.out.print("El total es " + total + " euros.");
		
	}

}
