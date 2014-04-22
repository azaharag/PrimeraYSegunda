package pruebaExamen2;

public class CocheCambioAutomatico extends Coche{

	public CocheCambioAutomatico(String m) throws MatriculaInvalida {
		super(m);
	}

	public void acelerar(int acelerar)
	{
		if(acelerar>=0)
			velocidad+=acelerar;
		else
			frenar(-acelerar);
		if(velocidad >0 && velocidad<10)
			cambiarMarcha(1);
		else
		{
			if(velocidad<20)
				cambiarMarcha(2);
			else
			{
				if(velocidad<30)
					cambiarMarcha(3);
				else
					cambiarMarcha(4);
			}
		}
	}

	public void frenar(int frenar) {
		if(frenar>=0)
			velocidad-=frenar;
		else
			acelerar(-frenar);
		if(velocidad >0 && velocidad<10)
			cambiarMarcha(1);
		else
		{
			if(velocidad<20)
				cambiarMarcha(2);
			else
			{
				if(velocidad<30)
					cambiarMarcha(3);
				else
					cambiarMarcha(4);
			}
		}
	}
	
}
