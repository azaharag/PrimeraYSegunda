package concesionario;

import java.util.Arrays;

public class Camion extends Vehiculo{
	boolean remolque;
	int cargaMaxima;
	
	public Camion(String marca, int cc, int numRuedas,boolean remolque, int cargaMaxima) {
		super(marca, cc, numRuedas);
		this.remolque = remolque;
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String toString() {
		return "Camion [remolque=" + remolque + ", cargaMaxima=" + cargaMaxima
				+ ", marca=" + marca + ", cc=" + cc + ", numRuedas="
				+ numRuedas + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}
	
}
