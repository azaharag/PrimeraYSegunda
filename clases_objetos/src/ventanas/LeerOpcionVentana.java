package ventanas;

import javax.swing.JOptionPane;

public class LeerOpcionVentana {

	public static void main(String[] args) {
		//Detectar las cuatro posibilidades de salida
		//Sacar una ventanita para cada una de ellas
		
		int confirmado=JOptionPane.showConfirmDialog(null, "Elige un Botón");
		
		switch(confirmado)
		{
			case (JOptionPane.OK_OPTION):
				JOptionPane.showMessageDialog(null, "SI");
				break;
			case (JOptionPane.CANCEL_OPTION):
				JOptionPane.showMessageDialog(null, "CANCELAR");
				break;
			case (JOptionPane.CLOSED_OPTION):
				JOptionPane.showMessageDialog(null, "CERRAR");
				break;
			default:
				JOptionPane.showMessageDialog(null, "NO");
				break;
		}

	}

}
