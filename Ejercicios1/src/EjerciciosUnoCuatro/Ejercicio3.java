package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "";
		
		String comprobar,aux;
		
		comprobar= "aeiou";
		Scanner leer = new Scanner(System.in);
		
		System.out.println("ESCRIBE TU NOMBRE Y TE DIRE CUANTAS VOCALES CONTIENE");
		nombre = leer .next();
		int cont = 0;
		
		for (int i = 0; i < nombre.length(); i++) {
			aux = nombre.substring(i,i+1);
					
			if(aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("e") || aux.equalsIgnoreCase("i") || aux.equalsIgnoreCase("o") || aux.equalsIgnoreCase("u")) {
					
				cont++;
			}
			
			
			
		}
		System.out.println("En esta palabra hay " + cont + " vocales");
		
	}

}
