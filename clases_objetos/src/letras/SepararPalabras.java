package letras;
import Utilidades.MiScanner;

public class SepararPalabras {

	public static String primeraPalabra(String t)
	{
		t=t.trim();//quita los espacios de principio y fin
		int i=t.indexOf(" ");
		if(i!=-1)
			return t.substring(0,i);
		else
			return t;
		
	}
	public static String ultimaPalabra(String t)
	{
		t=t.trim();
		int i;
		String blanco;
		boolean encontrado;
		blanco=t;
		do
		{
		i=blanco.indexOf(" ");
		encontrado=i!=-1;
			if(encontrado)
				blanco=blanco.substring(i+1);
		}while(encontrado);
		return blanco;
	}
	public static String ultimaPalabraBis(String t)
	{
		t=t.trim();
		int i=t.lastIndexOf(' ');
		if(i!=-1)
			return t.substring(i+1);
		else 
			return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiScanner s=new MiScanner();
		String t;
		do
		{
		System.out.println("Introduzca frase");
		t=s.nextLine();
		if(!t.equalsIgnoreCase("FIN"))
		{
			System.out.println("Primera palabra: "+primeraPalabra(t));
			System.out.println("Última palabra: "+ultimaPalabra(t));
			System.out.println("Última palabra bis: "+ultimaPalabraBis(t));
		}
		}while(!t.equalsIgnoreCase("FIN"));
		System.out.println("==========================FIN DEL PROGRAMA========================");
		
		
		
	}

}
