
public class Lavadora {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int id;
	private static int iva = 21;
	private Motor motor;
	private String marca;
	private float precio;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Lavadora(int id, Motor motor, String marca, float precio) {
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public String toString() {
		return "Código: " + id + ", Motor: " + motor.getFabricante() + ", Marca: " + marca + ", Precio: " + precio + " €.";
	}

	// Métodos de acceso

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public static int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		Lavadora.iva = iva;
	}
}
