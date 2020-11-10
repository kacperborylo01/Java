package EjerciciosUnoCero;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1,num2;
		int suma,multi,divi,resta;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num1 = leer .nextInt();
		System.out.println("Dime otro numero");
		num2 = leer .nextInt();
		
		suma = num1 + num2;
		System.out.println("La suma de estos numeros es " + suma);
		
		resta = num1 - num2;
		System.out.println("La resta de estos numeros es " + resta);
		
		multi = num1 * num2;
		System.out.println("La multiplicación de estos numeros es " + multi);
		
		divi = num1 / num2;
		System.out.println("La división de estos numeros es " + divi);
		
		

	}

}
