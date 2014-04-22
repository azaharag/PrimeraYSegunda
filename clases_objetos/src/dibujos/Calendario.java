package dibujos;

public class Calendario {

	public static boolean pintarMesCalendario (int diaComienzo, int numDias)
	{
		int cont=0;
		if(numDias<28 ||numDias>31)
		{
			return false;
		}
		if(diaComienzo<1 || diaComienzo>7)
		{
			return false;
		}
		
		//cabecera de calendario
		System.out.println("L\tM\tX\tJ\tV\tS\tD");
		for(int i=1;i<=diaComienzo-1;i++)//saber en que dia comienza el mes
		{
			System.out.print("\t");
			cont++;
		}
		
		for (int i=1;i<=numDias;i++)//numeros de dias(1-31)
		{	
			System.out.print(i+"\t");
			cont++;
			if(cont%7==0)			//para saber cuando se cambia d linea
			{
				System.out.println();
			}
			
		}
		System.out.println();
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(!pintarMesCalendario(2,29))
			{
				System.out.println("Fallo");
			}
		
		
		System.out.println("Fin de Programa");
	}

}
