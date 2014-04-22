package herencia.vehiculos;

public class Camion1 extends Vehiculo1{
	
	boolean tieneRemolque;
	int cargaMaxima;

	public Camion1() {
		super(8, "Iveco", 2500);
		tieneRemolque=false;
		cargaMaxima=6000;
	}
	
	public Camion1(int numRuedas,String marca,int cc, boolean remol,int carga) {
		super(numRuedas, marca, cc);
		tieneRemolque=remol;
		cargaMaxima=carga;
	}
	
	public void mostrar()
	{
		if(tieneRemolque)
		{
		System.out.println("Camion --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" Tiene Remolque: si"
				+" Carga Maxima: "+cargaMaxima);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i].mostrar();
		}
		}
		else
		{
			System.out.println("Camion --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" Tiene Remolque: no"
					+" Carga Maxima: "+cargaMaxima);
			for(int i=0;i<ruedas.length;i++)
			{
				ruedas[i].mostrar();
			}	
		}
	}
}
