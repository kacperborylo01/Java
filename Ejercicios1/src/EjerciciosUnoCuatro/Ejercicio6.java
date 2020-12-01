package EjerciciosUnoCuatro;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leer= new Scanner(System.in);
        String nombre="",aux1="",aux="", apellido="", aux2="", aux3="";
        System.out.println("Dime el nombre");
        nombre=leer.nextLine();
        nombre = nombre.toLowerCase();
        System.out.println("Dime el apellido");
        apellido=leer.nextLine();
        apellido = apellido.toLowerCase();

         for (int i = 0; i < nombre.length(); i++) {
                aux1=nombre.substring(i,1);
                aux1=aux1.toUpperCase();
                System.out.print(aux1);
                break;
            }


            for (int i = 1; i < nombre.length(); i++) {
                aux=nombre.substring(i,i+1);
                System.out.print(aux);
            }


            for (int i = 0; i < apellido.length(); i++) {
                aux2=apellido.substring(i,1);
                aux2=aux2.toUpperCase();
                System.out.print(" " + aux2);
                break;
            }


            for (int i = 1; i < apellido.length(); i++) {
                aux3=apellido.substring(i,i+1);
                System.out.print(aux3);
            }
            //System.out.println(aux1+aux);
        }

    }