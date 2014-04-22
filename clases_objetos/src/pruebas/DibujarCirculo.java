package pruebas;

public class DibujarCirculo {

	public static void main(String[] args) {
		
		dibujarCirculo(4);

	}

	public static void dibujarCirculo(int n) {

		for (int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=n+i;k++)
			{
				System.out.print("*"+" ");
			}
		System.out.print("\n");
		}
		for (int i=1; i<n-2;i++)
		{
			
			for (int j=1;j<n*2;j++)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println("*");
		}
		for(int i=n-1;i>=1;i--)
		{
			//Escribeblancos
			for(int j=1;j<=n-1-i;j++)
				System.out.print(' ');
			//Escribesimbolos
			for(int k=1;k<=n+i;k++)
			{
				System.out.print("*");
				System.out.print(' ');
			}
			//Saltodelinea
			System.out.println();
		}
	}
}
