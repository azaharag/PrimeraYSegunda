package Examen2Ejercicio3;

public class Principal {

	public static void main(String[] args) {
		ListaEspecial2 l2=new ListaEspecial2(3);
		l2.inserta(6);
		l2.inserta(8);
		l2.inserta(7);
		System.out.println(l2);
		l2.inserta(0);
		l2.inserta(-3);
		System.out.println(l2);
		l2.elimina(0);
		System.out.println(l2);
		

		
		ListaEspecial1 l1=new ListaEspecial1(3);
		l1.inserta(6);
		l1.inserta(8);
		l1.inserta(7);
		System.out.println(l1);
		l1.inserta(0);
		l1.inserta(-3);
		System.out.println(l1);
		l1.elimina(0);
		System.out.println(l1);
		

	}

}
