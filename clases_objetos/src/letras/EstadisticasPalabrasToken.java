package letras;

import java.util.StringTokenizer;

import Utilidades.MiScanner;

public class EstadisticasPalabrasToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*"El euro está más alto que el dolar. El dolar está barato". usar uppercase
		 * Se pretende que diga "EL,EURO,ESTÁ..." lista de palabras sin que salgan repetidas
		 * 12 palabras countTokens
		 * Almacenamos las palabras en un array, buscamos en el para ver si no hay repetidos.
		 * Leer los tokens y guardarlos en el array 
		 * Crear dos métodos: void insertarPalabra(String[]pal,String p)
		 * boolean existePalabra(String[]pal,String p);
		 * 			if(!existePalabra(pal,p))
		 * 				insertarPalabra(pal,p)*/
			
			//String t="El euro está más alto que el dolar. El dolar está barato.";
			MiScanner s=new MiScanner();
			System.out.println("Introduzca frase");
			String t=s.nextLine();
			t=t.toUpperCase();
			//System.out.println(t);
			StringTokenizer st=new StringTokenizer(t," ./-,:;¿?¡!");
			String []palabras=new String[st.countTokens()];
			int []cont=new int[st.countTokens()];
			while(st.hasMoreTokens())
			{
				String palabra=st.nextToken();
				int posicion=existePalabra(palabras,palabra);
				if(posicion!=-1)
				{
					cont[posicion]++;
				}
				else
				{
					posicion=insertarPalabra(palabras,palabra);
					cont[posicion]=1;
				}
			}
			mostrarArray(palabras,cont);
		System.out.println("==========FIN DE PROGRAMA==========");
	}

	private static void mostrarArray(String[] pal,int cont[]) 
	{
		for(int i=0;i<pal.length;i++)
		{
			if(pal[i]!=null)
			System.out.println(pal[i]+"-"+cont[i]);
		}
	}

	private static int insertarPalabra(String[] pal, String p) 
	{
		int i;
		for(i=0;i<pal.length;i++)
		{
			if(pal[i]==null)
			{	
				pal[i]=p;
				return i;
			}
		}
		return -1;
	}

	private static int existePalabra(String[] pal, String p) 
	{
		int i;
		for(i=0;i<pal.length;i++)
		{
			if(p.equalsIgnoreCase(pal[i]))
				return i;
		}
		return -1;
	}
}
