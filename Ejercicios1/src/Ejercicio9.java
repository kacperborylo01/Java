import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String mes;
		
		float importe;
		
		System.out.println("Dime el mes de la compra realizada");
		mes  = leer .nextLine();
		
		System.out.println("Dime el importe de tu compra");
		importe = leer .nextInt();
		
		
		if (mes.equalsIgnoreCase("octubre")) {
			System.out.println("El importe de la compra tiene un 15% de descuento al ser octubre el cual era de " + importe + " ahora sera de " + (importe * 0.85) );
			
		}else {
			System.out.println("El importe de la compra es " + importe);
		}
		
		
		
		

	}

}
