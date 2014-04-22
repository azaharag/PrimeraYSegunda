package pruebas;

import java.io.File;
import java.text.ParseException;
import java.util.Scanner;

import files_rutas.NoEsDirectorio;

public class BuscaDiscoPpral {

	public static void main(String[] args) throws FechaInvalida, NoEsDirectorio, ParseException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String c;
		File nom=new File("C:/Users");
		BuscarDisco b=new BuscarDisco(nom);
		System.out.println("¿Qué desea hacer?");
		System.out.println("A-Buscar por nombre.");
		System.out.println("B-Buscar archivos mayores que:");
		System.out.println("C-Buscar archivos modificados despues de:");
		System.out.println("S-Salir.");
		c = s.nextLine();
		c = c.toUpperCase();
		char o = c.charAt(0);
		switch (o) {
		case 'A':
			System.out.println("Introduzca nombre que desea buscar.");
			String nombre=s.nextLine();
			b.buscarNombre(nombre);
			b.mostrarDatos();
			break;
		case 'B':
			System.out.println("Introduzca tamaño de bytes que desea buscar.");
			long bytes=s.nextInt();
			b.buscarMayores(bytes, nom);
			b.mostrarDatos();
			break;
		case 'C':
			System.out.println("Introduzca fecha de modificación que desea buscar.");
			String fecha=s.nextLine();
			b.buscarModificadosDespues(fecha, nom);
			b.mostrarDatos();
			break;
		case 'S':
			break;
		default:
			System.out.println("Opción incorrecta");
			break;
		}
		s.close();
	}
}
