package EjerciciosExamen;

import java.util.Scanner;

public class Eje3 {
	
	public static void rellenarvector( int vMultiplos[], int tam,int num) {
		for (int i = 0; i < tam; i++) {
			vMultiplos[i] = num * (i+1);
			
		}
		for (int i = 0; i < tam; i++) {
			System.out.println(vMultiplos[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tam = 0,num = 0;
		System.out.println("Dime el tamaño que quieres para el vector");
		tam = leer.nextInt();
		 int vMultiplos[] = new int [tam];
		 System.out.println("Dime de que numero quieres los multiplos");
		 num = leer.nextInt();
		 
		 rellenarvector(vMultiplos,tam,num);
	}
	
	

}
