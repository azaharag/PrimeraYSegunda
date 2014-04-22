package envoltorios;

import Utilidades.MiScanner;

public class Envoltorio2 {
	

	public static void main(String[] args) {
		
		//Programa 2
		//convertir de base 2 a 10,8,16
		//numero binario(0-salir):101
		//decimal:5
		//octal:5
		//hexa:5
		
		int n=0;
		String t;
		MiScanner s=new MiScanner();
		boolean repetir=false;
		do{
			do{
				repetir=false;
				System.out.print("Introduce un número binario (0-Salir): ");
				t=s.nextLine();
				try{
					n=Integer.parseInt(t,2);
					if(!t.equalsIgnoreCase("0"))
						{
						System.out.println("Decimal: "+n);
						System.out.println("Octal: "+Integer.toOctalString(n));
						System.out.println("Hexadecimal: "+Integer.toHexString(n).toUpperCase());
						}
					}
				catch(Exception e)
				{
					System.out.println("Incorrecto");
					repetir=true;
				}
			}while(repetir);
			
			
		}while(!t.equalsIgnoreCase("0"));
		
		System.out.println("FIN DEL PROGRAMA");
		
	}
}
