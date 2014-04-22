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
			throw new CocheInvalido("N�mero de ruedas no v�lido");
		this.numPuertas = numPuertas;
		this.automatico = automatico;
	}
	
	public void mostrar()
	{
		if(automatico){
		System.out.println("Coche --> N�mero de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" N�mero de Puertas: "+numPuertas
				+" Es Autom�tico: si");
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i].mostrar();
		}
		}else{
			System.out.println("Coche --> N�mero de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" N�mero de Puertas: "+numPuertas
					+" Es Autom�tico: no");
			for(int i=0;i<ruedas.length;i++)
			{
				ruedas[i].mostrar();
			}
		}
	}
	

}
