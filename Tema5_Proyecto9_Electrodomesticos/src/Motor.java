
public class Motor {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int id;
	private String fabricante, modelo;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Motor(int id, String fabricante, String modelo) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	// Métodos de acceso

	public String getFabricante() {
		return fabricante;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}
}
