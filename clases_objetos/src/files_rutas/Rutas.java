package files_rutas;

import java.io.File;

import Utilidades.MiScanner;

public class Rutas {
	
	public static void main(String[] args) {
		
		//Mostrar el directorio de trabajo.
		//Pedir ruta por teclado. 
		//Validar que path existe y es un directorio.
		//Listar el contenido.
		//Nombre: tipo: (carpeta,archivo,directorio),tamaño: en kb(/1024)
		
		MiScanner s=new MiScanner();
		File f=new File(".");
		System.out.println(f.getAbsolutePath());
		System.out.print("Introduzca Ruta: ");
		String path=s.nextLine();
		File f2=new File(path);
		if(f2.exists()&&f2.isDirectory())
			System.out.println("Existe y es un directorio");
		else
			System.out.println(("No Existe o No es un directorio"));
		
		File[]lista=f2.listFiles();
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i].isFile())
			{
				System.out.println("Nombre: "+lista[i].getName()+" Tipo: Archivo"+" Tamaño: "+lista[i].length()/1024
						+" KB");
			}
			else
			{
				System.out.println("Nombre: "+lista[i].getName()+" Tipo: Carpeta"+" Tamaño: "+lista[i].length()/1024+" KB");
			}	
		}
	}
}
