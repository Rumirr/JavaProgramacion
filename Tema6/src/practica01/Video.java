package practica01;

public class Video extends Medio {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String director, idioma;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Video(String nombre, double duracion, String director, String idioma) {
		super(nombre, duracion);
		this.director = director;
		this.idioma = idioma;
	}
	
	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo...");
	}

	// Métodos de acceso

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
