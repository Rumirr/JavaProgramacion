package Arrays02;

public class Ejercicio15b {

	public static void main(String[] args) {

		String productos[][] = { 
				{"Tablet Samsung", "120"},
				{"Móvil Sony", "115"},
				{"Ipad Mini", "290"},
				{"Móvil HTC", "95"}
		};
		float total = 0;
		int posMin = 0, posMax = 0;

		
		// MOstramos la los datos en forma de columna
		System.out.println("Artículos");
		System.out.println("===========================");
		for (int i = 0; i < productos.length; i++) {
			for (int j = 0; j < productos[0].length; j++) {
				System.out.print(productos[i][j] + "\t");
			}
			System.out.println();
		}

		
		
		// Sumamos los precios
		for (int i = 0; i < productos.length; i++) {
			total += Float.parseFloat(productos[i][1]);
		}
		
		System.out.println("\nTotal: " + total + "€");
		
		
		// Encontramos el precio mínimo y el precio máximo
		for (int i = 1; i < productos.length; i++) {
			if (Float.parseFloat(productos[i][1]) < Float.parseFloat(productos[posMin][1])) {
				posMin = i;
			}
			if (Float.parseFloat(productos[i][1]) > Float.parseFloat(productos[posMax][1])) {
				posMax = i;
			}
		}
		
		System.out.println("\nEl precio menor: " + productos[posMin][1]);
		System.out.println("El precio mayor: " + productos[posMax][1]);
	}

}
