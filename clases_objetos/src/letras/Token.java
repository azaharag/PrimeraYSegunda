package letras;

import Utilidades.MiScanner;
import java.util.StringTokenizer;
public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiScanner s=new MiScanner();
		String t;
		System.out.println("Introduce e-mail");
		t=s.nextLine();
		StringTokenizer st=new StringTokenizer(t,"@.");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	
		String info="Antonio López;911234567;Madrid";
		StringTokenizer st2=new StringTokenizer(info,";");
		System.out.println(st2.nextToken());//Antonio López
		System.out.println(st2.nextToken());//911234567
		System.out.println(st2.nextToken());//Madrid
		//Para sacar solo el teléfono
			st2.nextToken();//Avanza un campo
			System.out.println(st2.nextToken());//saca el teléfono
		
		
		System.out.println("FIN DE PROGRAMA");
		
		
		
	}

}
