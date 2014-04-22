package casiTodo;
import java.util.Scanner;
public class Lectura {
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
	 estadistica[26]=buscarLetra(texto,'Ñ');
	 estadistica['A'-'A']+=buscarLetra(texto,'Á');
	 estadistica['E'-'A']+=buscarLetra(texto,'É');
	 estadistica['I'-'A']+=buscarLetra(texto,'Í');
	 estadistica['O'-'A']+=buscarLetra(texto,'Ó');
	 estadistica['U'-'A']+=buscarLetra(texto,'Ú');
	 estadistica['U'-'A']+=buscarLetra(texto,'Ü');
	 return estadistica;
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		String t, p,l,m;
		Scanner s=new Scanner(System.in);
		/*System.out.println("Introduzca primer número");
		a=s.nextInt();
		System.out.println("He leido: "+a);
		System.out.println("Introduzca segundo número");
		b=s.nextInt();
		System.out.println("He leido: "+b);
		System.out.println("Introduzca cadena de caracteres");
		t=s.nextLine();
		p=s.nextLine();
		System.out.println("Cadena leida: "+p);*/
		
		//leer string por teclado
		/*System.out.println("Introduzca frase");
		l=s.nextLine();
		
		//longuitud
		System.out.println("La longuitud es "+l.length());
		
		//todo en mayusculas
		String mayus=l.toUpperCase();
		System.out.println(mayus);
		
		//letras de cada tipo
		char c;
		int cont=0;
		for(c='A';c<='Z';c++)
		{
			cont=0;
			for (int i=0;i<mayus.length();i++)
			{
				if(mayus.charAt(i)==c)
				{
					cont++;
				}
			}
			
			// quitar los ceros
		System.out.println("Letra "+c+" Número "+cont);
		
		}*/
		
		System.out.println("Introduzca frase");
		m=s.nextLine().toUpperCase();
	//	System.out.println("Introduzca caracter a buscar");
	//	String v=s.nextLine();
		//que devuelva el valor a una variable para quitar los ceros 
	//	System.out.println(buscarLetra(m,v.charAt(0)));
		
		//int [] estadist=estadisticaLetras(m);
		//imprimir(estadisticaLetras(m));
		
		for(int i=0;i<estadisticaLetras(m).length;i++)
		{
			if (estadisticaLetras(m)[i]!=0)
			{
			System.out.println("hay "+estadisticaLetras(m)[i]+" letras "+(char)(i+'A'));
			}
			
			
		}
				  
	
	
		
		
		
		
	}

}
