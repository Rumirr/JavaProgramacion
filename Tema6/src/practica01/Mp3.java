package practica01;

public class Mp3 extends Musica implements Guardable{
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int modo;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Mp3(String nombre, double duracion, String artista, String estilo, int modo) {
		super(nombre, duracion, artista, estilo);
		this.modo = modo;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}
	
	// Métodos de acceso

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}

}
