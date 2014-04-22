package letras;

import Utilidades.MiScanner;

public class PrincipalDni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiScanner s=new MiScanner();
		String nif;
		do
		{
			System.out.print("Introduzca nif:");
			nif=s.nextLine();
			if (!nif.equals("fin"))
			{
				if (nifValido(nif.toUpperCase()))
					System.out.println("NIF CORRECTO");
				else
					System.out.println("NIF INCORRECTO");
			}
		} while(!nif.equals("fin"));
		System.out.println("=== Fin de programa ===");
	}

	private static boolean nifValido(String nif) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		if (!nif.matches("[0-9]{8}-?[A-Z]"))
			return false;
		int indice=Integer.valueOf(nif.substring(0,8))%23;
		//Compara ultima letra del nif con la letra calculada
		return letras.charAt(indice)==nif.charAt(nif.length()-1);
	}

}
