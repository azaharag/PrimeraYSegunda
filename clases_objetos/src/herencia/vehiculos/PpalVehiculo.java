package herencia.vehiculos;


public class PpalVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear 6 vehiculos, dos de cada
		Vehiculo1[]vehiculos=new Vehiculo1[6];
		Moto1 m1=new Moto1();
		Moto1 m2=new Moto1();
		Coche1 car1=new Coche1();
		Coche1 car2=new Coche1();
		Camion1 cam1=new Camion1();
		Camion1 cam2=new Camion1();
		vehiculos[0]=m1;
		vehiculos[1]=m2;
		vehiculos[2]=car1;
		vehiculos[3]=car2;
		vehiculos[4]=cam1;
		vehiculos[5]=cam2;
		for(int i=0;i<vehiculos.length;i++)
		{
			vehiculos[i].mostrar();
		}
		
		Rueda1 r=new Rueda1("Pirelli",70,230);
		
		vehiculos[1].setRuedas(vehiculos[1].getRuedas(),r);
		vehiculos[1].mostrar();
		
		vehiculos[1].setNumRuedasBis(3,"Goodyear",75,190);
		vehiculos[1].mostrar();
		
		
		vehiculos[2].ponerRueda(3, "Paco", 50, 200);
		vehiculos[2].mostrar();
		
	}

}
