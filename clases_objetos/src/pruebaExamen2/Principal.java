package pruebaExamen2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws MatriculaInvalida {
	
		ArrayList<Coche> coches=new ArrayList<Coche>();
		CocheCambioManual car=new CocheCambioManual("3455-FDK");
		CocheCambioAutomatico car2=new CocheCambioAutomatico("2453-JFK");
		coches.add(car);
		coches.add(car2);
		
		coches.get(1).acelerar(10);
		System.out.println(coches.get(1).getMarcha());
		
		coches.get(0).cambiarMarcha(1);
		coches.get(0).acelerar(10);
		System.out.println(coches.get(0).getVelocidad());
	
	}

}

