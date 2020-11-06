import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		
		int num1,cuadrado;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num1 = leer .nextInt();
		
		cuadrado = num1 * num1;
		
		if (num1 <= 0){
			System.out.println("Error, el numero debe ser superior a 0");
		}else { 
			System.out.println("El cuadrado de " + num1 + " es igual a " + cuadrado + " y la raiz es " + Math.sqrt(num1) ) ;

	}

	}
}
