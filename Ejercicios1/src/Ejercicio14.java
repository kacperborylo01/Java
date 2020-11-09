import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int num1,cont,suma;
		
		cont = 0;
		suma = 0;
		
		System.out.println("Dime hasta que numero hago la suma");
		num1 = leer .nextInt();
		
		while (cont < num1) {
			suma = cont + suma;
			cont = cont + 1;
					
		}
		
		System.out.println("La suma de los numeros hasta el numero " + num1 + " es: " + suma);
		

	}

}
