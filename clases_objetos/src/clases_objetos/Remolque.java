package clases_objetos;

public class Remolque {
	int peso;//kg
	int numSerie;
	static int contador=0;
public Remolque( int kg)
{
	contador++;
	peso=kg;
	numSerie=contador;

}
public int getpeso()
{	
	return peso;
}
public void setpeso (int peso)
{
	this.peso=peso;
}
public String toString()
{
	return "Remolque: " +peso+ " Kg"+" numero de serie "+numSerie;
}
}
