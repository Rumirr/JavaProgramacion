package leccion07a;

public class App {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(50,100,20,15,"Amarillo");
		
//		r1.x= 50;
//		r1.y=100;
//		r1.base=20;
//		r1.altura=15;
//		r1.color="Amarillo";
		
		r1.mostrar();
		
		System.out.println("Área de rect: " + r1.area());
		System.out.println("Perímetro de rect: " + r1.perimetro());
		
		System.out.println("Desplazamos el rectágulo 30 px a la derecha y 50 px hacia abajo: ");
		r1.mover(30, 50);
		r1.mostrar();
		
		System.out.println("\nComprobamos si el punto (80,150) está dentro del rectángulo.");
		System.out.println("Reultado:" + r1.contiene(50, 115));
	}
}
