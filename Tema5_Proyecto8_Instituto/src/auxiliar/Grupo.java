package auxiliar;

import java.util.Scanner;

public class Grupo {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	int id, curso;
	String nivel, clase;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Grupo() {
	}

	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public String toString() {
		return "ID: " + id + "\nNivel: " + nivel + "\nCurso: " + "\nClase: " + clase;
	}

	public void leerDatos() {
		Scanner grupoScanner = new Scanner(System.in);
		System.out.print("Id del curso: ");
		id = grupoScanner.nextInt();
		System.out.print("Número del curso: ");
		curso = grupoScanner.nextInt();
		grupoScanner.nextLine();
		System.out.print("Letra de la clase: ");
		clase = grupoScanner.nextLine();
		System.out.print("Nivel del grupo: ");
		nivel = grupoScanner.nextLine();

	}

	// Métodos de acceso

}
