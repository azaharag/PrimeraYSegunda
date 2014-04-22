package letras;
import Utilidades.MiScanner;
public class Menu {

	static void menu()
	{
		
		String opcion;
		int radio;
		MiScanner s=new MiScanner();
		do
		{
		System.out.println("A-Calcular volumen esfera");
		System.out.println("B-Calcular superficie circulo");
		System.out.println("C-Calcular longitud circunferencia");
		System.out.println("S-Salir");
		opcion=s.nextLine();
		if(opcion.length()>0)
		{
			opcion=opcion.toUpperCase();
			
			
		switch(opcion.charAt(0))
		{
		case 'A':
			System.out.print("Introduzca radio A: ");
			radio=s.nextInt();
			System.out.println("El volumen es: "+calcularVolumen(radio));
			break;
		case 'B':
			System.out.print("Introduzca radio B: ");
			radio=s.nextInt();
			System.out.println("La superficie es:"+calcularSuperficie(radio));
			break;
		case 'C':
			System.out.print("Introduzca radio C: ");
			radio=s.nextInt();
			System.out.println("El radio es: "+calcularLongitud(radio));
			break;
		case 'S':
			System.out.println("Has salido del programa");
			break;
		default:
			System.out.println("ERROR");
		}
		}
		else
			System.out.println("ERROR");
		}while(opcion.charAt(0)!='S');
		
		
	}
static double calcularVolumen(int r)
{
	double v=(4/3)*Math.PI*r*r*r;
	return v;
}
static double calcularSuperficie(int r)
{
	double s=Math.PI*r*r;
	return s;
}
static double calcularLongitud(int r)
{
	double l=2*Math.PI*r;
	return l;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		menu();
		
		System.out.println("Fin de programa");
		
		

	}

}
