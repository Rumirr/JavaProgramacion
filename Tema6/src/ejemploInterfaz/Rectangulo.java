package ejemploInterfaz;

public class Rectangulo implements Figura2D, Mostrable {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int x, y, base, altura;
	private String color;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Rectangulo(int x, int y, int base, int altura, String color) {
		super();
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
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
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * (base + altura);
	}

	@Override
	public void mostrar() {
		System.out.println("Datos del rectángulo:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Base = " + base);
		System.out.println("Altura = " + altura);
		System.out.println("Color = " + color);
	}

	// Métodos de acceso

}
