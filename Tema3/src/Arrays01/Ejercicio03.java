package Arrays01;

public class Ejercicio03 {

	public static void main(String[] args) {

//		"Mercurio", 5,43
//		"Venus", 5,24
//		"La Tierra",  5,51
//		"Marte", 3,93
//		"Júpiter", 1,33
//		"Saturno", 0.69
//		"Urano", 1.26
//		"Neptuno", 1.67
//		"Plutón" 1.88

		float densidades[] = { 5.43f, 5.24f, 5.51f, 3.94f, 1.33f, 0.69f, 1.26f, 1.67f, 1.88f };
		
		for (int i = 0; i < densidades.length; i++) {
			System.out.println(densidades[i] + " g/cm3");
		}
		
	}
	
	

}
