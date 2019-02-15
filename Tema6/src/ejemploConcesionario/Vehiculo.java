package ejemploConcesionario;

public abstract class Vehiculo {
	/*
	* ******************************************************
	* *****************_ATRIBUTOS_**************************
	* ******************************************************
	*/
	
	private String matricula, marca, modelo;

	

	/*
	* ******************************************************
	* *****************_CONTRUCTORES_***********************
	* ******************************************************
	*/
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	// Constructores que llaman otro constructor

	/*
	* ******************************************************
	* *****************_OTROS MÉTODOS_**********************
	* ******************************************************
	*/

	public abstract void mostrar();
	
	// Métodos de acceso

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
