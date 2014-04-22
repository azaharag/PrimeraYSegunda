package pruebas;

import java.util.Scanner;

public class Fechaexamen {
	int d;
	int m;
	int a;

	
	public static boolean bisiesto(int a) {

		return (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);
	}

	public static int diasMes(int m, int a) {

		switch (m) {
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
			if (bisiesto(a))
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}



	static public boolean fechaCorrecta(int dia, int mes, int anio) {
		// hara uso de los metodos bisiesto y diasMes

		if (mes < 1 || mes > 12)
			return false;

		if (anio < 1 || anio > 9999)
			return false;

		if (dia < 1 || dia > diasMes(mes, anio))
			return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduzca fecha (DDMMAAAA): ");
		int fecha=s.nextInt();
		int a=fecha%10000;
		int m=(fecha%1000000/10000);
		int d=fecha/1000000;
		System.out.println("Dia:"+d+" Mes:"+m+" Año:"+a);
		if (fechaCorrecta(d, m, a))
			System.out.println("Fecha Correcta.");
		else
			System.out.println("Fecha Incorrecta!");
		s.close();
	}
	

}
