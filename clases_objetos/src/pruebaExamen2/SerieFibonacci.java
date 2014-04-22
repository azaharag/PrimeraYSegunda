package pruebaExamen2;

import java.util.ArrayList;

import Utilidades.MiScanner;

public class SerieFibonacci {

	public static void main(String[] args) {
		MiScanner s=new MiScanner();
		
		System.out.print("Introduce cuantos números de la serie quieres: ");
		int n=s.nextInt();
		
		ArrayList<Integer> fibonacci=new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		rellenarArray(fibonacci,n);
	}

	private static void rellenarArray(ArrayList<Integer> fibonacci, int n) {
		for(int i=2;i<n;i++)
		{
			fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
		}
		mostrarArray(fibonacci);
	}

	private static void mostrarArray(ArrayList<Integer> fibonacci) {
		for(int i=0;i<fibonacci.size();i++)
		{
			System.out.print(fibonacci.get(i)+",");
		}
	}

}
