package pruebas;

public class DibujoMatrices {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont=0;
		int [][]mat=new int[9][9];
		for(int i=0;i<mat.length;i++)
		{
			for (int j=0;j<mat[0].length;j++)
			{
				if(cont%2==0)
				{
					mat[i][j]=1;
					
				}
				else
				{
					mat[i][j]=0;
				}
				cont++;	
			}
		}
		pintarMatriz(mat);
		for(int i=0;i<mat.length;i++)
		{
			for (int j=0;j<mat[0].length;j++)
			{
				if(i==(mat.length-1)/2||j==(mat[0].length-1)/2)
				{
					mat[i][j]=1;
					
				}
				else
				{
					mat[i][j]=0;
				}
				
			}
		}
		System.out.println();
		pintarMatriz(mat);
		
		for(int i=0;i<mat.length;i++)
		{
			for (int j=0;j<mat[0].length;j++)
			{
				if(i==(mat.length-1)/2||j==(mat[0].length-1)/2||i==j||mat.length==i+j+1)
				{
					mat[i][j]=11;
					
				}
				else
				{
					mat[i][j]=0;
				}
				
			}
		}
		System.out.println();
		pintarMatriz(mat);
		
	}

}
