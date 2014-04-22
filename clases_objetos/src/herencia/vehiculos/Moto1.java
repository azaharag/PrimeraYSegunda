package herencia.vehiculos;

import excepciones.MotoInvalida;

public class Moto1 extends Vehiculo1{

	boolean tieneSidecar;
	int tipoMoto;//1-carretera 2-trial 3-enduro 
	
	public Moto1() {
		super(2,"Yamaha",500);
		tieneSidecar=false;
		tipoMoto=1;
		
	}
	public Moto1(int numRuedas,String marca,int cc,boolean sidec, int tipo) throws MotoInvalida
	{
		super(numRuedas,marca,cc);
		if (numRuedas!=2)
			throw new MotoInvalida("Número de ruedas no válido");
		tieneSidecar=sidec;
		tipoMoto=tipo;
	}
	
	public void mostrar()
	{
		if(tieneSidecar) {
		System.out.println("Moto --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" Tiene Sidecar: si");
				switch(tipoMoto){
				case 1:System.out.print("Tipo de Moto: Carretera");
					break;
				case 2:System.out.print("Tipo de Moto: Trial");
					break;
				case 3:System.out.print("Tipo de Moto: Competición");
					break;
				case 4:System.out.print("Tipo de Moto: Desconocido");
					break;
				}
				System.out.println();
			for(int i=0;i<ruedas.length;i++)
			{
				ruedas[i].mostrar();
			}
		}else{
			System.out.println("Moto --> Número de ruedas: "+numRuedas+" Marca: "+marca+" CC: "+cc+" Tiene Sidecar: no");
				switch(tipoMoto){
				case 1:System.out.print("Tipo de Moto: Carretera");
					break;
				case 2:System.out.print("Tipo de Moto: Trial");
					break;
				case 3:System.out.print("Tipo de Moto: Competición");
					break;
				case 4:System.out.print("Tipo de Moto: Desconocido");
					break;
				}
				System.out.println();
			for(int i=0;i<ruedas.length;i++)
			{
				ruedas[i].mostrar();
			}
		}
	}

}
