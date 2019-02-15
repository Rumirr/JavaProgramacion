
public class Ejemplo2 {
	public static void main(String[] args) {
		
		int capacidad = 20;
		int litros = 210;
		
		int barriles= litros / capacidad;
		
		System.out.println("Hay " + barriles + " barriles llenos.");
		
		int litrosNosSobran = litros % capacidad;
		System.out.println("Y nos sobrarán " + litrosNosSobran + " litros.");
	}
}
