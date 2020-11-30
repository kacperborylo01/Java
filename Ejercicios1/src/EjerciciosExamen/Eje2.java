package EjerciciosExamen;

import java.util.Scanner;

public class Eje2 {
	public static void calcularmedia( int vNumeros[], double suma,int tam) {
		for (int i = 0; i < tam; i++) {
			suma = vNumeros[i] + suma;
			
		}
		System.out.println("La media de la suma de los valores introducidos es de " + suma / tam);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		double suma= 0;
		int tam = 0,media = 0;
		System.out.println("¿Que tamaño quieres que tenga tu vector?");
		tam = leer.nextInt();
		int vNumeros[] = new int [tam];
		
		System.out.println("Escribe numeros hasta la longitud que has escrito y te dire su media aritmética");
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i] = leer.nextInt();
		}
		
		//Llamamos a la funcion calcular media
		calcularmedia(vNumeros,suma,tam);
	}

}
