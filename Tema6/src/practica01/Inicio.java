package practica01;

public class Inicio {

	public static void main(String[] args) {

		// Medio me1 = new Medio();

		Mp3 mp1 = new Mp3("MP3", 180, "Carlos", "Programación", 1);

		Ogg o1 = new Ogg("Priueba Ogg", 120, "Prog", "Programación", 252);
		
		System.out.println("mp1");
		mp1.reproducir();
		
		
		
		System.out.println("\no1");
		o1.reproducir();

		
		Medio m1;
		m1 = new Mp3("Prueba", 15, "Prueba", "Prueba", 2);
		System.out.println("\nObjeto tipo medio:");
		m1.reproducir();
		((Mp3) m1).guardar();
		
		
		Guardable g1;
		g1 = new Ogg("Prueba", 15, "Prueba", "Prueba", 2);
		System.out.println("\nObjeto de tipo Guardable.");
		g1.guardar();
	}
}
