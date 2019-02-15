package Ejercicios;

public class Ejercicio09 {

	public static void main(String[] args) {

		if (bisiesto(2018) == true) {
			System.out.println("Es bisiesto.");
		} else {
			System.out.println("No es bisiesto.");
		}

	}

	static boolean bisiesto(int year) {

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
