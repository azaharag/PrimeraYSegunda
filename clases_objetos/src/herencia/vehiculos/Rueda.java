package herencia.vehiculos;

public class Rueda {

	String marca;
	int radio;
	int ancho;
	
	public Rueda() {
		
		this.marca = "Michelin";
		this.radio = 55;
		this.ancho = 185;
	}
	public Rueda(String marca, int radio, int ancho)
	{
		this.marca = marca;
		this.radio = radio;
		this.ancho = ancho;
	}
	
	public void mostrar()
	{
		System.out.println("Rueda // Marca: "+marca+" Radio: "+radio+" Ancho: "+ancho);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	
	
}
