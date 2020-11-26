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
	
	System.out.println("Se ha añadido un nuevo empleado con éxito");
	}
}

public static void inicializarDatos(String mDatos[][],String nombre, int telefono) {
	for (int i = 0; i < mDatos.length; i++) {
	for (int j = 0; j < mDatos.length; j++) {
		mDatos[i][j]= "";
	}	
	
}}


public static void buscarContacto(String mDatos[][],String aux) {
	Scanner leer = new Scanner(System.in);
	System.out.println("Que contacto quieres buscar?");
	aux = leer.nextLine();
	for (int i = 0; i < mDatos.length; i++) {
		if (mDatos[i][0].equalsIgnoreCase(aux) || mDatos[i][1].equalsIgnoreCase(aux)) {
			System.out.println("El nombre es " + mDatos[i][0] + " y su telefono es " + mDatos[i][1]);
		}else {
			System.out.println("El contacto con nombre" + aux + "no se encuentra en la lista");
		}
	}
}

public static void borrarContacto(String mDatos,String aux) {
	Scanner leer = new Scanner(System.in);
	System.out.println("Que contacto quieres eliminar?");
	aux = leer.nextLine();
	
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		String mDatos[][],aux="";
		int opc = 0,telefono=0,filas=0,columnas=2;
		String nombre="";
		System.out.println("Dime el numero de los empleados que vas a aniadir");
		filas = leer .nextInt();
		mDatos = new String[filas][2];
		
		
		
		while(opc != 6){
		System.out.println("Menu de gestiones:");
		System.out.println("1 - Aniadir Contacto");
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
			buscarContacto(mDatos,aux);
		case 3:
			
		case 4:
			
		case 5:
			
			
		}
		
	}
		
	
	}

}
