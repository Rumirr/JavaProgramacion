package ejemploPersona;

import java.util.Scanner;

// Al hacer la clase Cliente, final, no se podrán crear clases hijas.

public class Cliente extends Persona {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int numCliente;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Cliente(String dni, String apellidos, String nombre, int numCliente) {
		super(dni, apellidos, nombre);
		this.numCliente = numCliente;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Nº de cliente: " + numCliente);
	}

	@Override
	public void darDeAlta() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("DNI: ");
		setDni(scanner.nextLine());

		System.out.println("Apellidos: ");
		setApellidos(scanner.nextLine());

		System.out.println("Nombre: ");
		setNombre(scanner.nextLine());

		System.out.println("Nº de cliente: ");
		numCliente = scanner.nextInt();
	}

	public void saluda() {
		System.out.println("Hola, soy un objeto Cliente.");
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Cliente)
			return getDni().equals(((Cliente) obj).getDni());
		return false;

	}

	// Métodos de acceso

}
