package Fich.BusquedasMenu;

import java.io.File;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class BuscaDisco {
	File donde;


	ArrayList<File> encontrados;
	
	public BuscaDisco(File f) throws NoEsDirectorioExcep {
		
		setDonde(f);
		encontrados=new ArrayList<File>();
	}

	public void setDonde(File f) throws NoEsDirectorioExcep {
		if (!f.exists())
			throw new NoEsDirectorioExcep("No existe: "+f.getAbsolutePath());
		if (!f.isDirectory())
			throw new NoEsDirectorioExcep("No es un directorio: "+f.getAbsolutePath());
		donde = f;
	}

	public File getDonde() {
		return donde;
	}
	
	public BuscaDisco(String path) throws NoEsDirectorioExcep {
		this(new File(path));
	}

	public ArrayList<File> getEncontrados() {
		return encontrados;
	}

	@Override
	public String toString() {
		String t="";
		for (File f:encontrados){
			t+=informacionFile(f)+"\n";
		}
		return t;
	}
	
	private double redondear( double numero, int decimales )
	{
		return Math.rint(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
	}
	
	private String informacionFile(File f) {
		//Añadir información: fecha/hora ficheros encontrados
		String t;
		t=f.getAbsolutePath()+"(";
		Date fecha=new Date(f.lastModified());
		SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		if (f.isDirectory())
			t+="Directorio "+formato.format(fecha);
		else
		{
			long tam=f.length();
			double kb=tam/1024.0;
			double mb=kb/1024.0;
			t+="Fichero: "+tam+"B, "+redondear(kb,1)+"KB, "+redondear(mb,1)+"MB "+formato.format(fecha);
		}
		t+=")";
		return t;
	}
	
	//NO RECURSIVO
	public void buscarNombre(String cadena) {
		encontrados.clear();
		buscarNombre(donde,cadena);
	}
	
	//RECURSIVO
	private  void buscarNombre(File dir, String cadena) {
		File lista[];

		lista = dir.listFiles();
		if (lista==null) //No se puede conseguir el contenido (permisos, ...)
			return;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getName().toUpperCase().indexOf(cadena.toUpperCase())!=-1)
				encontrados.add(lista[i]);
			if (lista[i].isDirectory())
				buscarNombre(lista[i], cadena);
		}
	}

	//NO RECURSIVO
	public void buscarMayores(long tamBytes) {
		encontrados.clear();
		buscarMayores(donde,tamBytes);
	}
	
	//RECURSIVO
	private  void buscarMayores(File dir, long tamBytes) {
		File lista[];
	
		lista = dir.listFiles();
		if (lista==null) //No se puede conseguir el contenido (permisos, ...)
			return;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].length() > tamBytes)
				encontrados.add(lista[i]);
			if (lista[i].isDirectory())
				buscarMayores(lista[i], tamBytes);
		}
	}
	
	//NO RECURSIVO
	public void buscarModificadosDespues(String fecha) throws FechaInvalidaExcep {
		encontrados.clear();
		
		//Convierte fecha String a Date
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);//Reglas estrictas para validar la fecha
		Date d=null;
		try {
			d=sdf.parse(fecha);
		} catch (ParseException e) {
			throw new FechaInvalidaExcep("Fecha incorrecta");
		}

		buscarModificadosDespues(donde,d.getTime());
	}
	
	//RECURSIVO
	private  void buscarModificadosDespues(File dir, long miliSegs) {
		File lista[];
	
		lista = dir.listFiles();
		if (lista==null) //No se puede conseguir el contenido (permisos, ...)
			return;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].lastModified() > miliSegs)
				encontrados.add(lista[i]);
			if (lista[i].isDirectory())
				buscarModificadosDespues(lista[i], miliSegs);
		}
	}
}
