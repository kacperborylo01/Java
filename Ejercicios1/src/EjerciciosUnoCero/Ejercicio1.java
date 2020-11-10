package EjerciciosUnoCero;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaracion e inicialización variables
		int num1=0,num2=0;
		float real;
		String nombre="";
		boolean bandera=true;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre = leer.nextLine();
		System.out.println("Dime tu edad");
		num1 = leer.nextInt();
		
		System.out.println(" Tu nombre es " + nombre + " y tienes " + num1 + " años ");
		
		
		
	}

}
