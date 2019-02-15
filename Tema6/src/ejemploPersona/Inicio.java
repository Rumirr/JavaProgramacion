package ejemploPersona;

public class Inicio {

	public static void main(String[] args) {
//		Persona persona = new Persona("12345678Y", "Sánchez", "Luis");

//		persona.mostrar();
//		
//		Cliente cliente = new Cliente("87654321J", "López", "Juan", 751);
//		System.out.println();
//		cliente.mostrar();

//		Persona p1, p2, p3;

//		p1 = new Persona();
//		p2 = new Cliente("12345678j", "Sáez", "Juan", 1);
//		p3 = new ClienteVip("87654321L", "Pérez", "Jose", 2, false);
//
//		System.out.println("Método mostrar para p2:");
//		p2.mostrar();
//
//		System.out.println();
//		System.out.println("Método mostrar para p3:");
//		p3.mostrar();
//
//		System.out.println("\nLlamamos al método saluda() de p2: ");
//		((Cliente) p2).saluda();
		
		
		// Pruebas de métodos heredados de object
		Cliente c1 = new Cliente("12345678L", "Fernández", "Marcos", 101);
		Cliente c2 = new Cliente("12345678L", "Fernández", "Marcos", 101);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("\n¿Son iguales c1 y c2? " + (c1 == c2));
	}
}
