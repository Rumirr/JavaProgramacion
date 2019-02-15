package Biblioteca;

public class Autor {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String nombre, email;
	private int fechaNacimiento;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */
	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;

	}

	// Constructores que llaman otro constructor
	
	public Autor(String nombre) {
		this(nombre, "Unknown", 0);
	}
	
	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public String toString() {
		return "Nombre: " + nombre + "\nEmail: " + email + "\nAño de nacimiento: " + fechaNacimiento;
	}

	
	// Métodos de acceso
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
