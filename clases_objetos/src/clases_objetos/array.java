package clases_objetos;
import java.util.Scanner;
/**
 * @author Azahara
 * Probar arrays con impresi�n por pantalla y generaci�n de prograsi�n geom�trica
 * 
 *
 */
public class array {
	/**
	 * Este m�todo imprime por pantalla el array en una sola l�nea, separado por un caracter
	 * @param n el array de enteros a imprimir
	 * @param c el tipo de caracter de separaci�n
	 */
	public static void  imprimirHorizontal(int[]n,char c)
	{
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
			if(i!=n.length-1)
			{
			System.out.print(c);
			}
			
		}
		System.out.println("\n");
	}
	public	static void  imprimirVertical(int[]n)
		{
			for(int i=0;i<n.length;i++)
			{
				System.out.println(n[i]);
				
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n= new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce primer n�mero");
		n[0]= s.nextInt();
		//comienzo en 1 y acabo en 19
		for(int i=1; i<20;i++)
		{
			//relleno con el doble del anterior
			n[i]=2*n[i-1];
		}
		//mostrar elementos del array
	/*	for(int i=0; i<20;i++)
		{
			System.out.print(+n[i]+",");
		}*/
		imprimirHorizontal(n,',');
		imprimirVertical(n);
		System.out.println("Fin del Programa");
		
	}

}
