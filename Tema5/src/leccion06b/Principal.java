package leccion06b;

public class Principal {

	public static void main(String[] args) {

		Punto punto1 = new Punto(0,0,"Rojo");

		Punto punto2 = new Punto();

		punto2.x = 15;
		punto2.y = 0;
		punto2.color = "Azul";
		
		punto1.mostrar();
		punto2.mostrar();
	}

}
