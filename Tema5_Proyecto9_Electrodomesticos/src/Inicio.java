
public class Inicio {

	public static void main(String[] args) {

		// creo los motores
		Motor m1 = new Motor(1, "Bosh", "a1");
		Motor m2 = new Motor(2, "LG", "a2");
		
		// creo y muestro las lavadoras
		Lavadora l1=new Lavadora(101, m1, "Bosh", 150);
		System.out.println(l1.toString());
		System.out.println();
		
		Lavadora l2=new Lavadora(102, m2, "Balay", 450);
		System.out.println(l2.toString());

		
		// añado las lavadoras al taller
		Taller taller=new Taller();
		
		taller.addLavadora(l1);
		taller.addLavadora(l2);
		
		// muestro la lista de lavadoras
		System.out.println();
		taller.listaLavadoras();
		
		// busco la lavadora con el id = 3 (que no existe y debería devolver -1) y la valadora con el id = 2
		System.out.println();
		System.out.println("Posición de la lavadora con el id = 2: " + taller.buscaLavadora(101));
		System.out.println("Posición de la lavadora con el id = 3: " + taller.buscaLavadora(103));
		
		// borro la lavadora con el id = 1 y después muestro la lista de lavadoras del taller
		System.out.println();
		taller.borrarLavadora(101);
		taller.listaLavadoras();
		
	}
}
