package files_rutas;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Busqueda {
	File donde;
	ArrayList<File> encontrados=new ArrayList<File>();

	public Busqueda(String path)throws NoEsDirectorio
	{	
		this(new File(path));
	}
	public Busqueda(File f) throws NoEsDirectorio {
		if(!f.exists())
		{
			throw new NoEsDirectorio("No existe"+f.getAbsolutePath());
		}
		if(!f.isDirectory())
		{
			throw new NoEsDirectorio("No es directorio"+f.getAbsolutePath());
		}
			donde=f;
	}
	public void buscarNombre(String cadena, File donde)
	{
		this.donde=donde;
		File f;
		if(!this.donde.isDirectory())
			return;
		File[]lista=this.donde.listFiles();
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i].isDirectory())
			{
				f=new File(lista[i].getAbsolutePath());
				buscarNombre(cadena,f);
			}
			if(-1!=lista[i].getName().indexOf(cadena))
			{
				encontrados.add(lista[i]);
			}
		}
	}
	public  void buscarMayores(long bytes,File donde)
	{
		this.donde=donde;
		File f;
		if(!this.donde.isDirectory())
			return;
		File[]lista=this.donde.listFiles();
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i].isDirectory())
			{
				f=new File(lista[i].getAbsolutePath());
				buscarMayores(bytes,f);
			}
			if(lista[i].length()>=bytes)
			{
				encontrados.add(lista[i]);
			}
		}
	}
	public  void buscarModificadosDespues(String fecha,File donde) throws ParseException
	{
		//fecha: DD-MM-AAAA
		//class Date, class SimpleDateFormat
		this.donde=donde;
		File f;
		if(!this.donde.isDirectory())
			return;
		File[]lista=this.donde.listFiles();
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i].isDirectory())
			{
				f=new File(lista[i].getAbsolutePath());
				buscarModificadosDespues(fecha,f);
			}
			long l;
			SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
			Date d=formato.parse(fecha);
			l=d.getTime();
			if(lista[i].lastModified()>=l)
			{
				encontrados.add(lista[i]);
			}
		}
	}
	public void limpiar()
	{
		encontrados.clear();
	}
	public ArrayList<File> getEncontrados() {
		return encontrados;
	}
	public void mostrar() {
		//path absoluto,tamaño y fecha.
		for(int i=0;i<encontrados.size();i++)
		System.out.println( "Path Absoluto:"+encontrados.get(i).getAbsolutePath()
				+"\n"+" Tamaño: "+encontrados.get(i).length()+" bytes "+(encontrados.get(i).length())/2048+" MB"
				+"\n"+" Fecha: "+getFechaActual(encontrados.get(i).lastModified()));
	}
	 public static String getFechaActual(long l) {
	        Date fecha = new Date(l);
	        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	        return formato.format(fecha);
	    }

}
