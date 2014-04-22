package dibujos;

public class Triangulo {

	int filas;
	char simbolo;
	Triangulo(int f,char c)
	{
		filas=f;
		simbolo=c;
	}
	Triangulo ()
	{
		filas=1;
		simbolo='*';
	}
	void setFilas(int f)
	{
		filas=f;
	}
	void setSimbolo(char c)
	{
		simbolo=c;
	}
	int getFilas()
	{
		return filas;
	}
	char getSimbolo()
	{
		return simbolo;
	}
	void dibujar()
	{
		for (int i=1;i<=filas;i++)
		{
			for(int j=1;j<=filas-i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print(simbolo+" ");
			}
		System.out.print("\n");
		}
	}
}
