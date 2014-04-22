package casiTodo;
import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numeros= new int[15];
		double media=0;
		int cont=0;
		int elem;
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce número, máximo 15. Si pulsas 0 termino");
		do{
			System.out.println("Numero");
			elem=s.nextInt();
			if(elem!=0)
			{
				numeros[cont]=elem;
				media=media+elem;
				cont++;
			}
		}while(elem!=0&&cont<15);
		media=media/cont;
		for(int i=0; i<numeros.length;i++)
		{
			System.out.print(numeros[i]+" ");
		}
		System.out.println("La media es :"+media);
		System.out.println("Fin del programa");
		
	}

}
