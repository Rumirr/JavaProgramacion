package ejemploPersona;

import java.util.Scanner;

public class Empleado extends Persona {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private int numSeguridadSocial;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Empleado(String dni, String apellidos, String nombre, int numSeguridadSocial) {
		super(dni, apellidos, nombre);
		this.numSeguridadSocial = numSeguridadSocial;
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
		System.out.println("Nº de seguridad social: " + numSeguridadSocial);
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

		System.out.println("Nº de seguridad social: ");
		numSeguridadSocial = scanner.nextInt();
	}
	// Métodos de acceso

}
