package Inicio;

import Biblioteca.Autor;
import Biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Autor a1 = new Autor("Pierce Brown", "pbrown@gmail.com", 1987);
		Autor a2 = new Autor("Alfonso Jiménez", "ajimenez@gmail.com", 1970);
		Autor a3 = new Autor("Francisco Manual Pérez", "fperez@gmail.com", 1980);

		Autor autores1[] = new Autor[1];
		autores1[0] = a1;

		Libro l1 = new Libro("Amanecer rojo", "2316546gh", autores1);
		System.out.println(l1.toString());

		System.out.println();
		
		Autor autores2[] = new Autor[2];
		autores2[0] = a2;
		autores2[1] = a3;

		
		Libro l2 = new Libro("Aprende a programar con java", "516546546gh", autores2);
		System.out.println(l2.toString());
	}

}
