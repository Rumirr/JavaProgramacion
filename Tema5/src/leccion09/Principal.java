package leccion09;

public class Principal {

	public static void main(String[] args) {

		Punto punto1 = new Punto(0,0,"Rojo");

		Punto punto2 = new Punto();

		// Utilizamos los métodos de acceso para dar valor
		punto2.setX(15);
		punto2.setY(0);
		punto2.setColor("Verde");
		
		// Usamos los métodos de acceso para mostrar los valores
		System.out.println("X = " + punto2.getX());
		System.out.println("y = " + punto2.getY());
		System.out.println("color = " + punto2.getColor() + "\n");
		
		punto1.mostrar();
		punto2.mostrar();
	}

}
