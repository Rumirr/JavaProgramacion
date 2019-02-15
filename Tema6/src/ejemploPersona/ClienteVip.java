package ejemploPersona;

public class ClienteVip extends Cliente{
	/*
	* ******************************************************
	* *****************_ATRIBUTOS_**************************
	* ******************************************************
	*/

	private boolean premium;
	
	/*
	* ******************************************************
	* *****************_CONTRUCTORES_***********************
	* ******************************************************
	*/
	public ClienteVip(String dni, String apellidos, String nombre, int numCliente, boolean premium) {
		super(dni, apellidos, nombre, numCliente);
		this.premium = premium;
	}

	// Constructores que llaman otro constructor

	/*
	* ******************************************************
	* *****************_OTROS MÉTODOS_**********************
	* ******************************************************
	*/
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Premium: " + premium);
	}
	
	// Métodos de acceso

}
