package files_rutas;

import java.io.File;

import Utilidades.MiScanner;

public class MoverCrear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Path origen:/Estructura debe existir y ser carpeta
		//Path Destino:/Destino si existe dar mensaje y opcion a crearla o no
		//"/Destino" no existe. ¿Quiere crearla?
		
		MiScanner s=new MiScanner();
		String valor;
		File[]copia;
		
		System.out.print("Introduzca Path de Origen: ");
		valor=s.nextLine();
		File origen=new File(valor);
		if(origen.exists())
		{
			if(origen.isDirectory())
				{
				System.out.println("Existe y es un directorio");
				}
			else
			{
				System.out.println("Existe pero no es un directorio");
			}
		}
		else
		{
			System.out.println("No existe");
		}
		
		System.out.print("Introduzca Path de Destino: ");
		valor=s.nextLine();
		File destino=new File(valor);
		
		if(!destino.exists())
		{
			System.out.println("El directorio no existe. ¿Desea crearlo?");
			valor=s.nextLine();
			if(valor.equalsIgnoreCase("si"))
			{
				if(destino.mkdirs())
				{
					System.out.println("Éxito");
				}
				copia=origen.listFiles();
				
				for(int i=0;i<copia.length;i++)
				{
					if(copia[i].isDirectory())
					{
						File nuevo=new File(destino.getAbsolutePath()+"/"+copia[i].getName());
						if(nuevo.mkdirs())
						{
							System.out.println("Éxito "+copia[i].getName());
						}
					}
					
				}
			}
		}
		else
			System.out.println("El directorio ya existe");
		
	}

}
