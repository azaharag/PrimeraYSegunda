package pruebaExamen2;

public class CocheCambioManual extends Coche{

	public CocheCambioManual(String m) throws MatriculaInvalida {
		super(m);
	}
	
	public void cambiarMarcha(int m)
	{
		if(m<0||m>MAX_MARCHA)
		throw new IllegalArgumentException();
		else
			marcha=m;
	}
	
}
