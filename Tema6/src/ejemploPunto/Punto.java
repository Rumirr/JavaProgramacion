package ejemploPunto;

public class Punto {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int x, y;
	private String color;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Punto)
			return x == ((Punto) obj).x && y == ((Punto) obj).y && color.equals(((Punto) obj).color);
		return false;
	}

	// Métodos de acceso

}
