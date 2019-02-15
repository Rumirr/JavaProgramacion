package leccion07;

public class Persona {

	// Atributos
	String dni;
	String nombre;
	String apellidos;

	
	// Constructores
	Persona() {
		System.out.println("Acabo de ejecutarme. Soy el constructor de la clase Persona.");
	}

	Persona(String dni, String nombre, String apellidos) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	Persona(String dni){
		
		this(dni, "desconocido", "desconocido");
		
	}
	
	Persona(String nombre, String apellidos){
		
		this("00000000A", nombre, apellidos);
	}
	
	// Otros métodos
	void mostrar() {
		System.out.println("El cliente se llama " + nombre + " " + apellidos + " y tiene DNI " + dni);
	}
}
