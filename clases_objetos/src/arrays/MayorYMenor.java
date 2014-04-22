package arrays;

import Utilidades.MiScanner;

public class MayorYMenor {

	public static void main(String[] args) {
		
		MiScanner s=new MiScanner();
		int max=0,min=0,n=0;
		String t;
		boolean primero=true;
		do {
			System.out.println("Introduce un número. Fin para salir");
			t=s.nextLine();
			try{
				n=Integer.valueOf(t);}
			catch(Exception e){
				if(!t.contentEquals("fin"))
				{
					System.out.println("ERROR");
				}
			}
			if (primero)
			{
				max=n;
				min=n;
				primero=false;
			}
			else
			{
				if(n>max)
					max=n;
				if(n<min)
					min=n;
			}	
		}while(!t.equalsIgnoreCase("fin"));
		System.out.println("Menor: "+min);
		System.out.println("Mayor: "+max);
	}
}
