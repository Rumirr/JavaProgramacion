package instituto;

import auxiliar.*;

public class Instituto {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private final int MAX_ALUMNOS = 250;
	private Alumno[] alumnos;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */

	public Instituto() {
		alumnos = new Alumno[MAX_ALUMNOS];
	}

	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public void addAlumno(Alumno alu) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}
	}

	public void delAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				alumnos[i] = null;
				break;
			}
		}
	}

	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].getNombre() + " " + alumnos[i].getApellidos());
			}
		}
	}

	public int numAlumnos() {
		int cantidad = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}
		}
		return -1;
	}

	// Métodos de acceso

}
