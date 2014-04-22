package arrays;

public class Matrices {

	public static void rellenarMatriz(int [][]m)
	{
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				if(i==0)
				{
					m[i][j]=j+1;
				}
				else
				{
					m[i][j]=m[i-1][j]*2;
				}
					
			}
		}
	}
	public static void pintarMatriz(int [][]m)
	{
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				
					System.out.print(m[i][j]+"\t");
		
					
			}
		System.out.println();
		}
	}
	
	public static boolean rellenarDiagonalSuperior(int [][] m)
	{
		int cont=1;
		if(m.length==m[0].length)
		{
			for(int i=0;i<m.length;i++)
			{
				for(int j=0;j<m[0].length;j++)
				{
					if(i<=j)
					{
						m[i][j]=cont;
						cont++;
					}	
					else
					{
						m[i][j]=0;
					}
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean rellenarDiagonalInferior(int [][] m)
	{
		int cont=1;
		if(m.length==m[0].length)
		{
			for(int i=0;i<m.length;i++)
			{
				for(int j=0;j<m[0].length;j++)
				{
					if(i<j)
					{
						m[i][j]=0;
					}	
					else
					{
						m[i][j]=cont;
						cont++;
					}
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void matrizColumna(int [][]m)
	{
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				if(j==0)
				{
					m[i][j]=0;
				}
				else
				{
					if(i==0)
					{
						m[i][j]=j*4;
					}
					else
					{
						m[i][j]=m[i-1][j]*2;
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]mat=new int[3][5];
		rellenarMatriz(mat);
		pintarMatriz(mat);
		System.out.println();
		int[][] mat2=new int[4][4];
		if(!rellenarDiagonalSuperior(mat2))//matriz con 1 por encima de la diagonal principal j>=i
			System.out.println("La Matriz no es cuadrada");
		else
			pintarMatriz(mat2);
		System.out.println();
		int[][] mat3=new int[3][3];
		if(!rellenarDiagonalInferior(mat3))//comprobar que es cuadrada mleght=m0lenght j<=i
			System.out.println("La Matriz no es cuadrada");
		else
			pintarMatriz(mat3);//boolean 
		System.out.println();
		matrizColumna(mat);
		pintarMatriz(mat);
	
	System.out.println("Fin de programa");
	}

}
