package clases_objetos;
import java.util.Scanner;
public class Anagrama {

	public static boolean sonAnagrama(String t1, String t2)
	{
		int[] e1,e2;
		e1=Lectura.estadisticaLetras(t1);
		e2=Lectura.estadisticaLetras(t2);
		for(int i=0;i<e1.length;i++)
		{
			if(e1[i]!=e2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String p1, p2;
		
		
		System.out.print("Introduzca primera palabra: ");
		p1=s.nextLine().toUpperCase();
		System.out.print("Introduzca segunda palabra: ");
		p2=s.nextLine().toUpperCase();
		
		if (sonAnagrama(p1,p2))
		{
			System.out.println(p1+" y "+p2+" son Anagramas");
		}
		else
		{
			System.out.println(p1+" y "+p2+" no son Anagramas");
		}
	}

}
