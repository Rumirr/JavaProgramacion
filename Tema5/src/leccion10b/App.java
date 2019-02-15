package leccion10b;

public class App {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		
		c1.setX(0);
		c1.setY(0);
		c1.setRadio(5);
		c1.setColor("rojo");
		
		c1.mostrar();
		System.out.printf("Área de c1: %.2f",c1.area());
		System.out.printf("\nPerímetro de c1: %.2f",c1.perimetro());
		
		System.out.println();
		// Comprobamos que la variable numCirculos es estática 
		System.out.println("numCirculos en c1 vale = " + c1.getNumCirculos());
		System.out.println("numCirculos en c2 vale = " + c2.getNumCirculos());
		System.out.println("numCirculos en c3 vale = " + c3.getNumCirculos());
	}
	
}
