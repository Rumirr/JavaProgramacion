package Arrays01;

public class Ejercicio15 {

	public static void main(String[] args) {

		float temp[] = { 15, 16.1f, 16, 15.4f, 15, 14, 10.2f, 11, 11.5f, 10, 10.1f, 9.8f, 9, 6 };
		float total = 0;

		for (float f : temp) {
			total += f;
		}
		total /= temp.length;
		
		
//		total *=100;
//		total=Math.round(total);
//		total/=100;
		
		
		System.out.println("La temperatura media de las dos últimas semanas es " + total + "ºC.");
		
		System.out.printf("La temperatura media de las dos últimas semanas es %.2f ºC.", total);

	}
}
