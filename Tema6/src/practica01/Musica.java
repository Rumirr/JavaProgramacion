package practica01;

public class Musica extends Medio {
	/*
	* ******************************************************
	* *****************_ATRIBUTOS_**************************
	* ******************************************************
	*/

	private String artista, estilo;
	
	/*
	* ******************************************************
	* *****************_CONTRUCTORES_***********************
	* ******************************************************
	*/

	public Musica(String nombre, double duracion, String artista, String estilo) {
		super(nombre, duracion);
		this.artista = artista;
		this.estilo = estilo;
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

	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}
