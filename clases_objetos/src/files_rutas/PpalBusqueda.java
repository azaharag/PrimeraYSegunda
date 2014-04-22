package files_rutas;

import java.io.File;
import java.text.ParseException;

import Utilidades.Menu1Daw;

public class PpalBusqueda {

	public static void main(String[] args) throws NoEsDirectorio, ParseException {
		// Carpeta donde buscar: /temp (existir y ser carpeta)
		// 1-Buscar por nombre--> Cadena?(Archivos o carpetas)
		// 2-Buscar por archivos mayores que-->MBytes?
		// 3-Buscar modificados después de--> fecha?
		// 0-Salir
		//Elemento encontrado: Path Absoluto, tamaño solo de los archivos
		//(bytes y megabytes), fecha y hora de ultima modificación(lastModified())

		Menu1Daw menu=new Menu1Daw("==Búsqueda==","Salir del programa.",4,true);
		menu.aniadeOpcion("Buscar por nombre.");
		menu.aniadeOpcion("Buscar por archivos mayores que.");
		menu.aniadeOpcion("Buscar modificados después de.");
		int opc;
		File f=new File("C:/Users");
		Busqueda b=new Busqueda(f);
		do {
			menu.mostrar();
			opc = menu.pideOpcion();
			switch (opc) {
			case 1:
				b.buscarNombre("Hola",f);
				b.mostrar();
				b.limpiar();
				break;
			case 2:
				b.buscarMayores(2048,f);
				b.mostrar();
				b.limpiar();
				break;
			case 3:
				b.buscarModificadosDespues("22-6-2013",f);
				b.mostrar();
				b.limpiar();
				break;
			}
		} while (opc != 0);
	}
}
