package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
				
		Cilindro c1 = new Cilindro();
		
		System.out.print("Altura = ");
		c1.setAltura(entrada.nextInt());
		
		System.out.print("Radio = ");
		c1.setRadio(entrada.nextInt());
		
		System.out.println("El área = " + c1.getArea());
		System.out.println("El volumen = " + c1.getVolumen());
		
		System.out.println("\n");
		
		
		// cilindro 2
		int radio, altura;
		
		System.out.print("Altura = ");
		altura = entrada.nextInt();
		
		System.out.print("Radio = ");
		radio = entrada.nextInt();
		
		Cilindro c2 = new Cilindro(altura, radio);
		
		System.out.println("El área = " + c2.getArea());
		System.out.println("El volumen = " + c2.getVolumen());
		
	}

}
