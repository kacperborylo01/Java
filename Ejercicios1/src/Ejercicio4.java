import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		num1 = leer .nextInt();
		
		System.out.println("Escribe otro numero");
		num2 = leer .nextInt();
		
		
		if (num1 > num2) {
			System.out.println("El numero mayor es el " + num1);
			
		}else if (num2 > num1) {
				System.out.println("El numero mayor es el" + num2);
		}else { System.out.println("Los numeros son iguales");
					
				}
		
		
			
		
		
			
			
		

	}

}
