import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int trimestre1, trimestre2, trimestre3;
		float media;
		
		System.out.print("¿Nombre del alumno? ");
		nombre = entrada.nextLine();
		
		System.out.print("Inserte la nota del primer trimestre: ");
		trimestre1 = entrada.nextInt();
		
		System.out.print("Inserte la nota del segundo trimestre: ");
		trimestre2 = entrada.nextInt();
		
		System.out.print("Inserte la nota del tercer trimestre: ");
		trimestre3= entrada.nextInt();
		
		media = (trimestre1 + trimestre2 + trimestre3)/3f;
		
		System.out.print(nombre + " tiene una media de " + media);
		
	}

}
