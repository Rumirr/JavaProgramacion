package leccion07;

public class App {

	public static void main(String[] args) {
		
		// Creamos una variable de tipo Persona y también creamos un objeto de tipo persona
		// y lo almacenamos en la variable cliente1
		Persona cliente1 = new Persona("22617281F","Juan","Pérez López");
		
		// Creamos otro cliente
		Persona cliente2 = new Persona("11677288T","Raúl","Valls Amengual");
		
		// Creamos otro cliente
		Persona cliente3= new Persona("22192011H");
		
		// creamos otro cliente
		Persona cliente4=new Persona("Fulanito", "López");
		
		// Mostramos los valores
		cliente1.mostrar();
		cliente2.mostrar();
		cliente3.mostrar();
		cliente4.mostrar();
		
	}

}
