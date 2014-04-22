package concesionario;

import java.util.Arrays;

public class Coche extends Vehiculo{
	
	int numPuertas;
	boolean automatico;

	public Coche(String marca, int cc, int numRuedas,int numPuertas,boolean automatico) {
		super(marca, cc, numRuedas);
		this.numPuertas=numPuertas;
		this.automatico=automatico;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", automatico=" + automatico
				+ ", marca=" + marca + ", cc=" + cc + ", numRuedas="
				+ numRuedas + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}
	
	
}
