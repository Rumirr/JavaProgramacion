package Inicio;

import java.util.Scanner;

import Biblioteca.Autor;
import Biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombre, email, titulo, isbn;
		int fechaNacimiento;
		
//	Autor a1= new Autor("Pierce Brown", "pbrown@gmail.com", 1987);
//	Autor a2= new Autor("Miguel de Cervantes");
//	
//	System.out.println(a1.toString());
//	System.out.println();
//	System.out.println(a2.toString());
//		
//	
//	Libro l1=new Libro("Amanecer rojo", "21654566W", a1);
//	Libro l2=new Libro("El Quijote", "16543546846kfd", a2);
//	
//	System.out.println();
//	System.out.println(l1.toString());
//	System.out.println();
//	System.out.println(l2.toString());
		
		// leemos autor 1
		System.out.println("Autor 1");
		System.out.println("===========");
		System.out.print("Nombre: " );
		nombre=entrada.nextLine();
		
		System.out.print("Email: ");
		email = entrada.nextLine();
		
		System.out.print("Año de nacimiento: ");
		fechaNacimiento=entrada.nextInt();
		
		Autor a1=new Autor(nombre, email, fechaNacimiento);
		System.out.println();
		System.out.println("Autor: \n" + a1.toString());
		
		entrada.nextLine();
		// leemos libro 1
		System.out.println();
		System.out.println("Libro 1");
		System.out.println("===========");
		System.out.print("Título: " );
		titulo=entrada.nextLine();
		
		System.out.print("ISBN: ");
		isbn = entrada.nextLine();
		
		Libro l1=new Libro(titulo, isbn, a1);
		System.out.println();
		System.out.println("Libro: " + l1.toString());
	}
}
