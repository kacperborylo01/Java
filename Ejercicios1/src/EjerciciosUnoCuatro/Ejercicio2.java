package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		String nombre;
		String nombrealterno="";
		
		System.out.println("Introduce tu nombre");
		nombre = leer .nextLine();
		int numero =0;
		
		for (int i = nombre.length();i>=0; i++); {
			numero++;
			nombrealterno = nombrealterno + nombre;
			if(numero % 2 == 1) {
				System.out.println(nombrealterno.toUpperCase());
			}else {
				System.out.println(nombrealterno.toLowerCase());
			}
			
		}
		

	}

}
