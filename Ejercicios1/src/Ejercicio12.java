import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String bachiller,pruebaacc;
		bachiller = "";
		pruebaacc = "";
				
		
		System.out.println("Tienes el titulo de Bachiller para acceder a este Ciclo Formativo?");
		bachiller = leer .nextLine();
		
		if(bachiller.equalsIgnoreCase( "si" )){
			
			System.out.println("Puedes acceder");
		}else{
			System.out.println("Entonces has realizado una prueba de acceso?");
			pruebaacc = leer .nextLine();
		
		if(pruebaacc.equalsIgnoreCase("si")){
				System.out.println("Puedes acceder");
			}else{
				System.out.println("Lo sentimos,no puedes acceder, suerte para la próxima");
				
			}
			
		}
		
		
		
		
		
		

	}
	}


