package concesionario;

import java.util.Arrays;

public class Vehiculo {
	String marca;
	int cc;
	int numRuedas;
	Rueda [] ruedas;
	
	public Vehiculo(String marca, int cc, int numRuedas,MarcaRueda marcaR,int radio,int ancho) {
		this.marca = marca;
		this.cc = cc;
		this.numRuedas = numRuedas;
		this.ruedas =new Rueda [numRuedas];
		Rueda r=new Rueda(marcaR,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			ruedas[i]=r;
		}
		
	}

	public Vehiculo(String marca, int cc, int numRuedas) {
		this.marca=marca;
		this.cc=cc;
		this.numRuedas=numRuedas;
	}
	
	public Rueda[] ponerRueda(int posicion,MarcaRueda marca,int radio,int ancho){
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda(marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
			if(i==posicion)
				ruedas[i]=r;
		}
		return ruedas;
	}

	public Rueda[] ponerRuedas(MarcaRueda marca,int radio,int ancho){
		this.ruedas=new Rueda[numRuedas];
		Rueda r=new Rueda(marca,radio,ancho);
		for(int i=0;i<ruedas.length;i++)
		{
				ruedas[i]=r;
		}
		return ruedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", cc=" + cc + ", numRuedas="
				+ numRuedas + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}
	
	
}
