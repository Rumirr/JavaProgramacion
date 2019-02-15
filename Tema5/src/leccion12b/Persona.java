package leccion12b;

public class Persona {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String dni, nombre, apellidos;

	private static int numPersonas;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Persona() {
		numPersonas++;
	}

	public Persona(String dni, String nombre, String apellidos) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
		numPersonas++;

	}

	// contructores que llaman a otro constructor
	
	public Persona(String dni) {

		this(dni, "desconocido", "desconocido");

	}

	public Persona(String nombre, String apellidos) {

		this("00000000A", nombre, apellidos);
	}

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public void mostrar() {
		System.out.println("El cliente se llama " + nombre + " " + apellidos + " y tiene DNI " + dni);
	}

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

	public static int getNumPersonas() {
		return numPersonas;
	}

	public static void setNumPersonas(int numPersonas) {
		Persona.numPersonas = numPersonas;
	}

}
