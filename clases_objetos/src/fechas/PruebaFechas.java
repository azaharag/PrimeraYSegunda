package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import Utilidades.MiScanner;


public class PruebaFechas {

	public static void main(String[] args) {
		MiScanner s=new MiScanner();
		//Coger fecha y hora
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		//Date a String
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("HH:mm:ss,SSS dd-MMMM-yyyy z");
		sdf.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		System.out.println(sdf.format(d));
		sdf.setTimeZone(TimeZone.getTimeZone("Atlantic/Bermuda"));
		System.out.println("Bermuda: "+sdf.format(d));
		
		//String a Date
//		System.out.println("====String a Date====");
//		System.out.println("Introduzca fecha: dd/mm/aaaa" );
//		String f=s.nextLine();
//		sdf=new SimpleDateFormat("dd/MM/yyyy");
//		sdf.setLenient(false);
//		Date fecha = null;
//		try {
//			fecha = sdf.parse(f);
//			System.out.println(fecha);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Fecha Incorrecta");
//		}
		
//		System.out.println("Introduzca fecha/hora: dd/mm/aaaa,hh:mm:ss" );
//		String date=s.nextLine();
//		sdf=new SimpleDateFormat("dd/MM/yyyy,HH:mm:ss");
//		sdf.setLenient(false);
//		fecha = null;
//		try {
//			fecha = sdf.parse(date);
//			System.out.println(fecha);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Fecha Incorrecta");
//		}
		
		//Sacar que es la hora del dia actual
		System.out.println("Introduzca hora: hh:mm" );
		String date=s.nextLine();
		sdf=new SimpleDateFormat("HH:mm");
		sdf.setLenient(false);
		Date fecha = null;
		try {
			fecha = sdf.parse(date);
			System.out.println(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Fecha Incorrecta");
		}
	}
}
