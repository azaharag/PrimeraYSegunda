package envoltorios;

public class ClasificacionCaracteres {

	int []estadistica=new int[5];

	public ClasificacionCaracteres(String texto) 
	{
		int contMay=0,contMin=0,contDig=0,contSpc=0;
		char c;
		//Array=0-mayusculas,1-minusculas,2-digitos,3-espacios,4-otros
		for(int i=0;i<texto.length();i++)
		{
			c=texto.charAt(i);
			if(Character.isUpperCase(c))
				contMay++;
			else{
				if(Character.isLowerCase(c))
					contMin++;
				else{	
					if(Character.isDigit(c))
						contDig++;
					else{
						if(Character.isWhitespace(c))
							contSpc++;
						}
					}	
				}
		}
		
		estadistica[0]=contMay;
		estadistica[1]=contMin;
		estadistica[2]=contDig;
		estadistica[3]=contSpc;
		estadistica[4]=texto.length()-(contMay+contMin+contDig+contSpc);
	}
	
	public void mostrarClasificacion ()
	{
		System.out.println("Mayúsculas: "+estadistica[0]);
		System.out.println("Minúsculas: "+estadistica[1]);
		System.out.println("Dígitos: "+estadistica[2]);
		System.out.println("Espacios: "+estadistica[3]);
		System.out.println("Otros: "+estadistica[4]);
	}
	
	@Override
	public String toString() {
		return "Mayúsculas: "+estadistica[0]+"\nMinúsculas: "+estadistica[1]+"\nDígitos: "+estadistica[2]
				+"\nEspacios: "+estadistica[3]+"\nOtros: "+estadistica[4];
	}

	public int [] getEstadistica()
	{
		return estadistica;
		
	}
	
	public int getMayus()
	{
		return estadistica[0];
		
	}
	
	public int getMinus()
	{
		return estadistica[1];
		
	}
	
	public int getDigit()
	{
		return estadistica[2];
		
	}
	public int getSpace()
	{
		return estadistica[3];
		
	}
	
	public int getOtros()
	{
		return estadistica[4];
		
	}
}
