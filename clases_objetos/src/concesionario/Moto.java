package concesionario;

import java.util.Arrays;

public class Moto extends Vehiculo{
	boolean tieneSidecar;
	TipoMoto tp;
	
	public Moto(String marca, int cc, int numRuedas, boolean tieneSidecar, TipoMoto tp) {
		super(marca, cc, numRuedas);
		this.tieneSidecar = tieneSidecar;
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "Moto [tieneSidecar=" + tieneSidecar + ", tp=" + tp + ", marca="
				+ marca + ", cc=" + cc + ", numRuedas=" + numRuedas
				+ ", ruedas=" + Arrays.toString(ruedas) + "]";
	}
	
	

}
