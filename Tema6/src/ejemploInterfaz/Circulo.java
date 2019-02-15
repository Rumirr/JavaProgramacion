package ejemploInterfaz;

public class Circulo implements Figura2D, Mostrable {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int x, y;
	private float radio;
	private String color;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Circulo(int x, int y, float radio, String color) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public void mostrar() {
		System.out.println("Datos del círculo:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("color = " + color);
	}
	// Métodos de acceso

}
