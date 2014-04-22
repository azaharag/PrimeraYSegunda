package arrays;
import Utilidades.MiScanner;

public class MatrizX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiScanner s=new MiScanner();
		int f,c;
		System.out.println("Introduce número de filas y columnas, numero impar");
		f=s.nextInt();
		c=f;
		int [][]mat=new int[f][c];
		if(f%2==0)
		{
			System.out.println("No es un número impar");
		}
		else
		{
			
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[0].length;j++)
				{
					if(i==j||f==i+j+1)
					{
						mat[i][j]=1;
					}
					else
					{
						mat[i][j]=0;
					}
				}
			}
		}
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Fin de programa");
	}

}
