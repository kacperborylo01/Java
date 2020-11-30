package EjerciciosExamen;

import java.util.Scanner;

public class Eje4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		String frase="";
		String buscletra="";
		int cont = 0;
		
		System.out.println("Introduce una frase y te dire el numero de cada letra que contiene");
		frase = leer.nextLine();
		
		System.out.println("Ahora introduce la letra que quieres que busque");
		buscletra = leer.nextLine();
		
		System.out.println();
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)== buscletra.charAt(0) ){
				cont = cont +1;
			}
			
		}
		System.out.println("La letra " + buscletra + " sale en la frase " + cont + " veces");

	}

}
