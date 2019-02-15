package ejemploConcesionario;

public class Moto extends Vehiculo{
	/*
	* ******************************************************
	* *****************_ATRIBUTOS_**************************
	* ******************************************************
	*/

	private int cilindrada;

	
	
	/*
	* ******************************************************
	* *****************_CONTRUCTORES_***********************
	* ******************************************************
	*/

	public Moto(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
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
		System.out.println("Cilindrada: " + cilindrada);
	}
	
	// Métodos de acceso

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
