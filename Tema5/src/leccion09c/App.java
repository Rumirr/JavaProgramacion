package leccion09c;

public class App {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();

		c1.setX(0);
		c1.setY(0);
		c1.setRadio(5);
		c1.setColor("rojo");
		
		c1.mostrar();
		System.out.printf("Área de c1: %.2f",c1.area());
		System.out.printf("\nPerímetro de c1: %.2f",c1.perimetro());
	}
	
}
