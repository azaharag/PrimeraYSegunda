package pruebas;

import Utilidades.MiScanner;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa 1
		//numero entero(0-salir):7
		//binario: 111
		//octal: 7
		//hexa: 7
		//numero entero(0-salir):32
		//binario:100000
		//octal:...
		
		int n=0;
		Integer num=new Integer(0);
		MiScanner s=new MiScanner();
		boolean repetir=false;
		do{
			do{
				repetir=false;
				System.out.print("Introduce un número entero (0-Salir): ");
				try{
					n=s.nextInt();
						if(n!=0)
							{
						System.out.println("Binario: "+num.toBinaryString(n));
						System.out.println("Octal: "+num.toOctalString(n));
						System.out.println("Hexadecimal: "+num.toHexString(n).toUpperCase());
							}
					}
				catch(Exception e)
				{
					System.out.println("ERROR");
					s.nextLine();
					repetir=true;
				}
			}while(repetir);
			
			
		}while(n!=0);
		System.out.println("FIN DEL PROGRAMA");
		
	}

}
