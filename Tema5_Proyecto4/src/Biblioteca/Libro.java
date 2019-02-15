package Biblioteca;

public class Libro {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String titulo, isbn;
	private Autor[] autores;
	private static int anyoActual;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Libro(String titulo, String isbn, Autor[] autores) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public String toString() {

		String resultado = "Título: " + titulo + "\nISBN: " + isbn + "\nAutor: \n" + autores[0].getNombre()
				+ "\nAño actual: " + anyoActual;

		String resultado2 = "Título: " + titulo + "\nISBN: " + isbn + "\nVarios autores: \n" + muestraAutores()
				+ "\nAño actual: " + anyoActual;

		if (autores.length > 1) {
			return resultado2;
		} else {
			return resultado;
		}
	}

	public String muestraAutores() {

		String listaAutores = "";

		for (int i = 0; i < autores.length; i++) {
			if (i == 0) {
				listaAutores += autores[i].getNombre();
			} else {
				listaAutores += " - " + autores[i].getNombre();
			}
		}
		return listaAutores;
	}
	// Métodos de acceso

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}
}
