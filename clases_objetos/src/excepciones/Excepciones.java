package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=0;
		boolean repeticion;
		do{
			repeticion=false;
			System.out.println("Introduzca n�mero");
		try{
			n=s.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("N�mero inv�lido");
			s.nextLine();//Vaciar buffer de entrada
			repeticion=true;
		}
		}while(repeticion);
		System.out.println("Se ha leido "+n);
	}

}
