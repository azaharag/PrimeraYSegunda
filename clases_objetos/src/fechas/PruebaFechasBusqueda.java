package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PruebaFechasBusqueda {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		ManejadorFechas mf=new ManejadorFechas();
		System.out.println(mf.getFechaActual());
		System.out.println(mf.deStringToDate("22-6-1991"));
	
		
		String[] parte = null;
		String fecha="22-6-1991";
		StringTokenizer st=new StringTokenizer(fecha,"-/\\,_");
		while(st.hasMoreTokens())
		{
			parte=new String[st.countTokens()];
			for(int j=0;j<parte.length;j++)
			{
				parte[j]=st.nextToken();
				System.out.println(parte[j]);
			}
		
		}
		
		int dia=Integer.parseInt(parte[0]);
		int mes=Integer.parseInt(parte[1]);
		int año=Integer.parseInt(parte[2]);
		System.out.println(dia+mes+año);
		String s=parte[0]+parte[1]+parte[2];
	
		long l;
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date=format.parse(fecha);
		l=date.getTime();
		
		System.out.println( format.format(l));
		
		Date d=new Date();
		System.out.println(d);
		
		d=new Date(0);
		System.out.println(d);
		
	}

	
}
