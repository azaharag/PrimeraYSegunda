package fechas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Utilidades.MiScanner;

public class DiaSemanaFecha {

	public static void main(String[] args) {
		//Dar el d�a de la semana y si la fecha es del pasado los dias transcurridos hasta la actualidad
		//Que fecha seria cuando pasen 40 a�os
		
		MiScanner s=new MiScanner();
		System.out.println("===Calculo D�a Semana de una fecha===");
		System.out.print("Introduce d�a: ");
		int dia=s.nextInt();
		System.out.print("Introduce mes: ");
		int mes=s.nextInt();
		System.out.print("Introduce a�o: ");
		int anyo=s.nextInt();
		
		GregorianCalendar gc=new GregorianCalendar(anyo,mes-1,dia);	
		System.out.println(gc.getTime());
		
		//Obtenci�n del d�a de la semana
		switch (gc.get(Calendar.DAY_OF_WEEK))
		{
			case Calendar.MONDAY:
				System.out.println("El d�a de la semana es: Lunes");
				break;
			case Calendar.TUESDAY:
				System.out.println("El d�a de la semana es: Martes");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("El d�a de la semana es: Mi�rcoles");
				break;
			case Calendar.THURSDAY:
				System.out.println("El d�a de la semana es: Jueves");
				break;
			case Calendar.FRIDAY:
				System.out.println("El d�a de la semana es: Viernes");
				break;
			case Calendar.SATURDAY:
				System.out.println("El d�a de la semana es: S�bado");
				break;
			case Calendar.SUNDAY:
				System.out.println("El d�a de la semana es: Domingo");
				break;
		}
		
		//Suma de 40 a�os
		GregorianCalendar gc40=new GregorianCalendar(anyo,mes-1,dia);
		gc40.add(Calendar.YEAR,40);
		System.out.println("Tras 40 a�os la fecha ser�: "+gc40.getTime());
		
		//D�as transcurridos desde la fecha
		Date ahora=new Date();
		long diferencia=ahora.getTime()-gc.getTimeInMillis();
		diferencia=diferencia/1000L/60L/60L/24L;//milisegundos/segundos/minutos/horas
		if(diferencia>0)
		{
			System.out.println("Han pasado: "+diferencia+" d�as");
		}
		else
		{
			System.out.println("Restan: "+(-diferencia)+" d�as");
		}
		
		
		
		
	}

}
