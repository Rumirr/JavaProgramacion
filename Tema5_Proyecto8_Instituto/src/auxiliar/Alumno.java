package auxiliar;

import java.util.Scanner;

public class Alumno {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	int numExpediente;
	String apellidos, nombre;
	Grupo grupo;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Alumno() {
	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nNúmero de expediente: "
				+ numExpediente + "\nGrupo: \n" + grupo.toString();
	}

	public void leerDatos() {
		Scanner alumnoScanner = new Scanner(System.in);

		System.out.print("Nombre del alumno: ");
		nombre = alumnoScanner.nextLine();
		System.out.print("Apellidos del alumno: ");
		apellidos = alumnoScanner.nextLine();
		System.out.print("Número de expediente: ");
		numExpediente = alumnoScanner.nextInt();
		System.out.print("\nGrupo del alumno: \n");
		grupo = new Grupo();
		grupo.leerDatos();

	}

	// Métodos de acceso

	public int getNumExpediente() {
		return numExpediente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombre() {
		return nombre;
	}
}
