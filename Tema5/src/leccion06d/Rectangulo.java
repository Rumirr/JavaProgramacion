package leccion06d;

public class Rectangulo {

	// Atributos
	int x, y; // coordenadas de la esquina izquierda superior
	int base, altura;
	String color;

	// Constructores

	Rectangulo() {
	}

	Rectangulo(int x, int y, int base, int altura, String color) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	// Contructor para crear rectángulos cuyo vértice sea (0,0)
	Rectangulo(int base, int altura, String color) {
		this.x = 0;
		this.y = 0;

		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	// Contructor para crear rectángulos cuyo vértice sea (0,0) y color negro.
	Rectangulo(int base, int altura) {
		x = 0;
		y = 0;
		color = "Negro";

		this.base = base;
		this.altura = altura;
	}


	// Otros métodos
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

		if ((posX <= xPosFinal && posX >= x) && (posY <= yPosFinal && posY >= y)) {
			return true;
		} else {
			return false;
		}
	}
}
