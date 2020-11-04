import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1,num2,num3,multi,suma;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime el numero 1");
		num1 = leer .nextInt();
		
		System.out.println("Dime el numero 2");
		num2 = leer .nextInt();
		
		System.out.println("Dime el numero 3");
		num3 = leer .nextInt();
		
		multi = num1*num2*num3;
		suma = num1+num2+num3;
		if(num1 < 0){
			System.out.println("Como el primer numero que has introducido es negativo, realizaremos la multiplicacion de los 3 numeros " + multi);
			
		}else { 
			System.out.println("Como el primer numero que has introducido NO es negativo, realizaremos la suma de los 3 numeros --- " + num1 + num2 + num3 + "=" + (suma));
			
		}

	}

}
