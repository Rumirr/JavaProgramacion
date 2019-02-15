package leccion06c;

public class Circulo {

	int x, y; // Coordenadas del centro
	float radio;
	String color;

	Circulo() {
	}

	Circulo(int x, int y, float radio, String color) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}

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
