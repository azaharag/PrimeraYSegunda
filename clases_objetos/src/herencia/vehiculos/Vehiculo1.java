package herencia.vehiculos;

public class Vehiculo1 {

	int numRuedas;
	String marca;
	int cc;
	Rueda1 []ruedas;
	
	
	public Vehiculo1() {
		numRuedas=4;
		marca="Fiat";
		cc=500;
		this.ruedas=new Rueda1[numRuedas];
		Rueda1 r=new Rueda1 ();
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
	}


	public Vehiculo1(int numRuedas, String marca, int cc) {
		this.numRuedas = numRuedas;
		this.marca = marca;
		this.cc = cc;
		this.ruedas=new Rueda1[numRuedas];
		Rueda1 r=new Rueda1 ();
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
	}
	
	public Vehiculo1(int numRuedas, String marca, int cc,String marcaR,int radio,int ancho) {
		this.numRuedas = numRuedas;
		this.marca = marca;
		this.cc = cc;
		this.ruedas=new Rueda1[numRuedas];
		Rueda1 r=new Rueda1 (marcaR,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
	}
	
	public Rueda1[] ponerRueda(int posicion,String marca,int radio,int ancho)
	{
		this.ruedas=new Rueda1[numRuedas];
		Rueda1 r=new Rueda1 (marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			if(i==posicion)
				ruedas[i]=r;
		}
		return ruedas;
	}
	
	public Rueda1[] ponerRueda(String marca,int radio,int ancho)
	{
		this.ruedas=new Rueda1[numRuedas];
		Rueda1 r=new Rueda1 (marca,radio,ancho);
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
		this.ruedas=new Rueda1[numRuedas];
		Rueda1 r=new Rueda1 (marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
		this.numRuedas = numRuedas;
	}

	
	public Rueda1[] getRuedas() {
		return ruedas;
	}


	public void setRuedas(Rueda1[] ruedas, Rueda1 r) {
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
		this.ruedas = ruedas;
	}

	
}
