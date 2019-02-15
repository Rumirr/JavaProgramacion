package geometria;

public class Cilindro {

	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */
	
	private int altura, radio;
	
	final private static double PI = 3.141592;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Cilindro() {
	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	
		
	
	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public double getArea() {
		return (2 * PI * radio * (radio + altura));
	}

	public double getVolumen() {
		return PI * Math.pow(radio, 2) * altura;
	}
	
	public String toString() {
		return "altura = " + altura + ". radio = " + radio;
	}
	
	
	// Métodos de acceso

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
}
