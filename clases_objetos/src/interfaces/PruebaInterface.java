package interfaces;

public class PruebaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrianguloInterface t=new TrianguloInterface(15,'*');
		System.out.println("====Triángulo====");
		t.dibujar();
		System.out.println("====Triángulo Invertido====");
		t.dibujarInvertido();
		System.out.println("====Triángulo Hueco====");
		t.dibujarHueco();
		RectanguloInterface r=new RectanguloInterface(5, 10, 'X');
		System.out.println("====Rectángulo====");
		r.dibujar();
		System.out.println("====Rectángulo Hueco====");
		r.dibujarHueco();
	}

}
