package leccion13;

public class App {

	public static void main(String[] args) {

		CuentaBancaria c1 = new CuentaBancaria(1000);

		System.out.println("Balance inicial: " + c1.getBalance() + "€.");

		c1.depositar(200,10);
		System.out.println("Después de depositar 200€: " + c1.getBalance() + "€.");

		c1.retirar(300, 20);
		System.out.println("Después de retirar 300€ con 20% de comisión: " + c1.getBalance() + "€.");
		
	}
}
