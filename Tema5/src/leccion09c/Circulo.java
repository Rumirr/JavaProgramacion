package leccion09c;

public class Circulo {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */
	
	private int x, y; // Coordenadas del centro
	private float radio;
	private String color;

	/*
	 * ******************************************************
	 * *****************_CONSTRUCTORES_**************************
	 * ******************************************************
	 */
	
	
	
	public Circulo() {
	}

	public Circulo(int x, int y, float radio, String color) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */
	
	public void mostrar() {
		System.out.println("Coordenadas: (" + x + "," + y + ")");
		System.out.println("Radio: " + radio);
		System.out.println("Color: " + color);
	}

	public double area() {
		return Math.pow(radio, 2) * Math.PI;

	}

	public double perimetro() {
		return Math.PI * radio;
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

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
