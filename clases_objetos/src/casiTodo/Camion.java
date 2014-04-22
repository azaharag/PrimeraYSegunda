package casiTodo;

public class Camion {
String matricula;
String marca;
int potencia;
int cc;
int numeroSerie;
static int cont=0;
Remolque r;//null para camiones sin remolque
Camion c;
public Camion( String matricula2)
{
	cont++;
	matricula=matricula2;
	marca="IVECO";
	potencia=800;
	cc=7500;
	r=null;
	numeroSerie=cont;

}
public Camion( )
{
	cont++;
	matricula="12345H";
	marca="IVECO";
	potencia=0;
	cc=0;
	r=null;
	numeroSerie=cont;

}
void ponerRemolque (Remolque r)
{
	this.r=r;
}
void ponerRemolque()
{
	c.r=new Remolque (1000);
}
void ponerRemolque(int kg)
{
	r=new Remolque(kg);
}
String getmatricula()
{
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public String toString()
{
	return "Camión: " +matricula+" "+marca+" "+potencia+" "+cc+" "+r+" numero de serie "+numeroSerie;
}
}
