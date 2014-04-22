package clases_objetos;

public class Remolque_Camion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remolque r, r2, r3;
		Camion c, c2, c3;
		
		r=new Remolque(600);
		System.out.println(r.getpeso());
		
		r2=new Remolque (750);
		System.out.println(r2.getpeso());
		
		r3=new Remolque (800);
		System.out.println(r3.getpeso());
		System.out.println(r);
		
		c=new Camion ("8J");
		c.ponerRemolque(r);
		System.out.println(c);
		
		c2=new Camion ("78V");
		c2.ponerRemolque(5000);
		System.out.println(c2);
		
		c3=new Camion ();
		System.out.println(c3);
		System.out.println(c3.getmatricula());
		System.out.println(c);
		
	
	}
	

}
