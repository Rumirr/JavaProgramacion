package Arrays02;

public class Ejercicio14b {

	public static void main(String[] args) {


		String productos[][] = { 
				{"Tablet Samsung", "120"},
				{"Móvil Sony", "115"},
				{"Ipad Mini", "290"},
				{"Móvil HTC", "95"}
		};
		float total = 0;

		System.out.println("Artículos");
		System.out.println("===========================");
		for (int i = 0; i < productos.length; i++) {
			for (int j = 0; j < productos[0].length; j++) {
				System.out.print(productos[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < productos.length; i++) {
			total += Float.parseFloat(productos[i][1]);
		}

		System.out.println();
		System.out.println("Total: " + total + "€");
	}

}
