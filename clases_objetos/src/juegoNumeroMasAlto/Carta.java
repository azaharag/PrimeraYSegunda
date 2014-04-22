package juegoNumeroMasAlto;

public class Carta implements Comparable{

	int valor;
	Palo p;
	
	public Carta(int valor, Palo p) {
		this.valor = valor;
		this.p = p;
	}

	@Override
	public String toString() 
	{
		return String.valueOf(valor)+p.toString().charAt(0);
	}

	@Override
	public int compareTo(Object o) 
	{
		Carta c=(Carta)o;
		if(valor<c.valor)
			return -1;
		else{
			if(valor>c.valor)
				return 1;
			else
				return 0;
		}
	}
	
	
}
