package conversion;

public class Conversor {
	/*
	* ******************************************************
	* *****************_ATRIBUTOS_**************************
	* ******************************************************
	*/

	private final static double KM_A_MILLAS = 0.6214, MB_A_ATM = 1013.25, CAL_A_JULIOS = 4.1869;
	
	/*
	* ******************************************************
	* *****************_CONTRUCTORES_***********************
	* ******************************************************
	*/
	public Conversor() {
	}
	
	// Constructores que llaman otro constructor

	/*
	* ******************************************************
	* *****************_OTROS MÉTODOS_**********************
	* ******************************************************
	*/

	public static double millas(double km) {
		return km * KM_A_MILLAS;
	}
	
	public static double km(double millas) {
		return millas / KM_A_MILLAS;
	}
	
	public static double atmosferas(double milibares) {
		return milibares / MB_A_ATM;
	}
	
	public static double milibares(double atmosferas) {
		return atmosferas * MB_A_ATM;
	}
	
	public static double julios(double calorias) {
		return calorias * CAL_A_JULIOS;
	}
	
	public static double calorias(double julios) {
		return julios / CAL_A_JULIOS;
	}
	// Métodos de acceso

}
