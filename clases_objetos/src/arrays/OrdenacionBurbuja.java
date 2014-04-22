package arrays;

public class OrdenacionBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,maximo,aux;
		int[]numeros={1,52,6,-8};
		boolean flota=true;
		for(i=0;i<numeros.length;i++)
		{
			maximo=numeros[i];
			for(j=0;j<numeros.length;j++)
			{
				if(numeros[j]>maximo)
				{
					maximo=numeros[j];
					numeros[j]=numeros[i];
					numeros[i]=maximo;
				}
			}
		}
		
		for(int k=0;k<numeros.length;k++)
			System.out.println(numeros[k]);
		
		while(flota)
		{
			flota=false;
			for(i=0;i<numeros.length-1;i++)
			{
				if(numeros[i]>numeros[i+1])
				{
					flota=true;
					aux=numeros[i+1];
					numeros[i+1]=numeros[i];
					numeros[i]=aux;
				}
			}
		}
		
	
		for(int k=0;k<numeros.length;k++)
			System.out.println(numeros[k]);
		
		System.out.println("Menor: "+numeros[0]);
		System.out.println("Mayor: "+numeros[numeros.length-1]);
	}

}
