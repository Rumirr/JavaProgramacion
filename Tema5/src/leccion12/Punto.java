package leccion12;

public class Punto {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int x, y; // coordenadas
	private String color;
	private static int numPuntos;

	/*
	 * ******************************************************
	 * *****************_CONSTRUCTORES_**********************
	 * ******************************************************
	 */

	public Punto() {
		numPuntos++;
	}

	public Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
		
		numPuntos++;
	}

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	void mostrar() {
		System.out.println("El punto de color " + color + " se encuentra en las coordenadas " + x + "," + y + ".");
	}

	// Métodos de acceso.
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public  static int getNumPuntos() {
		return numPuntos;
	}
}
