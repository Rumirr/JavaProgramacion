package ejemploConcesionario;

public class Coche extends Vehiculo {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int potencia;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Coche(String matricula, String marca, String modelo, int potencia) {
		super(matricula, marca, modelo);
		this.potencia = potencia;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */
	@Override
	public void mostrar() {
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Potencia: " + potencia);
	}

	// Métodos de acceso

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
