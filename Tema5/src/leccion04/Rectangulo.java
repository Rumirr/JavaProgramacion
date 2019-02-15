package leccion04;

public class Rectangulo {

	int x, y; // coordenadas de la esquina izquierda superior
	int base, altura;
	String color;

	void mostrar() {
		System.out.println("Coordenadas de la esquina izquierda superior: (" + x + "," + y + ")");
		System.out.println("Base: " + base + ", Altura: " + altura);
		System.out.println("Color: " + color);
	}

	int area() {
		return base * altura;
	}

	int perimetro() {
		return 2 * (base + altura);
	}

	void mover(int dx, int dy) {
		x += dx;
		y += dy;
	}

	Boolean contiene(int posX, int posY) {
		int xPosFinal = x + base;
		int yPosFinal = y + altura;
		
		if ((posX<=xPosFinal && posX>=x) && (posY<=yPosFinal && posY >= y)) {
			return true;
		} else {
			return false;
		}
	}
}
