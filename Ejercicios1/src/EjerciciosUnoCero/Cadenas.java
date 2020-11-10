package EjerciciosUnoCero;
import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		char letra;
		String nombre;
		int tam=0;
		
		Scanner leer = new Scanner (System.in);
		nombre = "Juan Francisco";
		tam = nombre.length();
		System.out.println(nombre.toLowerCase());
		letra = 'a';
		
		if (nombre.equalsIgnoreCase("Juan Francisco")) {
            System.out.println("Es igual");
        
		}else {
			System.out.println("No es igual");
		}
		
		// Subcadenas
		System.out.println(nombre.substring(0,1));
		for (int i=0; i<nombre.length(); i++) {
			System.out.println(nombre.substring(i , i+1));
		}
		
		System.out.println(nombre + " hola " + nombre);
		nombre = leer.next();
		}

	}


