package leccion10c;

public class Rectangulo {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */
	
	private int x, y; // coordenadas de la esquina izquierda superior
	private int base, altura;
	private String color;
	private static int numRectangulos;

	/*
	 * ******************************************************
	 * *****************_CONSTRUCTORES_**************************
	 * ******************************************************
	 */

	public Rectangulo() {
		numRectangulos++;
	}

	public Rectangulo(int x, int y, int base, int altura, String color) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
		
		numRectangulos++;
	}

	// Contructor para crear rectángulos cuyo vértice sea (0,0)
	public Rectangulo(int base, int altura, String color) {	
		this(0,0,base,altura,color);
	}

	// Contructor para crear rectángulos cuyo vértice sea (0,0) y color negro.
	public Rectangulo(int base, int altura) {
		this(0,0,base,altura,"Negro");
	}


	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */
	
	public void mostrar() {
		System.out.println("Coordenadas de la esquina izquierda superior: (" + x + "," + y + ")");
		System.out.println("Base: " + base + ", Altura: " + altura);
		System.out.println("Color: " + color);
	}

	public int area() {
		return base * altura;
	}

	public int perimetro() {
		return 2 * (base + altura);
	}

	public void mover(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public Boolean contiene(int posX, int posY) {
		int xPosFinal = x + base;
		int yPosFinal = y + altura;

		if ((posX <= xPosFinal && posX >= x) && (posY <= yPosFinal && posY >= y)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Métodos de acceso
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNumRectangulos() {
		return numRectangulos;
	}
}
