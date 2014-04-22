package pruebas;

import java.util.Scanner;

public class BorrarMiguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int d;
		int m;
		int a;
		System.out.println("Introduce una fecha (DDMMAAAA)");
		int fecha=s.nextInt();
		
		d=fecha/1000000;
		m=(fecha/10000)%100;
		a=fecha%10000;
		
		if (fechaCorrecta(d,m,a))
			System.out.println("Fecha correcta");
		else
			System.out.println("Fecha incorrecta");
		
		
		
	}

	private static boolean fechaCorrecta(int d, int m, int a) {
		// TODO Auto-generated method stub
		if (d<0 || d>diaCorrecto(m, a))
			return false;
		if (m<0 || m>13)
			return false;
		if (a<0 || a>10000)
			return false;
		
		return true;
	}

	private static int diaCorrecto(int m, int a) {
		// TODO Auto-generated method stub
		
		switch(m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return (30);
		case 2:
			if (añoBisiesto(a))
				return (29);
			else
				return(28);
			default:
			return (0);
			
		}
	}

	private static boolean añoBisiesto(int a) {
		// TODO Auto-generated method stub

		if ((a%4==0)&& (a%100==0)||(a%400!=0))
			return true;
		else
			return false;
	}

}
