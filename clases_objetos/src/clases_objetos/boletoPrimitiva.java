package clases_objetos;
import java.util.Random;
public class boletoPrimitiva {

	static int lanzarDado()
	{
		Random r=new Random();
		int valorDado=r.nextInt(6)+1;
		return valorDado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		ApuestaPrimitiva combGanadora=new ApuestaPrimitiva();
		System.out.print("Combinación ganadora: ");
		combGanadora.imprimir();
		int k=7;
		System.out.println("Reintegro ganador: "+k);
		Boleto b=new Boleto(5);
		b.mostrar();
		b.comprobarPremio(combGanadora,k);
		b.apuestas[3].imprimir();
		/*System.out.println(lanzarDado());
		System.out.println(lanzarDado());
		System.out.println(lanzarDado());
		System.out.println(lanzarDado());*/
		System.out.println("Fin Programa");
	}

}
