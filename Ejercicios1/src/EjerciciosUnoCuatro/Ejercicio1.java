package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		String nombre;
		String nombreinvertido="";
		
		System.out.println("Escribe tu nombre");
		nombre = leer .nextLine();
		
		for (int i = nombre.length()-1; i>=0; i--) {
			nombreinvertido = nombreinvertido + (nombre.charAt(i));
		}
		System.out.println(nombreinvertido);
	}

}
