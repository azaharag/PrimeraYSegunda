package herencia;

public class Futbolista extends Persona{

	String equipo;
	int goles;
	
	Futbolista()
	{
		super();
		equipo="Real Madrid";
		goles=30;
	}
	
	Futbolista(String nif,String nombre,String equipo)
	{
		super(nif,nombre,21);
		this.equipo=equipo;
	}
	
	Futbolista(String nif,String nombre,int edad,String equipo,int goles)
	{
		super(nif,nombre,edad);
		this.equipo=equipo;
		this.goles=goles;
	}
	
	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	void mostrar()
	{
		//super.mostrar();
		System.out.println("Equipo: "+equipo);
		System.out.println("Goles: "+goles);
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+" Futbolista [equipo=" + equipo + ", goles=" + goles + "]";
//	}
	
	

}
