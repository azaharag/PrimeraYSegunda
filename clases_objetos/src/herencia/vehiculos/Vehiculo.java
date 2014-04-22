package herencia.vehiculos;

public class Vehiculo {

	int numRuedas;
	String marca;
	int cc;
	Rueda []ruedas;
	
	
	public Vehiculo() {
		numRuedas=4;
		marca="Fiat";
		cc=500;
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda ();
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
	}


	public Vehiculo(int numRuedas, String marca, int cc) {
		this.numRuedas = numRuedas;
		this.marca = marca;
		this.cc = cc;
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda ();
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
	}
	
	public Vehiculo(int numRuedas, String marca, int cc,String marcaR,int radio,int ancho) {
		this.numRuedas = numRuedas;
		this.marca = marca;
		this.cc = cc;
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda (marcaR,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
	}
	
	public Rueda[] ponerRueda(int posicion,String marca,int radio,int ancho)
	{
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda (marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			if(i==posicion)
				ruedas[i]=r;
		}
		return ruedas;
	}
	
	public Rueda[] ponerRueda(String marca,int radio,int ancho)
	{
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda (marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
				ruedas[i]=r;
		}
		return ruedas;
	}
	
	public void mostrar()
	{
		System.out.println("Vehiculo --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i].mostrar();
		}
	}


	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas)
	{
		this.numRuedas=numRuedas;
	}

	public void setNumRuedasBis(int numRuedas,String marca,int radio,int ancho) {
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda (marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
		this.numRuedas = numRuedas;
	}

	
	public Rueda[] getRuedas() {
		return ruedas;
	}


	public void setRuedas(Rueda[] ruedas, Rueda r) {
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
		this.ruedas = ruedas;
	}

	
}
