package Arrays01;

public class Ejercicio14 {

	public static void main(String[] args) {

		int primos[] = new int[10000];
		int divisores = 0, num = 2;

		long tiempoInicio=System.currentTimeMillis();
		
		for (int i = 0; i < primos.length; i++) {

			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					divisores++;
				}
				if (divisores == 3) {
					break;
				}
			}
			if (divisores == 2) {
				primos[i] = num;
				divisores = 0;
			} else {
				divisores = 0;
				i--;
			}
			num++;

		}

		for (int i : primos) {
			System.out.println(i);
		}
		
		System.out.println("Tiempo transcurido: " + (System.currentTimeMillis() - tiempoInicio) + " milisegundos.");

	}

}
