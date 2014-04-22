package miguel;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BuscarDisco {
	File donde;
	ArrayList<File> encontrados = new ArrayList<File>();
	File[] mostrar;

	// public BuscarDisco(String path) throws NoEsDirectorio {
	// File f=new File(path);
	// buscarDisco(f);
	// }
	//

	public BuscarDisco(File f) throws NoEsDirectorio {
		if (!f.exists()) {
			throw new NoEsDirectorio("No existe" + f.getAbsolutePath());
		}
		if (!f.isDirectory()) {
			throw new NoEsDirectorio("No es un directorio"
					+ f.getAbsolutePath());
		}
		donde = f;

	}

	public void buscarNombre(String cadena, File f) {
		donde = f;
		if (!donde.isDirectory())
			return;
		File[] lista = donde.listFiles();
		for (File e : lista) {
			e = e.getAbsoluteFile();
			if (-1 != e.getName().indexOf(cadena))
				encontrados.add(e);
		}
		for (File e : lista) {
			if (e.isDirectory()){
				File f1=new File (e.getAbsolutePath());
				buscarNombre(cadena,f1);
			}
		}
}

	public void buscarMayores(long bytes, File dir) {
		donde = dir;
		if (!donde.isDirectory())
			return;
		File[] lista = donde.listFiles();
		for (File e : lista) {
			if (e.length() > bytes)
				encontrados.add(e);
		}
		for (File e : lista) {
			if (e.isDirectory()) {
				File direccion = new File(e.getAbsolutePath());
				buscarMayores(e.length(), direccion);
			}
		}
		}

	public void buscarModificadosDespues(String fecha, File dir)
			throws FechaInvalida, ParseException {
		encontrados.clear();
		donde = dir;
		if (!donde.isDirectory())
			return;
		File[] lista = donde.listFiles();
		for (File e : lista) {
			if (e.isDirectory()) {
				File direccion = new File(e.getAbsolutePath());
				buscarModificadosDespues(fecha, direccion);
				encontrados.add(e);
			}
			SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
			Date d = format.parse(fecha);
			long cadena = d.getTime();
			if (e.lastModified() >= cadena) {
				encontrados.add(e);
			}
		}
		}

	// "DD-MM-AAAA" comparar con lastmodified. Date,
	// utilizar SimpleDateFormat

	public ArrayList<File> getEncontrados(String fecha) {
		return encontrados;
	}

	@Override
	public String toString() {
		return "BuscarDisco [encontrados=" + encontrados + "]";
	}//no se puede devolver un String de un arraylist

	public void mostrarDatos() {
		// TODO Auto-generated method stub
		for (File e:encontrados){
		System.out.println("Path absoluto: "+e.getAbsolutePath());
		System.out.println("Tama�o: "+e.length()+" b ("+e.length()/2048+"Mb)");
		System.out.println("�ltima modificaci�n: "+e.lastModified());
		}
	}

}
