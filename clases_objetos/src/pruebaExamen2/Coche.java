package pruebaExamen2;

public class Coche {
	String matricula;
	int velocidad;
	int marcha;
	protected final int MAX_MARCHA=4;
	int bastidor;
	static int cont=0;
	
	public Coche(String m) throws MatriculaInvalida
	{
		String patron="[0-9]{4}-[^AEIOU]{3}";
		if(m.matches(patron))
		{
			matricula=m;
		}
		else
			throw new MatriculaInvalida("Matricula incorrecta");
		cont++;
		velocidad=0;
		marcha=0;
		bastidor=cont;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void acelerar(int acelerar)
	{
		if(acelerar>=0)
			velocidad+=acelerar;
		else
			frenar(-acelerar);
	}

	public void frenar(int frenar) {
		if(frenar>=0)
			velocidad-=frenar;
		else
			acelerar(-frenar);
	}
	
	protected void cambiarMarcha(int m)
	{
		marcha=m;
	}
}
