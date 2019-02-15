
public class Ejemplo04 {

	public static void main(String[] args) {

		System.out.println("El área de un círculo de radio 10 es " + area(10));

	}

	static double area(double radio) {

		double resultado = Math.PI * radio * radio;

		return resultado;

	}

}
