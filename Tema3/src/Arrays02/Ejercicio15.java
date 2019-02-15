package Arrays02;

public class Ejercicio15 {

	public static void main(String[] args) {

		String productos[][] = { { "Tablet Samsung", "Móvil Sony", "Ipad Mini", "Móvil HTC" },
				{ "120", "115", "290", "95" } };
		float total = 0;
		int posMin = 0, posMax = 0;

		
		// MOstramos la los datos en forma de columna
		System.out.println("Artículos");
		System.out.println("===========================");
		for (int i = 0; i < productos[0].length; i++) {
			for (int j = 0; j < productos.length; j++) {
				System.out.print(productos[j][i] + "\t");
			}
			System.out.println();
		}

		
		
		// Sumamos los precios
		for (int i = 0; i < productos[1].length; i++) {
			total += Float.parseFloat(productos[1][i]);
		}
		
		System.out.println("\nTotal: " + total + "€");
		
		
		// Encontramos el precio mínimo y el precio máximo
		for (int i = 1; i < productos[1].length; i++) {
			if (Float.parseFloat(productos[1][i]) < Float.parseFloat(productos[1][posMin])) {
				posMin = i;
			}
			if (Float.parseFloat(productos[1][i]) > Float.parseFloat(productos[1][posMax])) {
				posMax = i;
			}
		}
		
		System.out.println("\nEl producto más barato es el \"" + productos[0][posMin] + "\"" + " con un precio de " + productos[1][posMin] + "€.");
		System.out.println("El producto más caro es el \"" + productos[0][posMax] + "\"" + " con un precio de " + productos[1][posMax] + "€.");
	}

}
