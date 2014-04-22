package excepciones;

import java.util.InputMismatchException;

import Utilidades.MiScanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s=new MiScanner();
		int a = 1;
		try{
			a=s.nextInt();
			int b=6/a;
			System.out.println(b);
		}catch(InputMismatchException e)
		{
			System.out.println("Excepción al leer");
		}
		catch(Exception e)		//jerarquía de excepciones: de las hijas a los padres(de específica a genérica)
		{
			System.out.println("Excepción al dividir");
		}
		
		System.out.println("==FIN PROGRAMA==");
	}

}
