import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int num1,cont,limite,suma;
		
		cont = 0;
		suma = 0;
		
		System.out.println("Dime cuantos numeros pares quieres que sume:");
		num1 = leer .nextInt();
		
		limite = num1;
		while (cont < limite) {
		if (num1 % 2 == 0) {
			suma = num1 + suma;
			
			cont = cont + 1;
		}

		num1 = num1 +1;
	}
		System.out.println("La suma de los " + num1 + " primeros numeros pares es:" + suma );
	}

}
