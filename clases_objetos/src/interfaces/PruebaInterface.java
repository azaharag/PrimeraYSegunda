package interfaces;

public class PruebaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrianguloInterface t=new TrianguloInterface(15,'*');
		System.out.println("====Tri�ngulo====");
		t.dibujar();
		System.out.println("====Tri�ngulo Invertido====");
		t.dibujarInvertido();
		System.out.println("====Tri�ngulo Hueco====");
		t.dibujarHueco();
		RectanguloInterface r=new RectanguloInterface(5, 10, 'X');
		System.out.println("====Rect�ngulo====");
		r.dibujar();
		System.out.println("====Rect�ngulo Hueco====");
		r.dibujarHueco();
	}

}
