package files_rutas;

import java.io.File;

import Utilidades.Menu1Daw;
import Utilidades.MiScanner;

public class MenuFicheros {

	public static void main(String[] args) {
		//==Menu Ficheros/Carpetas==
		//A-Renombrar-->Path antiguo(existir),path destino(no existir)
		//B-Borrar-->Path a borrar(existir)
		//C-Listar-->Path carpeta(existir y ser carpeta(nombre y tamaño))
		//S-Salir
		//Control total de errores

		int opc;
		Menu1Daw menu= new Menu1Daw("==Menu Ficheros/Carpetas==","Sailr del programa",4,false);
		menu.aniadeOpcion("Renombrar");
		menu.aniadeOpcion("Borrar");
		menu.aniadeOpcion("Listar");
		
		do {
			menu.mostrar();
			opc = menu.pideOpcion();
			switch (opc) {
			case 'A':
				renombrar();
				break;
			case 'B':
				borrar();
				break;
			case 'C':
				listar();
				break;
			}
		} while (opc != 'S');
	}

	private static void listar() 
	{
		MiScanner s=new MiScanner();
		System.out.print("Introduzca Ruta: ");
		String path=s.nextLine();
		File fichero=new File(path);
		if(fichero.exists()&&fichero.isDirectory())
			System.out.println("Existe y es un directorio");
		else
			System.out.println(("No Existe o No es un directorio"));
		
		File[]lista=fichero.listFiles();
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i].isDirectory())
			{
				System.out.println("Nombre: "+lista[i].getName()+" Tamaño: "+lista[i].length()/1024+" KB");
			}	
		}
	}

	private static void borrar() {
		MiScanner s=new MiScanner();
		System.out.print("Introduzca Ruta: ");
		String path=s.nextLine();
		File fichero=new File(path);
		if(fichero.exists())
		{
			System.out.println("¿Está seguro que quiere borrar: "+fichero.getName()+"?");
			System.out.println("Si/No");
			String decision=s.nextLine();
			if(decision.equalsIgnoreCase("si"))
			{
				if(fichero.delete())
					System.out.println("Éxito en el borrado");
			}
		}
	}

	private static void renombrar() {
		MiScanner s=new MiScanner();
		System.out.print("Introduzca Ruta: ");
		String path=s.nextLine();
		File fichero=new File(path);
		if(fichero.exists())
		{
			System.out.println("Introduzca nuevo nombre");
			String nombreNuevo=s.nextLine();
			File nuevo=new File(nombreNuevo);
			if(!nuevo.exists())
			{
				if(fichero.renameTo(nuevo))
				{
					System.out.println("Exito");
				}
			}
		}
		
	}

}
