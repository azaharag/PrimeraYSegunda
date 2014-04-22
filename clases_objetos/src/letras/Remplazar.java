package letras;

import Utilidades.MiScanner;

public class Remplazar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s=new MiScanner();
		String frase;
		System.out.println("Introduzca una frase");
		frase=s.nextLine();
		String patron="[ ,:.]+";
		String newfrase=frase.replaceAll("\\W", "-");//sustituye cada caracter
		System.out.println(newfrase);
		newfrase=frase.replaceAll(patron, "-");//sustituye el conjunto de caracteres
		System.out.println(newfrase);
		
		patron="[ ,:.]+[A-Z][a-zA-Z]*";//trabajar mas la expresión regular para contemplar todos los casos
		System.out.println(frase.replaceAll(patron,"<mayus>"));
		
		System.out.println("FIN DEL PROGRAMA");
		
		
		
		
		
	}

}
