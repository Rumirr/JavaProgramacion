package Biblioteca;

public class Libro {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String titulo, isbn;
	private Autor autor;
	private static int anyoActual;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Libro(String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public Libro(String titulo) {
		this.titulo=titulo;
	}
	
	// Constructores que llaman otro constructor

	
	
	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public String toString() {
		
		String resultado= "Título: " + titulo + "\nISBN: " + isbn + "\nAutor: \n" + autor.toString() + "\nAño actual: " + anyoActual;
		
		return resultado;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}
}
