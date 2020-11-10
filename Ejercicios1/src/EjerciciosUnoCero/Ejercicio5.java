package EjerciciosUnoCero;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner leer = new Scanner(System.in);

		System.out.println("Dime el numero 1");
		num1 = leer .nextInt();
		
		System.out.println("Dime el numero 2");
		num2 = leer .nextInt();
		
		System.out.println("Dime el numero 3");
		num3 = leer .nextInt();
		
		if((num1 > num2) && (num1>num3)) {
			System.out.println("El numero mayor es el" + num1);
		}else if ((num2 > num1) && (num2 > num3)){
			System.out.println("El numero mayor es el" + num2);
			}else {
				System.out.println("El numero mayor es el " + num3);
			}

	}

}
