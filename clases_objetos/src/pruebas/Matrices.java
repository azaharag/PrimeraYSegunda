package pruebas;

public class Matrices {

	public static void imprimir(int [][]m){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int[][] m = new int[3][3];
		int[][] m1 = new int[3][3];
		int[][] mr = new int[3][3];
		
		/* for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.print("1 ");
			}
			
			System.out.println("1 ");
		} */
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m1[0].length; j++){
				mr[i][j] = m[i][j]*m1[i][j];
			}
		}
		imprimir(mr);
	}

}
