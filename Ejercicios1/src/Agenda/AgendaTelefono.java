package Agenda;

import java.util.Scanner;

public class AgendaTelefono {
	
public static void preguntarDatos(String nombre, int telefono, String mDatos[][]) {
	Scanner leer = new Scanner(System.in);
	
	for (int i = 0; i < mDatos.length; i++) {
		
	System.out.println("Introduce el nombre del contacto");
	mDatos[i][0]=leer.next();
	System.out.println("Ahora introduce el telefono del contacto");
	mDatos[i][1] = leer.next();
	}
}

public static void inicializarDatos(String mDatos[][],String nombre, int telefono) {
	for (int i = 0; i < mDatos.length; i++) {
		
	mDatos[i][0] = "";
	mDatos[i][1] = "";
}}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int opc = 0,telefono=0,tam=0,filas;
		String nombre="";
		System.out.println("Dime el numero de los empleados que vas a añadir");
		filas = leer .nextInt();
		String mDatos[][] = new String[filas][];
		
		
		while(opc != 6){
		System.out.println("Menu de gestiones:");
		System.out.println("1 - Añadir Contacto");
		System.out.println("2 - Buscar Contacto");
		System.out.println("3 - Borrar Contacto");
		System.out.println("4 - Editar Contacto");
		System.out.println("5 - Ver todos los Contactos");
		System.out.println("6 - Salir");
		opc = leer .nextInt();
		switch (opc) {
		case 1:
			inicializarDatos(mDatos, nombre, telefono);
			preguntarDatos(nombre, telefono, mDatos);
		case 2:
		
		case 3:
			
		case 4:
			
		case 5:
			
			
		}
		
	}
		
	
	}

}
