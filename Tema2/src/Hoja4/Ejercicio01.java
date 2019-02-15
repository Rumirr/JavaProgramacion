package Hoja4;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int i = 2;
		
		while (i <= 200) {
			if (i%20 == 0) {
				System.out.println(i + " <== Divisible por 20");
			} else {
				System.out.println(i);
			}
			i+=2;
		}

	}

}
