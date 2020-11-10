package Ejercicios;
import java.util.Scanner;



public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String clave, contra = "";
		int cont;
		boolean interruptor;
		
		
		cont = 0;
		clave = "eureka";
		interruptor = false;
		
		while ((cont < 3) && (interruptor == false)) {

			System.out.println("Escribe la clave para poder entrar al sistema (Dispones de 3 intentos)");
			contra = leer .nextLine();
		if(contra.equalsIgnoreCase(clave)) {
			System.out.println("Clave correcta, puedes acceder al sistema");
			interruptor = true;
			
			
		}else {System.out.println("La clave es incorrecta");
			   cont ++;
		
		}
		if(cont == 3) {
			System.out.println("Clave incorrecta, ya no te quedan mas intentos" );
		}
		}		
		
		

	}

}
