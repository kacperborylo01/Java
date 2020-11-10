package Ejercicios;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int cont;
		
		cont = 1;
		
		while(cont <= 9){
			System.out.println("El cuadrado de " + cont + "=" + (cont * cont));
			cont = cont +1;
		}
		
	}

}
