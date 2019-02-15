
public class ActividadesCadenas {

	public static void main(String[] args) {

		String frase = "El vecino trabaja en Google";

		// length()
		System.out.println("La frase \'" + frase + "\' tiene " + frase.length() + " caracteres.");
		System.out.println(
				"___________________________________________________________________________________________________________");

		// charAt()
		System.out.println("En la posición 4 de la frase \'" + frase + "\' se encuentra la letra " + frase.charAt(4));
		System.out.println(
				"___________________________________________________________________________________________________________");

		// replace(char 'caracter_antiguo', char 'caracter_nuevo')
		System.out.println("Se ha reemplazado la letra de e de la frase \'" + frase + "\' por la letra z = \'"
				+ frase.replace('e', 'z') + "\'");
		System.out.println(
				"___________________________________________________________________________________________________________");

		// replace(CharSequence cadena_antigua, CharSequence cadena_nueva)
		System.out.println(
				"Se ha reemplazado \'El vecino\' por \'La vecina\' = " + frase.replace("El vecino", "La vecina"));
		System.out.println(
				"___________________________________________________________________________________________________________");

		// indexOf(String textoABuscar)
		System.out.println("Aquí se muestra la primera posición donde aparece la letra \'g\' de la frase  \'" + frase
				+ "\' = " + frase.indexOf('g'));
		System.out.println(
				"___________________________________________________________________________________________________________");

		// lastIndexOf(String textoABuscar)
		System.out.println(
				"Aquí se muestra la posición de la última ocurencia de la letra \'e\' = " + frase.lastIndexOf('e'));
		System.out.println(
				"___________________________________________________________________________________________________________");

		// int compareTo(String textoPorComparar)
		System.out.println("Comparando la \'" + frase + "\' con \'La vecina trabaja en Google\' = "
				+ frase.compareTo("La vecina trabaja en Google"));
		
		
		// El método cadena1.compareTo(cadena2) devuelve negativo, cero o positivo si cadena1 es menor, igual o mayor que cadena2 (respectivamente).
		
		String cadena1 = "Ordenador";
		String cadena2 = "Computadora";
		System.out.println();
		if (cadena1.compareTo(cadena2) < 0){
			System.out.println(cadena1 + "va antes de " + cadena2);
		} else if (cadena1.compareTo(cadena2) > 0) {
			System.out.println(cadena1 + " va después de " + cadena2);
		} else {
			System.out.println("Las dos cadenas son iguales");
		}
		
		System.out.println(
				"___________________________________________________________________________________________________________");

		// String substring(int inicio, int fin)
		System.out.println(
				"Se esta devolviendo 4 caracteres de la frase anteriormente utilizada = \'" + frase.substring(1,5) + "\'");
		System.out.println(
				"___________________________________________________________________________________________________________");

		// String[ ] split(String separador)
		System.out.println("\nSplit se utiliza para separar una cadena de caracteres indicando un caracter.");
		System.out.println("En este caso se separo la frase \"" + frase + "\" utilizando el espacio.\n");
		String separacionFrase[] = frase.split(" ");

		for (int i = 0; i < separacionFrase.length; i++) {
			System.out.println(separacionFrase[i]);
		}
		System.out.println(
				"___________________________________________________________________________________________________________");
		
		// String String.valueOf(número)
		System.out.println("\nString.valueOf(), convierte un numero en un string.");
		System.out.println(String.valueOf(100));
	}

}
