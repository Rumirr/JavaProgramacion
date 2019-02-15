package leccion06c;

public class App {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(0,0,5,"Rojo");

//		c1.x=0;
//		c1.y=0;
//		c1.radio=5;
//		c1.color="rojo";
		
		c1.mostrar();
		System.out.printf("Área de c1: %.2f",c1.area());
		System.out.printf("\nPerímetro de c1: %.2f",c1.perimetro());
	}
	
}
