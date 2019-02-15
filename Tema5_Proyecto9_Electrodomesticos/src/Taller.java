
public class Taller {
	/*
	 * ******************************************************
	 * *****************_ATRIBUTOS_**************************
	 * ******************************************************
	 */

	private final int MAX_LAVADORAS = 20;
	private Lavadora[] lavadoras;

	/*
	 * ******************************************************
	 * *****************_CONTRUCTORES_***********************
	 * ******************************************************
	 */
	
	public Taller() {
		lavadoras = new Lavadora[MAX_LAVADORAS];
	}
	
	// Constructores que llaman otro constructor

	/*
	 * ******************************************************
	 * *****************_OTROS MÉTODOS_**********************
	 * ******************************************************
	 */

	public void listaLavadoras() {
		System.out.println("---LISTADO DE LAVADORAS EN STOCK---");
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null) {
				System.out.println(lavadoras[i].toString());
			}
		}
	}
	
	public void addLavadora(Lavadora lav) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] == null) {
				lavadoras[i]=lav;
				break;
			}
		}
	}
	
	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public void borrarLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				lavadoras[i]=null;
				break;
			}
		}
	}
	
	// Métodos de acceso

}
