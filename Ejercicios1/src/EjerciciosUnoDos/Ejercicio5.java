package EjerciciosUnoDos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String escrito= "";
		
		
		while(!escrito.equalsIgnoreCase(escrito = "S") || (!escrito.equalsIgnoreCase(escrito = "N"))){
		
		System.out.println("Introduce una letra (solo puede ser N o S)");
		escrito = leer .nextLine();
		if (escrito.equalsIgnoreCase(escrito = "S") && (escrito == "N") && (escrito == "n")){
			System.out.println("La letra es correcta");
		}else{
			System.out.println("La letra no es ni S ni N");
		}
		
		}
		
		

	}

}
