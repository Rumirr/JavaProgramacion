package ejemploInterfaz;

public class Inicio {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(10, 10, 100, "Verde");

		Figura2D c2 = new Circulo(5, 5, 50, "Rojo");

		Mostrable c3 = new Circulo(0, 0, 30, "Amarillo");
		
		

	}

	static void calculaArea(Figura2D figura) {
		System.out.println(figura.area());
	}
}
