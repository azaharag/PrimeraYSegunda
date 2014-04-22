package pruebas;

public class Planetas {
	int masa;
	int diametro;
	String nombre;
	int distanciaSol;
	boolean satelites;
	
	Planetas(int masa, int diametro, String nombre, int distanciaSol, boolean satelites){
		this.masa = masa;
		this.diametro = diametro;
		this.nombre = nombre;
		this.distanciaSol = distanciaSol;
		this.satelites = satelites;
	}

	Planetas(){
		masa = 18281942;
		diametro = 813891;
		
	}
	
	// getters and setters, yo
	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public boolean getSatelites() {
		return satelites;
	}

	public void setSatelites(boolean satelites) {
		this.satelites = satelites;
	}

	@Override
	public String toString() {
		return "Planetas [masa=" + masa + ", diametro=" + diametro
				+ ", nombre=" + nombre + ", distanciaSol=" + distanciaSol
				+ ", satelites=" + satelites + "]";
	}
	
}
