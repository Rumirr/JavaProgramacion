package inicio;

import java.util.Scanner;

import baraja.Baraja;
import baraja.Carta;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Baraja b1 = new Baraja();
		
		int suma = 0;
		boolean resulSuma = true;
		Carta auxCarta;
		char continuarSiNo;
		
		b1.ordenar();
		b1.barajar();
		b1.cortar();
		
		
		do {
			System.out.println("Carta:");
			auxCarta = b1.extraer();
			System.out.println(auxCarta.toString());
			suma += auxCarta.getValor();
			
			System.out.println("\nDeseas otra carta (s/n)?");
			continuarSiNo=entrada.next().charAt(0);
			if (continuarSiNo == 'n' || continuarSiNo == 'N') {
				break;
			}
			
			
			if (suma >= 21) {
				resulSuma=false;
			}
		} while (resulSuma);
		
		if (suma == 21) {
			System.out.println("Puntuación perfecta!");
		} else if(suma < 21){
			System.out.println("Su puntuación es: " + suma);
		} else {
			System.out.println("Sobrepasaste 21. Has perdidio!");
		}
		
		
		entrada.close();
	}
}
