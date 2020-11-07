import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Escribe un numero y te dire si es par o impar");
		num1 = leer .nextInt();
		
		if (num1 == 0)
				{
			System.out.println("El 0 no es ni par ni impar");
			}else if(num1 % 2 == 0 ){
			System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
		
			
		
		

	}

}
