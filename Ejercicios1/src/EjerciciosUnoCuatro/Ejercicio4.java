package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		String comprobar = "oaeiu",nombre;
		String aux,vocalaux,resultado="";
		
		System.out.println("Escribe tu nombre");
		nombre = leer.next();
		
		for (int i = 0; i < comprobar.length(); i++) {
			vocalaux = (comprobar.substring(i, i+1));
			
			for (int j = 0; j < nombre.length(); j++) {
				aux = (nombre.substring(j, j+1));
				
				if(aux.equalsIgnoreCase(vocalaux)) {
					
					resultado = aux;
					j=nombre.length();
					System.out.println(resultado);
					}
				
			}
			
		}
		
		
		
	}

}
