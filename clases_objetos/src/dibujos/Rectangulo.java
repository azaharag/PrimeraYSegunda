package dibujos;

public class Rectangulo {

	int filas;
	int columnas;
	char simbolo;
	Rectangulo(int f, int c, char s)
	{
		filas=f;
		columnas=c;
		simbolo=s;
	}
	Rectangulo ()
	{
		filas=1;
		columnas=2;
		simbolo='*';
	}
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	public char getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}
	void dibujar()
	{
		for (int i=1; i<=filas;i++)
		{
			
			for (int j=1;j<columnas;j++)
			{
				System.out.print(simbolo);
			}
			
			System.out.println(simbolo);
		}
	}
	void dibujarHueco()
	{
		for (int i=1;i<=filas;i++)
		{
			
			for (int j=1;j<=columnas;j++)
			{
				if(i==1 || i==filas || j==1 || j==columnas)
				{
				System.out.print(simbolo+" ");
				}
				else
				{
				System.out.print(" "+" ");
				}
			}
			
			System.out.println();
		}
	}
	
}
