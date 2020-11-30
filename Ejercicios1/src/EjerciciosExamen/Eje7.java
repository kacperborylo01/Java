package EjerciciosExamen;

import java.util.Scanner;

public class Eje7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		 int num = 0,fact=1,mult=1;
		
		System.out.println("Introduce el numero del que quieres saber el factorial");
		num = leer.nextInt();
		
		while(mult <= num) {
			fact = (fact*mult);
			mult++;
		}
		System.out.println("El factorial del numero es " +fact);
	}

}
