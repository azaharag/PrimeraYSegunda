package concesionario;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c=new Coche("Fiat",140,4,5,false);
		System.out.println(c);
		MarcaRueda r=MarcaRueda.MICHELLIN;
		c.ponerRueda(1, r, 43, 23);
		System.out.println(c);
	}

}
