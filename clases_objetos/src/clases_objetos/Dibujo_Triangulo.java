package clases_objetos;

public class Dibujo_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo t1=new Triangulo(3,'*');
		t1.dibujar();
		Triangulo t2=new Triangulo(4,'a');
		t2.dibujar();
		System.out.println("fin de programa");
		Rectangulo r1=new Rectangulo(4,6,'*');
		r1.dibujar();
		System.out.println("fin de programa");
		
	}

}
