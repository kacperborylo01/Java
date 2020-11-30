package EjerciciosExamen;

import java.util.Scanner;

public class Eje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		int vNumeros[] = new int [10];
		double suma = 0;
		System.out.println("Escribe 10 numeros para hacer la media");
		
		
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i] = leer.nextInt();
			suma = suma + vNumeros[i];
		}
		
		System.out.println("La media de los valores introducidos es :" + suma / vNumeros.length);
	}

}
