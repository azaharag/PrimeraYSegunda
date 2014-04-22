package clases_objetos;
import java.util.Random;
public class Boleto {
	int reintegro;
	int numApuestas;
	ApuestaPrimitiva[]apuestas;
	
	Boleto(int numApuestas)
	{
		this.numApuestas=numApuestas;
		Random r=new Random();
		reintegro=r.nextInt(10);
		apuestas=new ApuestaPrimitiva[numApuestas];
		for(int i=0;i<apuestas.length;i++)
		{
			apuestas[i]=new ApuestaPrimitiva();
		}
	}
	void mostrar()
	{
		System.out.println("\t\tAPUESTA(S): "+numApuestas);
		System.out.println("===========================================");
		for(int i=0;i<apuestas.length;i++)
		{
			System.out.print((i+1)+"-");
			apuestas[i].imprimir();
		}
		System.out.println("===========================================");
		System.out.println("\t\tREINTEGRO: "+reintegro);
	}
	void comprobarPremio(ApuestaPrimitiva cg, int rg) 
	{
		System.out.println("Mostrar acierto con cada apuesta y el reintegro si/no");
		
	}
}
