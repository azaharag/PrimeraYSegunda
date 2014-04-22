package herencia;

public class Tenista extends Persona{
	
	int torneosGanados;
	int ranking;
	
	Tenista(int torneos,int ranking)
	{
		super("2345-P","Paco",26);
		torneosGanados=torneos;
		this.ranking=ranking;
	}
	
	public Tenista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tenista(String nif, String nombre, int edad,int torneos,int ranking) {
		super(nif, nombre, edad);
		// TODO Auto-generated constructor stub
		torneosGanados=torneos;
		this.ranking=ranking;
	}

//	void mostrar()
//	{
//		System.out.println("NIF: "+nif);
//		System.out.println("Nombre: "+nombre);
//		System.out.println("Edad: "+edad);
//		System.out.println("Torneos Ganados: "+torneosGanados);
//		System.out.println("Ranking: "+ranking);
//	}

	@Override
	public String toString() {
		return super.toString()+" Tenista [torneosGanados=" + torneosGanados + ", ranking="
				+ ranking + "]";
	}

}
