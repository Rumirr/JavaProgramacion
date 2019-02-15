package Arrays01;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		double potencias[]=new double[50];
		int i=0;
		
		for (i = 0; i < potencias.length; i++) {
			potencias[i]=(int) Math.pow(2, i);
		}
		
		i=0;
		while (true) {
			System.out.println(potencias[i]);
			i++;
			if (i==20) {
				break;
			}
		}

	}

}
