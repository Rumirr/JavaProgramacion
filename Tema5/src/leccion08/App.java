package leccion08;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria c1 = new CuentaBancaria(1000);

		System.out.println("Balance inicial: " + c1.obtenerBalance() + "€.");

		c1.depositar(200);
		System.out.println("Después de depositar 200€: " + c1.obtenerBalance() + "€.");

		boolean confirmación = c1.retirar(1000);
		if (confirmación) {
			System.out.println("Después de retirar 200€: " + c1.obtenerBalance() + "€.");
		} else {
			System.out.println("ERROR - Balance insuficiente.");
		}
	}
}
