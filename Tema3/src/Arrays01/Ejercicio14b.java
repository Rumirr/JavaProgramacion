package Arrays01;

public class Ejercicio14b {

	public static void main(String[] args) {

		int primos[] = new int[100];
		int candidato = 3;
		boolean esPrimo = true;
		
		

		primos[0] = 2;

		long tiempoInicio=System.currentTimeMillis();
		
		for (int i = 1; i < primos.length; i++) {

			for (int j = 0; j < primos.length && primos[j] != 0; j++) {

				if (candidato < Math.pow(primos[j], 2)) {
					break;
				}

				if (candidato % primos[j] == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				primos[i] = candidato;

			} else {
				esPrimo = true;
				i--;
			}
			candidato += 2;
		}

		for (int i : primos) {
			System.out.println(i);
		}
		System.out.println("\nTiempo transcurido: " + (System.currentTimeMillis() - tiempoInicio) + " milisegundos.");

	}

}
