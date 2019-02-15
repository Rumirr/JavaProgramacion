package practica01;

public class Ogg extends Musica implements Guardable{
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int version;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Ogg(String nombre, double duracion, String artista, String estilo, int version) {
		super(nombre, duracion, artista, estilo);
		this.version = version;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
