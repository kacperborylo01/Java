import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		float chicas,chicos,total;
		
		System.out.println("Dime el numero de chicos que hay en clase");
		chicos = leer .nextInt();
		
		System.out.println("Dime el numero de chicas que hay en clase");
		chicas = leer .nextInt();
		
		total = chicas + chicos;
		
		System.out.println("El porcentaje de chicos que hay en la clase es " + (chicos / total) * 100);
		System.out.println("El porcentaje de chicas que hay en la clase es " + (chicas / total) * 100);
	}

}
