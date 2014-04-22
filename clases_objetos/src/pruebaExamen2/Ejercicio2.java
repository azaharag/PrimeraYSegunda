package pruebaExamen2;

import Utilidades.MiScanner;

public class Ejercicio2 {
//TERMINAR!!!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s = new MiScanner();
		int []est;
		System.out.println("Introduzca una frase");
		String t1 = s.nextLine();
		System.out.println("Introduzca otra frase");
		String t2 = s.nextLine();
		System.out.println("Introduzca otra frase");
		String t3 = s.nextLine();

		System.out.println("Primera frase:");
		quitarImpares(t1);
		est=estadisticaLetras(t1);
		maximoMinimoLetras(est);
		System.out.println();
		System.out.println("Segunda frase:");
		quitarImpares(t2);
		est=estadisticaLetras(t2);
		maximoMinimoLetras(est);
		System.out.println();
		System.out.println("Tercera frase:");
		quitarImpares(t3);
		est=estadisticaLetras(t3);
		maximoMinimoLetras(est);
		System.out.println();

		
		
	}

	private static void maximoMinimoLetras(int[] est) {
		int min=Integer.MAX_VALUE, pos_min = 0;
		int max=Integer.MIN_VALUE, pos_max = 0;
		for(int i=0;i<est.length;i++)
		{
			if(est[i]==0)
				continue;
			if(est[i]>max)
			{
				pos_max=i;
				max=est[i];
			}
			if(est[i]<min)
			{
				pos_min=i;
				min=est[i];
			}
		}
		System.out.println("La letra menos repetida es: "+('A'+pos_min)+(min));
		System.out.println("La letra mas repetida es: "+('A'+pos_max)+(max));
	}

	private static void quitarImpares(String t) {
		String t1="";
		int cont = 0;
		for(int i=0;i<t.length();i++)
		{
			if(i%2!=0 && t.charAt(i)!=' ')
			{
				t1=t1+t.charAt(i);
				cont++;
			}
		}
		System.out.println("la frase sin los impares queda: "+t1); 
		System.out.println("se han quitado "+cont+" caracteres");
	}

public static int buscarLetra(String texto, char c)
{
	int cont=0;
		for (int i=0;i<texto.length();i++)
		{
			if(texto.charAt(i)==c)
			{
				cont++;
			}
		} 
		return cont;
}

public static int[] estadisticaLetras(String texto)
{
	 int []estadistica= new int[27];
	 
	 for (int c='A';c<='Z';c++)
	 {
		 int cont=0;
	 for (int i=0;i<texto.length();i++)
	 {
		 if(texto.charAt(i)==c)
		 {
			 cont++;
		 }
	 }
	 estadistica[c-'A']=cont;
	 }
	
	 return estadistica;
}
}

	
