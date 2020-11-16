package EjerciciosUnoDos;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int sumapares=0,sumanones=0,cont = 0;
		
		System.out.println("Numeros del 1 al 100");
		
		while  (cont <= 100){
			if (cont % 2 == 0) {
				sumapares = sumapares + cont;
				
			}else {
				sumanones = sumanones + cont;
			}
			cont++;
		}
		
		System.out.println("La suma de los numeros pares del 1 al 100 es: " + sumapares);
		System.out.println("La suma de los numeros impares del 1 al 100 es: " + sumanones);

	}

}
