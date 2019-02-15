package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		// Crear un objeto grupo y mostrar su toString()
		Grupo grupo1 = new Grupo(1, "FP", 1, "A");

		// System.out.println(grupo1.toString());

		// Probamos el método leeDatos().
//		Grupo grupo2 = new Grupo();
//		grupo2.leeDatos();
//		System.out.println(grupo2.toString());

		// Probamos el método toString() de Alumno.
		Alumno alumno1 = new Alumno(1001, "Alcaraz", "Sergio", grupo1);
		// System.out.println(alumno1.toString());

		// Probamos el método leeDatos() de Alumno.
		// Alumno alumno2 = new Alumno();
		// alumno2.leeDatos();
		// System.out.println(alumno2.toString());

		Instituto instituto = new Instituto();

		Alumno alumno3 = new Alumno(1003, "Artigao", "Aitor", grupo1);

		instituto.addAlumno(alumno1);
		instituto.addAlumno(alumno3);
		instituto.muestraAlumnos();
//		instituto.delAlumno(2000);
		
		System.out.println("Hay matriculados " 
				+ instituto.numAlumnos() + " alumnos.");
		
		System.out.println("Posición del alumno con número de expediente 2000: " + instituto.buscaAlumno(1003));

	}

}