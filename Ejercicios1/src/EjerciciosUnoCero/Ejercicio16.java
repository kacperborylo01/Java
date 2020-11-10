package EjerciciosUnoCero;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		
		int nums,cont;
		double suma;
		
		cont = 1;
		suma = 0;
		
		System.out.println("Escribe una nota para calcular la media aritm�tica (Introduce 0 para terminar)");
		nums = leer .nextInt();
		
		while (nums > 0) {
			
			suma = suma + nums;
			cont = cont +1;
			
		System.out.println("Nota" + cont);
		nums = leer . nextInt();
		}
		System.out.println("La media aritm�tica es:" + suma / (cont-1));
		

	}

}
