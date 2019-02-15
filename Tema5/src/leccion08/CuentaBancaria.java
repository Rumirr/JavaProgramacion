package leccion08;

public class CuentaBancaria {

	
	/* 
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */
	
	float balance;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	CuentaBancaria() {
	}

	CuentaBancaria(float balance) {
		this.balance = balance;
	}

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	void depositar(float cantidad) {
		balance += cantidad;
	}

	boolean retirar(float cantidad) {
		if (cantidad <= balance) {
			balance -= cantidad;
			return true;
		}

		return false;

	}

	float obtenerBalance() {
		return balance;
	}
	


}
