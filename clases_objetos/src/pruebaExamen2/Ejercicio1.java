package pruebaExamen2;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
	int [] numeros= new int[10];
	int [] noNumeros={1,2,3,4,5,6,7,8,9,10};
	Random r=new Random();
	int maximo;
	boolean esta = true;
	
		for(int i=0; i<numeros.length;i++){
			numeros[i]=r.nextInt(10)+1;
		}
	
		for(int i=0; i<numeros.length;i++){
			maximo=numeros[i];
			for(int j=0; j<numeros.length;j++){
				if (numeros[j]>maximo){
					maximo=numeros[j];
					numeros[j]=numeros[i];
					numeros[i]=maximo;
				}
			
			}
		}
		
		
		for(int i=0;i<numeros.length;i++)
		{
			if(numeros[i]!=noNumeros[i])
				{
					
				}
		}
		
		for(int i = 0;i<numeros.length;i++){
		System.out.print("["+numeros[i]+"] ");
		}
		System.out.println();
		
		for(int i=0;i<noNumeros.length;i++){
			if(!verifica(noNumeros[i], numeros))
			{
				System.out.print((i+1)+" ");
			}
		}
		
	}
	
	static boolean verifica(int numeros,int []n)
	{
		
		for(int i=0;i<n.length;i++){
			if (numeros==n[i])
			{
				return true;
			}
		}
	return false;

	}
}
