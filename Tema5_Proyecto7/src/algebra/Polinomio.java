package algebra;

public class Polinomio {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private double[] coeficientes;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Polinomio() {
		coeficientes = new double[3];
	}

	public Polinomio(int grado) {
		coeficientes = new double[grado + 1];
	}

	public Polinomio(double[] coefs) {
		coeficientes = coefs;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public double evaluar(double x) {
		double resultado = coeficientes[0];

		for (int i = 1; i < coeficientes.length; i++) {
			resultado = resultado + coeficientes[i] * Math.pow(x, i);
		}

		return resultado;
	}

	public Polinomio sumar(Polinomio p) {
		int grado = Math.max(getGrado(), p.getGrado());
		
		Polinomio resultado = new Polinomio(grado);

		for (int i = 0; i < resultado.coeficientes.length; i++) {

			resultado.coeficientes[i] = coeficientes[i] + p.coeficientes[i];
		}

		return resultado;
	}

	public Polinomio restar(Polinomio p) {
		int grado = Math.max(getGrado(), p.getGrado());

		Polinomio resultado = new Polinomio(grado);

		for (int i = 0; i < resultado.coeficientes.length; i++) {

			resultado.coeficientes[i] = coeficientes[i] - p.coeficientes[i];
		}

		return resultado;
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < coeficientes.length; i++) {
			if (i == 0) {
				resultado += coeficientes[i];
			} else {
				resultado = resultado + " + " + coeficientes[i] + "·x^" + i;
			}
		}
		return resultado;
	}
	// Métodos de acceso

	public int getGrado() {
		return coeficientes.length - 1;
	}
}
