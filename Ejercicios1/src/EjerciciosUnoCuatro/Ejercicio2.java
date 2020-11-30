package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tamaño = 0;
		String nombre;
		int nombrealterno=0;
		
		System.out.println("Introduce tu nombre");
		nombre = leer .nextLine();
		 tamaño =nombre.length();
		
		for (int i = 0;i == tamaño; i++); {
			
			if(Character.isLowerCase(nombre.charAt(nombrealterno))) {
				System.out.println(Character.toUpperCase(nombre.charAt(nombrealterno)));
			}else{
				System.out.println(Character.toLowerCase(nombre.charAt(nombrealterno)));
			}
			
			
		}
		

	}

}
