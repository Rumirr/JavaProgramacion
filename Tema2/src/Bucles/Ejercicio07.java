package Bucles;

public class Ejercicio07 {
	public static void main(String[] args) {

		int i = 0;
		int par = 0;

		while (i != 50) {
			if (par % 2 == 0) {
				System.out.println(par);
				par++;
				i++;
			} else {
				par++;
			}
		}

	}

}
