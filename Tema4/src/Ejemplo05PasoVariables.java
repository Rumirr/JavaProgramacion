
public class Ejemplo05PasoVariables {

	public static void main(String[] args) {

		int edades[] = { 20, 35, 89, 69 };
		int ladoCuadrado = 15;
		
		
		primerElemento(edades);
		areaCuadrado(ladoCuadrado);
		
		
		System.out.println("Después de llamar al método: edades[0] = " + edades[0]);
		System.out.println("ladoCuadrado = " + ladoCuadrado);
		
	}

	static void primerElemento(int datos[]) {
		System.out.println("Primer elemento del array: " + datos[0]);
		datos[0] = 0;
	}

	static void areaCuadrado(int lado) {
		System.out.println("Área del cuadradode lado " + lado + " = " + lado * lado);
		lado = 0;
	}
}
