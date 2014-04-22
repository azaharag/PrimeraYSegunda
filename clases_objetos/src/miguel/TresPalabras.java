package miguel;

import java.util.StringTokenizer;

import Utilidades.MiScanner;

public class TresPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s = new MiScanner();
		String [] palabras=new String [3];
		
		String [] pronombres={"YO","TU", "EL", "ELLA", "NOSOTROS", "NOSOTRAS", "VOSOTROS", "VOSOTRAS", "ELLOS", "ELLAS"};
		String [] verbo={"ESTOY", "ESTAS", "ESTA", "ESTAMOS", "ESTAIS", "ESTÁN"};
		String patron="[A-Za-z]*(ANDO|ENDO)";
		
		
		System.out.println("Escribe una frase de tres palabras con un pronombre, verbo estar y un gerundio");
		String frase = s.nextLine();
		frase=frase.toUpperCase();
		StringTokenizer st =new StringTokenizer(frase, " ");
		for (int i=0;i<palabras.length;i++){
			palabras[i]=st.nextToken();
		}
		
		if (esPronombre(palabras, pronombres)&& esVerbo(palabras, verbo)&& esGerundio(palabras, patron))
			System.out.println("Frase correcta");
		else
			System.out.println("Frase incorrecta");
	
		
		

	}

	private static boolean esPronombre(String[] palabras, String[] pronombres) {
		boolean coincide = false;
		for (int i=0;i<pronombres.length;i++){
		if (palabras[0].equalsIgnoreCase(pronombres[i])){
			coincide= true;
			break;
			}
		else
		coincide= false;
		}
		if (coincide)
		return true;
		else
			return false;
	}

	private static boolean esVerbo(String[] palabras, String[] verbo) {
		boolean coincide = false;
		for (int i=0;i<verbo.length;i++){
		if (palabras[1].equalsIgnoreCase(verbo[i])){
			coincide= true;
			break;
			}
		else
		coincide= false;
		}
		if (coincide)
		return true;
		else
			return false;
	}

	private static boolean esGerundio(String[] palabras, String patron) {
		if (palabras[2].matches(patron))
			return true;
		else
		return false;
	}

}
