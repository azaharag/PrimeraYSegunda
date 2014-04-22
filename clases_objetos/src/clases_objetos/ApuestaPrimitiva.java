package clases_objetos;
import java.util.Random;
public class ApuestaPrimitiva {
	int [] comb;
	
	ApuestaPrimitiva()
	{
		comb=new int[6];
		for(int i=0;i<comb.length;i++)
		{
			comb[i]=asignarNumero();
		}
	}
	
	int asignarNumero()
	{
		int n;
		boolean encontrado;
		do{
			n=generarNumero();
			//busco n el array de combinaciones
			encontrado=buscarNumero(n);
		}while(encontrado);
		
			return n;
			//controlar duplicados
	}

	int generarNumero()
	{
		Random r=new Random();
		return r.nextInt(49)+1;
	}
	
	boolean buscarNumero(int n)
	{
		for(int i=0;i<comb.length;i++)
		{
			if(comb[i]==n)
				return true;	
		}
		return false;
	}
	
	 void imprimir()
		{
			for(int i=0;i<comb.length;i++)
			{
				System.out.print(comb[i]+"\t");
			}
			System.out.println("\n");
		}
}

