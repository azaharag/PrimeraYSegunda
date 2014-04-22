package pruebas;
import Utilidades.MiScanner;
public class IntercambioMatriz {

	public static void imprimirMatriz(int [][]m)
	{
		for (int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
		System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s=new MiScanner();
		int f,c;
		System.out.println("Introduce número de filas");
		f=s.nextInt();
		System.out.println("Introduce número de columnas");
		c=s.nextInt();
		int [][] mat=new int [f][c];
		int [] aux1=new int [f];
		int [] aux2=new int[f];
		for (int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(i==0)
				{
					mat[i][j]=j+1;
				}
				else
				{
					mat[i][j]=mat[i-1][j]*2;
				}
			}
		}
		imprimirMatriz(mat);
		for (int i=0;i<mat.length;i++)
		{
			for (int j=0;j<mat[0].length;j++)
			{
				if(i==0)
				{
					aux1[j]=mat[i][j];
					aux2[j]=mat[i+1][j];
					mat[i][j]=aux2[j];
					mat[i+1][j]=aux1[j];
				}
				
			}
		}
		
		
		imprimirMatriz(mat);
		for (int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if((i==0&&j==0)||(i==0&&j==c-1)||(i==f-1&&j==0)||(i==f-1&&j==c-1))
					System.out.print(mat[i][j]+"\t");
			}
		}
	}

}
