package interfaces;

public class TrianguloInterface implements Dibujable{
	int filas;
	char simbolo;
	
	TrianguloInterface(int f, char c)
	{
		filas=f;
		simbolo=c;
	}
	public void dibujar()
	{
		for(int i=1;i<=filas;i++)
		{
			//Escribe blancos
			for(int j=1;j<=filas-i;j++)
				System.out.print(' ');
			//Escribe simbolos
			for(int k=1;k<=i;k++)
			{
				System.out.print(simbolo);
				System.out.print(' ');
			}
			//Salto de linea
			System.out.println();
		}
	}
	void dibujarInvertido()
	{
		for(int i=filas;i>=1;i--)
		{
			//Escribe blancos
			for(int j=1;j<=filas-i;j++)
				System.out.print(' ');
			//Escribe simbolos
			for(int k=1;k<=i;k++)
			{
				System.out.print(simbolo);
				System.out.print(' ');
			}
			//Salto de linea
			System.out.println();
		}
	}
	@Override
	public void dibujarHueco() {
	
		for(int i=1;i<=filas;i++)
		{
			//Escribe blancos
			for(int j=1;j<=filas-i;j++)
				System.out.print(' ');
			//Escribe simbolos
			for(int k=1;k<=i;k++)
			{
				if(k==1||k==i||i==filas)//Borde
				{
					System.out.print(simbolo);
					System.out.print(' ');
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			//Salto de linea
			System.out.println();
		}
		System.out.println();
		
	}
}
