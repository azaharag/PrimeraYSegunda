package pruebas;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


public class PruebeClasesFechaHora {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Locale.getDefault().getDisplayName());
		System.out.println(TimeZone.getDefault().getDisplayName());
		System.out.println(TimeZone.getDefault().getID());
		Date d=new Date();
			

		System.out.println("=== Locale personalizado ===");
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",Locale.FRENCH);
		System.out.println(Locale.FRENCH.getDisplayName()+" --> "+sdf.format(d));
		
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",Locale.ITALIAN);
		System.out.println(Locale.ITALIAN.getDisplayName()+" --> "+sdf.format(d));
		
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",Locale.GERMAN);		
		System.out.println(Locale.GERMAN.getDisplayName()+" --> "+sdf.format(d));
		
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",Locale.ENGLISH);
		System.out.println(Locale.ENGLISH.getDisplayName()+" --> "+sdf.format(d));
		
		Locale esp=new Locale("es", "ES");
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",esp);
		System.out.println(esp.getDisplayName()+" --> "+sdf.format(d));
		
		Locale portu=new Locale("pt", "PT");
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",portu);
		System.out.println(portu.getDisplayName()+" --> "+sdf.format(d));
		
		Locale islandia=new Locale("is", "IS");
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",islandia);
		System.out.println(islandia.getDisplayName()+" --> "+sdf.format(d));
		
		Locale lituania=new Locale("lt", "LT");
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z",lituania);
		System.out.println(lituania.getDisplayName()+" --> "+sdf.format(d));
		//Locale del S.O.
		System.out.println("=== Locale por defecto ===");
		sdf=new SimpleDateFormat("EEEE, dd-MMMM-yyy HH:mm:ss z");
		System.out.println(sdf.format(d));
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf.format(d));
		sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(sdf.format(d));
		sdf.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		System.out.println(sdf.getTimeZone().getID());
		System.out.println(TimeZone.getDefault().getID());
		System.out.println(sdf.getTimeZone().getDisplayName());
		System.out.println(sdf.format(d));
	}

}
