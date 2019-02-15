package Arrays02;

public class Ejercicio08 {

	public static void main(String[] args) {


		int humedades[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };

		int posMin = 0, posMax = 0;

		for (int i = 1; i < humedades.length; i++) {

			if (humedades[i] < humedades[posMin]) {
				posMin = i;
			}

			if (humedades[i] > humedades[posMax]) {
				posMax = i;
			}
		}

		System.out.println("La humedad máxima fue del " + humedades[posMax] + "% a las " + posMax + tramoHorario(posMax));

		System.out.println("\nLa humedad mínima fue del " + humedades[posMin] + "% a las " + posMin + tramoHorario(posMin));
	}
	
	
	// Esta fincion me devolvera un string con las palabra "medianoche, madrugada, de la tarde, de la noche", dependiendo de la hora
		
	 static String tramoHorario (int hora) {
		 
		 String resultado = "";
		 
		 switch (hora) {
			case 0:
				resultado = " medianoche.";
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				resultado = " de la madrugada.";
				break;
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
				resultado = " de la mañana.";
				break;
			case 12:
				resultado = " del mediodía.";
				break;
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				resultado = " de la tarde.";
				break;
			case 20:
			case 21:
			case 22:
			case 23:
				resultado = " de la noche.";
				break;
			}
		 
		 return resultado;
	 }
	
	
	
	

}
