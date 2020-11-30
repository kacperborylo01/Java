package EjerciciosExamen;

import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		int num=0;
		int cont =0;
		int tres= 3;
		
		System.out.println("A continuación te dire los numeros que son multiplos de 3,primero dime hasta que "
				+ "numero los quieres saber");
		num = leer.nextInt();
		
		while (tres <= num ) {
			if(tres % 3 == 0 ) {
				cont = cont +1;
			}
			tres = tres+1;
		}
		
		System.out.println("Los multiplos de 3 hasta el numero " + num + " son "  + cont );

	}

}
