package ejemploPersona;

public abstract class Persona {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String dni, apellidos, nombre;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */
	
	public Persona(String dni, String apellidos, String nombre) {
		super();
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	
	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public void mostrar() {
		System.out.println("DNI: " + dni + "\nApellidos: " + apellidos + "\nNombre: " + nombre);
	}
	

	public abstract void darDeAlta();

	// Métodos de acceso

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
