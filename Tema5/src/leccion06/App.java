package leccion06;

public class App {

	public static void main(String[] args) {
		
		// Creamos una variable de tipo Persona y también creamos un objeto de tipo persona
		// y lo almacenamos en la variable cliente1
		Persona cliente1 = new Persona("22617281F","Juan","Pérez López");
		
		// Creamos otro cliente
		Persona cliente2 = new Persona("11677288T","Raúl","Valls Amengual");
		
		// Mostramos los valores guardados.
		// System.out.println("El primer cliente se llama " + cliente1.nombre + " " + cliente1.apellidos + " y tiene DNI " + cliente1.dni);
		cliente1.mostrar();
		cliente2.mostrar();
		
	}

}
