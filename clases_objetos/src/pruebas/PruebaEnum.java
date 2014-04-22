package pruebas;

import Utilidades.MiScanner;

public class PruebaEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(MarcaCocheEnum p: MarcaCocheEnum.values())
//			System.out.println(p);
//		MarcaCocheEnum m;
//		m=MarcaCocheEnum.Seat;
//		System.out.println(m);
//		
//		switch(m)
//		{
//		case Seat:
//			break;
//		}
		
		MiScanner s=new MiScanner();
		MarcaRuedaEnum r = null;
		String t;
		boolean repetir;
		do{
		System.out.println("Seleccione Marca");
		for(MarcaRuedaEnum l:MarcaRuedaEnum.values())
			System.out.println(l);
			repetir=false;
			t=s.nextLine();
			t=t.toUpperCase();
			try{
			r=MarcaRuedaEnum.valueOf(t);}
			catch(Exception e)
			{
				System.out.println("Marca Incorrecta");
				repetir=true;
			}
		}while(repetir);
			System.out.println("Marca seleccionada: "+r);
	}
	
}
