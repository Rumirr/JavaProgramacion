package inicio;

import algebra.Polinomio;

public class Inicio {

	public static void main(String[] args) {

		double coeficientes3[] = { 2, 10, -5, 1 };
		double coeficientes4[] = { 1, 8, 3, 2 };

		Polinomio p3 = new Polinomio(coeficientes3);
		Polinomio p4 = new Polinomio(coeficientes4);

		Polinomio suma = p3.sumar(p4);

		System.out.println(suma.toString());
		////////////////////////////////////////////

		double coef5[] = { 10, 2, 3, 1 };
		Polinomio p5 = new Polinomio(coef5);

		System.out.println("El valor de p5 para x=3 es " + p5.evaluar(3));
	}
}
