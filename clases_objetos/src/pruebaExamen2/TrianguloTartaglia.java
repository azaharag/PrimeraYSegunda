package pruebaExamen2;

import Utilidades.MiScanner;

public class TrianguloTartaglia {
	private static int[][] filas;
	public static void main(String[] args) {
		MiScanner s=new MiScanner();
		int n = 0;
		boolean mal=false;
		
		do{
			mal=false;
			try{
				System.out.println("Dime el número de filas del triángulo");
				n=s.nextInt();//validar no negativo
			}catch(Exception e)
			{
				mal=true;
				System.out.println("Incorrecto");
				s.nextLine();
			}
		
		}while(mal);
		filas=new int [n][n];
//		for(int i=0;i<=n;i++)
//		{
//			filas[i-1]=new int[i];
//		}
		rellenar();
		mostrar();
	}
	private static void mostrar() {
		for(int i=0;i<filas.length;i++)
		{
			for(int j=0;j<filas[0].length;j++)
			{
				System.out.println(filas[i][j]);
			}
		}
		
	}
	private static void rellenar() {
		for(int i=0;i<filas.length;i++)
		{
			for(int j=0;j<filas[0].length;j++)
			{
				if(j==0||j==filas[i].length-1)
					filas[i][j]=1;
				else
					filas[i][j]=filas[i-1][j]+filas[i-1][j-1];
			}
		}
		
	}

}
