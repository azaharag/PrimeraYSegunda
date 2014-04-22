package pruebas;

public class TrianguloVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamaño=6;
	
		for(int i=0;i<tamaño;i++){
			if(i==0){
				for(int j=0;j<tamaño-(i+1);j++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println("");
			}else{
				if(i==(tamaño-1)){
					for(int j=0;j<tamaño;j++){
						System.out.print("* ");
					}
				}else{
					for(int j=0;j<tamaño-(i+1);j++){
						System.out.print(" ");
					}
					System.out.print("* ");
					for(int j=0;j<i;j=j+2){
						if(i==1){
							System.out.print("");
						}else{
							System.out.print("  ");
						}
						
					}
					System.out.print("*");
					System.out.println("");
				}
			}
		}
	}

}
