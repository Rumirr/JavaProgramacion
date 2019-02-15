package leccion07b;

public class Circulo {

	// Atributos
	int x, y; // Coordenadas del centro
	float radio;
	String color;

	// Constructores
	Circulo() {
	}

	Circulo(int x, int y, float radio, String color) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}

	Circulo(int x, int y){
		
		this(x,y,1,"Verde");
	}
	

	
	// Otros métodos
	void mostrar() {
		System.out.println("Coordenadas: (" + x + "," + y + ")");
		System.out.println("Radio: " + radio);
		System.out.println("Color: " + color);
	}

	double area() {
		return Math.pow(radio, 2) * Math.PI;

	}

	double perimetro() {
		return Math.PI * radio;
	}

}
