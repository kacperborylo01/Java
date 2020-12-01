package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
        String frase="", aux="";
        int cont=1;
        System.out.println("Dime una frase");
        frase=leer.nextLine();

        for(int i=0;i<frase.length();i++) {
            aux=frase.substring(i,i+1);
            if (aux.equals(" ")) {
                cont=cont+1;
            }
        }
        System.out.println(cont);
    }

}


