package Fich.BusquedasMenu;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import Utilidades.Menu1Daw;
import Utilidades.MiScanner;

public class Principal {
	static MiScanner s=new MiScanner();
	static BuscaDisco busqueda;
	
	public static void main(String[] args) throws NoEsDirectorioExcep {
		
		busqueda=new BuscaDisco(".");
		
		Menu1Daw m=new Menu1Daw("", "Salir", 4, true);
		m.aniadeOpcion("Seleccionar carpeta donde buscar");
		m.aniadeOpcion("Buscar por nombre");
		m.aniadeOpcion("Buscar por tamaño");
		m.aniadeOpcion("Buscar por fecha");
		
		int opcion;
		do {
			System.out.println("Buscando en ["+busqueda.getDonde().getAbsolutePath()+"]");
			m.mostrar();
			opcion = m.pideOpcion();
			switch (opcion) {
			case 1:
				seleccionarCarpeta();
				break;
			case 2:
				porNombre();
				break;
			case 3:
				porTamanio();
				break;
			case 4:
				porFecha();
				break;
			}
		} while (opcion != 0);
		
		System.out.println("== Programa finalizado ==");
	}

	private static void porFecha() {
		//Mensaje de no resultado
		System.out.print("Modificados a partir del DD-MM-AAAA:");
		String fecha=s.nextLine();
		try {
			busqueda.buscarModificadosDespues(fecha);
			if (busqueda.getEncontrados().size()==0)
				JOptionPane.showMessageDialog(null, "No se ha encontardo nada");
			else
				System.out.println(busqueda);
		} catch (FechaInvalidaExcep e) {
			System.out.println(e.getMessage());
		}
	}

	private static void porTamanio() {
		//mensaje de no resultado
		System.out.print("Mayores que cuanto MBytes?");
		int mb=s.nextInt();
		long tam=mb*1024L*1024L;
		busqueda.buscarMayores(tam);
		if (busqueda.getEncontrados().size()==0)
			JOptionPane.showMessageDialog(null, "No se ha encontardo nada");
		else
			System.out.println(busqueda);
	}

	private static void porNombre() {
		//mensaje de no resultado
		System.out.print("Cadena que debe contener el nombre:");
		String cadena=s.nextLine();
		busqueda.buscarNombre(cadena);
		if (busqueda.getEncontrados().size()==0)
			JOptionPane.showMessageDialog(null, "No se ha encontardo nada");
		else
			System.out.println(busqueda);
	}

	private static void seleccionarCarpeta() throws NoEsDirectorioExcep {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(busqueda.getDonde());
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int seleccion = fileChooser.showOpenDialog(null);
		if (seleccion == JFileChooser.APPROVE_OPTION)
		{
			busqueda.setDonde(fileChooser.getSelectedFile());
		}
	}
}
