package Ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {

		System.out.println(meses(12));

	}

	static String meses(int num) {
		String mes = "";
		
		if (num < 1 || num > 12) {
			System.out.println("Has insertado un número de més no válido.");
			System.out.println("Programa finalizado.");
			System.exit(0);
		}

		switch (num) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return  "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Setiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		}
		return null;
	}
}
