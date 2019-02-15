
public class Ejemplo06 {

	public static void main(String[] args) {
		
		float precios[]= {195,200,182,170,215,204,200};
		
		int posMin=0;
		
		for (int i = 0; i < precios.length; i++) {
			
			if (precios[i]<precios[posMin]) {
				posMin=i;
			}
		}

		
		System.out.println("La posición del precio más pequeño es " + posMin);
		System.out.println("El precio más pequeño es " + precios[posMin] + " €.");
	}

}
