package ejemploPersona;

import java.util.Scanner;

public class Proveedor extends Persona {
	/*
	* ******************************************************
	* *****************_ATRIBUTOS_**************************
	* ******************************************************
	*/

	private int numProveedor;
	
	/*
	* ******************************************************
	* *****************_CONTRUCTORES_***********************
	* ******************************************************
	*/

	public Proveedor(String dni, String apellidos, String nombre, int numProveedor) {
		super(dni, apellidos, nombre);
		this.numProveedor = numProveedor;
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
		System.out.println("Nº de proveedor: " + numProveedor);
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

		System.out.println("Nº de proveedor: ");
		numProveedor = scanner.nextInt();
	}
	// Métodos de acceso

}
