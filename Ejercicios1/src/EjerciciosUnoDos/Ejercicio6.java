
package EjerciciosUnoDos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);	

	
	int cont= 0,unid= 3,num1;
	
	System.out.println("Escribe un numero y te dire cuantos múltiplos de 3 hay desde el 3 HASTA EL NUMERO QUE INTRODUZCAS");
	num1 = leer .nextInt();
	while (unid <= num1){
		if (unid % 3 == 0){
			cont = cont + 1;
		}
		
		unid = unid + 1;
	}
	
	System.out.println("Los multiplos de 3 entre 3 y " + num1 + " son: " + cont);
	
	}

}
