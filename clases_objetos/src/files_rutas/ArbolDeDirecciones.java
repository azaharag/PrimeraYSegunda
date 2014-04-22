package files_rutas;

import java.io.File;

import Utilidades.MiScanner;

public class ArbolDeDirecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s=new MiScanner();
		System.out.print("Introduzca Ruta: ");
		String path=s.nextLine();
		mostrarDir(path);
	}

	static void mostrarDir(String path)
	{
		File fichero=new File(path);
		if(!fichero.isDirectory())
			return;
		File []lista =fichero.listFiles();
		for(File e:lista)
		{
			System.out.println(e.getName());
			System.out.println(e.isDirectory()?"Carpeta":"Archivo");
			System.out.println(e.length());
		}
			for(File e:lista)
			{
			if(e.isDirectory())
				mostrarDir(e.getAbsolutePath());
			}
		
	}
}
