package leccion11;

public class App {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Nissan", "Fairlady Z", "Azul Marino", "6332 IWA", 130000);
		Coche c2 = new Coche("Audi", "R8 Coupé V10", "Rojo", "4835 GVT", 199600);

		c2.setDescuento(5);
		
		System.out.println("Descuento del coche 1 = " + c1.getDescuento() + "%");
		System.out.println("Descuento del coche 2 = " + c2.getDescuento() + "%");
		
		System.out.println("\nAccediento a la variable descuento a través de \"Coche.getDescuento\" = " + Coche.descuento + "%");
				
		System.out.println();
		System.out.println("El precio del coche " + c1.getMarca() + " " + c1.getModelo() + " = " + c1.verPrecio() + " €.");
		System.out.println("El precio del coche " + c2.getMarca() + " " + c2.getModelo() + " = " + c2.verPrecio() + " €.");
	}
}
