package pruebas;

public class TrianguloVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tama�o=6;
	
		for(int i=0;i<tama�o;i++){
			if(i==0){
				for(int j=0;j<tama�o-(i+1);j++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println("");
			}else{
				if(i==(tama�o-1)){
					for(int j=0;j<tama�o;j++){
						System.out.print("* ");
					}
				}else{
					for(int j=0;j<tama�o-(i+1);j++){
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
