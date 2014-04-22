package pruebaExamen2;

import java.util.StringTokenizer;

import Utilidades.MiScanner;

public class PresenteDeIndicativo {

	public static void main(String[] args) {
		MiScanner s=new MiScanner();
		System.out.print("Introduce frase: ");
		String t=s.nextLine();
		StringTokenizer st=new StringTokenizer(t);
		if(st.countTokens()!=3)
		{
			System.out.println("No es presente de indicativo");
		}
		else
		{
			String pronombre=st.nextToken();
			if(pronombreCorrecto(pronombre))
			{
				String verbo=st.nextToken();
				if(verboCorrecto(verbo))
				{
					String gerundio=st.nextToken();
					if(gerundioCorrecto(gerundio))
					{
						System.out.println("La frase es presente de indicativo");
					}
					else
						System.out.println("No es presente de indicativo");
				}
				else
					System.out.println("No es presente de indicativo");
				
			}
			else
				System.out.println("No es presente de indicativo");
			
		}

	}

	private static boolean gerundioCorrecto(String gerundio) {
		gerundio=gerundio.toLowerCase();
		if(gerundio.substring(gerundio.length()-4, gerundio.length()).equalsIgnoreCase("ando")
				||gerundio.substring(gerundio.length()-4, gerundio.length()).equalsIgnoreCase("endo") )
		{
			return true;
		}
		return false;
	}

	private static boolean verboCorrecto(String verbo) {
		String v[]={"estoy","estas","esta","estamos","estais","estan"};
		for(int i=0;i<v.length;i++)
		{
			if(verbo.equalsIgnoreCase(v[i]))
				return true;
		}
		return false;
	}

	private static boolean pronombreCorrecto(String pronombre) {
		String []p={"yo","tu","el","ella","nosotros","nosotras","vosotros","vosotras","ellos","ellas"};
		for(int i=0;i<p.length;i++)
		{
			if(pronombre.equalsIgnoreCase(p[i]))
				return true;
		}
		return false;
	}

}
