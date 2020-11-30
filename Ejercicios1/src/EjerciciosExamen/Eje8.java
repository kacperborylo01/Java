package EjerciciosExamen;

import java.util.Scanner;

public class Eje8 {
	
	public static void mostrarDatos(String vNombres[], int vEdad[], int tam) {
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < tam; i++) {
			System.out.println("Dime el nombre del usuario");
			vNombres[i] = leer.next();
			System.out.println("Dime ahora la edad de dicho usuario");
			vEdad[i] = leer.nextInt();
		}
		for (int i = 0; i < tam; i++) {
			System.out.println(vNombres[i] + " con edad " + vEdad[i]);
		} 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tam;
		
		System.out.println("Dime cuantos usuarios vas a añadir");
		tam = leer.nextInt();
		
		String vNombres[] = new String[tam];
		
		int vEdad[] = new int[tam];
		
		mostrarDatos(vNombres,vEdad,tam);

	}

}
