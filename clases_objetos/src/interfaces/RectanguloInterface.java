package interfaces;

public class RectanguloInterface implements Dibujable{
	int filas;
	int columnas;
	char simbolo;
	public RectanguloInterface(int filas, int columnas, char simbolo) {
		this.filas = filas;
		this.columnas = columnas;
		this.simbolo = simbolo;
	}
	
	public void dibujar()
	{
		for(int i=1;i<=filas;i++)
		{
			//Escribe simbolos
			for(int k=1;k<=columnas;k++)
			{
				System.out.print(simbolo+" ");
			}
			//Salto de linea
			System.out.println();
		}
	}

	@Override
	public void dibujarHueco() {
		
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

