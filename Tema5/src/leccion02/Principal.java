package leccion02;

public class Principal {

	public static void main(String[] args) {

		Punto punto1 = new Punto();

		punto1.x = 0;
		punto1.y = 0;
		punto1.color = "negro";
		punto1.mostrar();

		Punto punto2 = new Punto();

		punto2.x = 15;
		punto2.y = 0;
		punto2.color = "azul";
		punto2.mostrar();
	}

}
