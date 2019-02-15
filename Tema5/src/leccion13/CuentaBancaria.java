package leccion13;

public class CuentaBancaria {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private float balance;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public CuentaBancaria() {
	}

	public CuentaBancaria(float balance) {
		this.balance = balance;
	}

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public void depositar(float cantidad) {
		balance += cantidad;
	}

	public void depositar(float cantidad, int comision) {
		balance = balance + cantidad - cantidad * comision / 100;
	}

	public boolean retirar(float cantidad) {
		if (cantidad <= balance) {
			balance -= cantidad;
			return true;
		}
		return false;
	}

	public boolean retirar(float cantidad, int comision) {
		float cantidadRetirada = cantidad + cantidad * comision / 100;
		
		if (cantidadRetirada <= balance) {
			balance -= cantidadRetirada;
			return true;
		}
		return false;
	}

	public float getBalance() {
		return balance;
	}

}
