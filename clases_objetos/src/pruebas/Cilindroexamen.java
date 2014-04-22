package pruebas;

public class Cilindroexamen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcularCilindro('a',5,8));
		System.out.println(calcularCilindro('v',5,8));
	}

	private static double calcularCilindro(char que, double r, double h) {
		switch(que)
		{
		case 'a':
			return areaCilindro(r,h);
		case 'v':
			return volumenCilindro(r,h);
		default:
			return 0;
		}
	}

	private static double areaCilindro(double r, double h) {
		double aBase=Math.PI*r*r;
		double aLateral=2.0*Math.PI*r*h;
		
		return 2.0*aBase+aLateral;
	}

	private static double volumenCilindro(double r, double h) {
		double aBase=Math.PI*r*r;
		
		return aBase*h;
	}

}
