package leccion01;

public class App {

	public static void main(String[] args) {
		
		// Creamos una variable de tipo Persona y también creamos un objeto de tipo persona
		// y lo almacenamos en la variable cliente1
		Persona cliente1 = new Persona();
		
		// Damos valores a las propiedades de cliente1
		cliente1.dni = "22617281F";
		cliente1.apellidos = "Pérez López";
		cliente1.nombre = "Juan";
		
		// Creamos otro cliente
		Persona cliente2 = new Persona();
		
		cliente2.dni = "11677288T";
		cliente2.apellidos = "Valls Amengual";
		cliente2.nombre = "Raúl";
		
		// Mostramos los valores guardados.
		// System.out.println("El primer cliente se llama " + cliente1.nombre + " " + cliente1.apellidos + " y tiene DNI " + cliente1.dni);
		cliente1.mostrar();
		cliente2.mostrar();
		
	}

}
