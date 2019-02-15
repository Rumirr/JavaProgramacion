package leccion03;

public class Circulo {

	int x, y; // Coordenadas del centro
	float radio;
	String color;

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
