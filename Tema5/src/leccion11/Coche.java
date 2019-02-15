package leccion11;

public class Coche {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private String marca, modelo, color, matricula;
	private float precio;
	public static int descuento;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Coche(String marca, String modelo, String color, String matricula, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.precio = precio;
	}


	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */
	public void arrancar() {
		System.out.println("Coche arrancando.");
	}
	
	public void detenerse() {
		System.out.println("Deteniendo el coche.");
	}
	
	public void acelerar() {
		System.out.println("Acelerando el coche.");
	}
	
	public void frenar() {
		System.out.println("Frenando el coche.");
	}
	
	public float verPrecio() {
		return precio - ((precio * descuento) / 100);
	}
	
	// Métodos de acceso
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public static int getDescuento() {
		return descuento;
	}

	public static void setDescuento(int descuento) {
		Coche.descuento = descuento;
	}
	
	
}
