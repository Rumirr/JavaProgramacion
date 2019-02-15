package Ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {

		String planetas[] = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };
		
		System.out.println("Posición del planeta buscado: " + buscar(planetas, "tierra"));
	}
	
	static int buscar(String valores[], String palabra) {
		int pos = -1;
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i].toLowerCase().equals(palabra.toLowerCase())) {
				pos= i;
				break;
			}
		}
		
		return pos;
	}
	
}
