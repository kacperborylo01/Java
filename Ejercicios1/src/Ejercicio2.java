import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y 
		 * muestre cuanto valen al final las dos variables(recuerda laasignación). 
		 */
		int num1,num2,aux;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		num1 = leer.nextInt();
		System.out.println("Dime el segundo numero");
		num2 = leer.nextInt();
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("He intercambiado los valores de los numeros,"
				+ " por lo cual el primer numero vale " + num1 + " y el segundo vale " + num2);
		
	}

}
