package Agenda;

import java.util.Scanner;

public class AgendaTelefono {
	
	public static int buscareditarContacto(String mDatos[][], String buscar) {
		for (int i = 0; i < mDatos.length; i++) {
			if (mDatos[i][0].equalsIgnoreCase(buscar) || mDatos[i][1].equalsIgnoreCase(buscar)) {
				return i;
			}
		}
		return -1;
	}
	
public static void preguntarDatos(String nombre, int telefono, String mDatos[][]) {
	Scanner leer = new Scanner(System.in);
	
	for (int i = 0; i < mDatos.length; i++) {
		
	System.out.println("Introduce el nombre del contacto");
	mDatos[i][0]=leer.next();
	System.out.println("Ahora introduce el telefono del contacto");
	mDatos[i][1] = leer.next();
	
	System.out.println("Se ha aniadido un nuevo empleado con exito");
	
	}
}

public static void inicializarDatos(String mDatos[][],String nombre, int telefono) {
	for (int i = 0; i < mDatos.length; i++) {
	for (int j = 0; j < mDatos[i].length; j++) {
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
		}else if (!mDatos[i][0].equalsIgnoreCase(aux) || !mDatos[i][1].equalsIgnoreCase(aux)) {
			System.out.println("El contacto con nombre/telefono " + aux + " no se encuentra en la lista");
		}
	}
	
}

public static void borrarContacto(String mDatos[][],String aux) {
	Scanner leer = new Scanner(System.in);
	System.out.println("Que contacto quieres eliminar?");
	aux = leer.nextLine();
	for (int i = 0; i < mDatos.length; i++) {
		if(mDatos[i][0].equalsIgnoreCase(aux) || mDatos[i][1].equalsIgnoreCase(aux)) {
			mDatos[i][0]= "";
			mDatos[i][1]= "";
			System.out.println("El contacto ha sido borrado de tu lista de contactos");
		}else {
			System.out.println("Error al eliminar contacto. No se encuentra en tu lista de contactos");
		}
		
	}
	
}

public static void verContactos(String mDatos[][]) {
	System.out.println("Esta es su agenda de contactos guardados");
	for (int i = 0; i < mDatos.length; i++) {
		if(!mDatos[i][0].equalsIgnoreCase("") || !mDatos[i][1].equalsIgnoreCase("")) {
			
			System.out.println(mDatos[i][0] + " con telefono " + mDatos[i][1]);
		}else if (mDatos[i][0].equalsIgnoreCase("") || !mDatos[i][1].equalsIgnoreCase("")) {
			System.out.println("Tu lista de contactos esta vacia");
		}
	}
}

public static void editarContacto(String mDatos[][],String aux) {
	Scanner leer = new Scanner(System.in);
	aux = "";
	int pos = -1;
	String edit = "", editnom = "", edittel = "";
	System.out.println("¿Que contacto quieres editar?");
	edit = leer.next();
	pos = buscareditarContacto(mDatos, edit);
	if (pos == -1) {
		System.out.println("No tienes un contacto con estos datos para editarlo");
	} else {
		System.out.println("Introduce el nuevo nombre de este contacto");
		editnom = leer.next();
		mDatos[pos][0] = editnom;
		System.out.println("Introduce el nuevo telefono de este contacto");
		edittel = leer.next();
		mDatos[pos][1] = edittel;
	}

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
			break;
		case 2:
			buscarContacto(mDatos,aux);
			break;
		case 3:
			borrarContacto(mDatos,aux);
			break;
		case 4:
			editarContacto(mDatos,aux);
			break;
		case 5:
			verContactos(mDatos);
			break;
			
		}
		
	}
		
		System.out.println("Hasta Otra!!");
	}
	}


