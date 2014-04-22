package envoltorios;

import Utilidades.MiScanner;

public class Envoltorio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un string y categorizar los caracters del string en mayusculas,minusculas,
		//espacios en blanco,digitos y otros
		//23 casas de la pradera en Honolulu.
		//4 contadores longitud string-sumacontadores=otros
		
		MiScanner s=new MiScanner();
		int []res;
		System.out.print("Introduce una frase: ");
		String t=s.nextLine();
		ClasificacionCaracteres cc=new ClasificacionCaracteres(t);
		cc.mostrarClasificacion();
		System.out.println(cc.getEstadistica()[0]);
		
//		res=cataloga(t);
//		System.out.println("Mayúsculas: "+res[0]);
//		System.out.println("Minúsculas: "+res[1]);
//		System.out.println("Dígitos: "+res[2]);
//		System.out.println("Espacios: "+res[3]);
//		System.out.println("Otros: "+res[4]);
		System.out.println("===FIN DEL PROGRAMA===");
			
	}

	static int[]cataloga(String texto)
	{
		int[]est=new int[5];
		int contMay=0,contMin=0,contDig=0,contSpc=0;
		char c;
		//Array=0-mayusculas,1-minusculas,2-digitos,3-espacios,4-otros
		for(int i=0;i<texto.length();i++)
		{
			c=texto.charAt(i);
			if(Character.isUpperCase(c))
				contMay++;
			if(Character.isLowerCase(c))
				contMin++;
			if(Character.isDigit(c))
				contDig++;
			if(Character.isWhitespace(c))
				contSpc++;
		}
		
		est[0]=contMay;
		est[1]=contMin;
		est[2]=contDig;
		est[3]=contSpc;
		est[4]=texto.length()-(contMay+contMin+contDig+contSpc);
		return est;
	}
}
