package Arrays02;

public class Ejercicio14 {

	public static void main(String[] args) {

		String productos[][] = { { "Tablet Samsung", "Móvil Sony", "Ipad Mini", "Móvil HTC" },
				{ "120", "115", "290", "95" } };
		float total = 0;

		System.out.println("Artículos");
		System.out.println("===========================");
		for (int i = 0; i < productos[0].length; i++) {
			for (int j = 0; j < productos.length; j++) {
				System.out.print(productos[j][i] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < productos[1].length; i++) {
			total += Float.parseFloat(productos[1][i]);
		}

		System.out.println();
		System.out.println("Total: " + total + "€");
	}

}
