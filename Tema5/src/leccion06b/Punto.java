package leccion06b;

public class Punto {

	int x, y; // coordenadas
	String color;

	Punto(){}
	
	Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	void mostrar() {
		System.out.println("El punto de color " + color + " se encuentra en las coordenadas " + x + "," + y + ".");
	}
}
