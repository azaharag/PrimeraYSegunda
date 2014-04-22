package herencia.vehiculos;

import excepciones.CocheInvalido;
import excepciones.MotoInvalida;


public class Coche extends Vehiculo{
	
	int numPuertas;
	boolean automatico;
	
	public Coche() {
		super(4,"Opel",1500);
		numPuertas=5;
		automatico=false;
	}

	public Coche(int numRuedas, String marca, int cc, int numPuertas,boolean automatico) throws CocheInvalido {
		super(numRuedas, marca, cc);
		if (numRuedas!=4)
			throw new CocheInvalido("Número de ruedas no válido");
		this.numPuertas = numPuertas;
		this.automatico = automatico;
	}
	
	public void mostrar()
	{
		if(automatico){
		System.out.println("Coche --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" Número de Puertas: "+numPuertas
				+" Es Automático: si");
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i].mostrar();
		}
		}else{
			System.out.println("Coche --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" Número de Puertas: "+numPuertas
					+" Es Automático: no");
			for(int i=0;i<ruedas.length;i++)
			{
				ruedas[i].mostrar();
			}
		}
	}
	

}
