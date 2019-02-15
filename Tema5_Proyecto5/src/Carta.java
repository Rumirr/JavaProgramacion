public class Carta {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */
	public static enum Palo {
	    diamante, corazón, pica, trébol
	}
	
	private int valor; // 1-13
	private Palo palo; // 0=diamantes, 1=corazones, 2=picas, 3=tréboles

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public boolean compara(Carta carta) {
		return valor == carta.getValor() && palo == carta.getPalo();
	}

	public String toString() {
		String valorCarta[] = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
				"Caballo", "Reina", "Rey" };

		String resultado = valorCarta[valor - 1] + " de " + palo.toString();

		return resultado;
	}

	// Métodos de acceso

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

}
