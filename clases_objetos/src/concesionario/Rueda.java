package concesionario;

public class Rueda {
	
	MarcaRueda marca;
	int radio;
	int ancho;
	
	public Rueda(MarcaRueda marcaR, int radio, int ancho) {
		marca=marcaR;
		this.radio=radio;
		this.ancho=ancho;
	}

	@Override
	public String toString() {
		return "Rueda [marca=" + marca + ", radio=" + radio + ", ancho="
				+ ancho + "]";
	}
	
	
}
