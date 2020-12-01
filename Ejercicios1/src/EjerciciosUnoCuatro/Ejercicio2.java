package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		String nombre,aux;
		
		
		System.out.println("Introduce tu nombre");
		nombre = leer .nextLine();
		 
		
		for (int i = 0;i < nombre.length(); i++) {
            aux = nombre.substring(i,i+1);
         if( i % 2 == 0) {
             System.out.print(aux.toUpperCase());
         }else{
             System.out.print(aux.toLowerCase());
         }
        }

			
			
			
	}
	}
		

	


