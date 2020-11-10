package EjerciciosUnoUno;

public class Vectores {

	public static void main(String[] args) {
		
		int vNumeros[] = new int [10];
		//vNumeros = new int[10];
		
		String vNombres[] = new String[10];
		
		vNumeros[0] = 1;
		vNumeros[9] = 10;
		vNombres[0] = "Juan";
		vNombres[9] = "Pepe";
		
		
		for (int i = 0; i < vNombres.length; i++) {
			if (vNombres[i] != null) {
			System.out.println(vNombres[i].toUpperCase());
		}
		}

		for (int i = 0; i < vNumeros.length; i++) {
			System.out.println(vNumeros[i]);
		}
	}

}
