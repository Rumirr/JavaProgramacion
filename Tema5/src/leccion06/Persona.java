package leccion06;

public class Persona {

	String dni;
	String nombre;
	String apellidos;

	Persona() {
		System.out.println("Acabo de ejecutarme. Soy el constructor de la clase Persona.");
	}

	Persona(String dni, String nombre, String apellidos) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	void mostrar() {
		System.out.println("El cliente se llama " + nombre + " " + apellidos + " y tiene DNI " + dni);
	}
}
