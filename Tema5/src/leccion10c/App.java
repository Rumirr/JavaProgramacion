package leccion10c;

public class App {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		Rectangulo r4 = new Rectangulo();

//		r1.x= 50;
//		r1.y=100;
//		r1.base=20;
//		r1.altura=15;
//		r1.color="Amarillo";

		r1.setX(50);
		r1.setY(100);
		r1.setBase(20);
		r1.setAltura(15);
		r1.setColor("Amarillo");

		r1.mostrar();

		System.out.println("Área de rect: " + r1.area());
		System.out.println("Perímetro de rect: " + r1.perimetro());

		System.out.println("Desplazamos el rectágulo 30 px a la derecha y 50 px hacia abajo: ");
		r1.mover(30, 50);
		r1.mostrar();

		System.out.println("\nComprobamos si el punto (80,150) está dentro del rectángulo.");
		System.out.println("Reultado:" + r1.contiene(50, 115));

		System.out.println();
		// Probamos la variable estática numRectangulos
		System.out.println("numRectangulos para r1 vale = " + r1.getNumRectangulos());
		System.out.println("numRectangulos para r2 vale = " + r2.getNumRectangulos());
		System.out.println("numRectangulos para r3 vale = " + r3.getNumRectangulos());
		System.out.println("numRectangulos para r4 vale = " + r4.getNumRectangulos());
	}
}
