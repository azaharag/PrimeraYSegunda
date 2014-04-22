package concesionario;

import herencia.vehiculos.Vehiculo1;

import java.util.InputMismatchException;

import Utilidades.Menu1Daw;
import Utilidades.MiScanner;

public class NavegarMenus {
	static Vehiculo[]vehiculos=new Vehiculo[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;

		Menu1Daw m = new Menu1Daw("===Concesionario===", "Salir de la aplicación", 4,
				false);
		m.aniadeOpcion("Crear Vehículo");
		m.aniadeOpcion("Borrar Vehículo");
		m.aniadeOpcion("Listar Vehículo");
		m.aniadeOpcion("Consultar Vehículo");

		do {
			m.mostrar();
			opc = m.pideOpcion();
			switch (opc) {
			case 'A':
				crearVehiculo();
				break;
			case 'B':
				borrarVehiculo();
				break;
			case 'C':
				listarVehiculo();
				break;
			case 'D':
				cosultarVehiculo();
				break;
			}
		} while (opc != 'S');
	}

	private static void cosultarVehiculo() {
		// TODO Auto-generated method stub
		
	}

	private static void listarVehiculo() {
		// TODO Auto-generated method stub

	}

	private static void borrarVehiculo() {
		// TODO Auto-generated method stub

	}

	private static void crearVehiculo() {
		Menu1Daw m = new Menu1Daw("=== Tipo de Vehículo a Crear ===",
				"Volver al menú anterior", 4, true);
		m.aniadeOpcion("Crear coche");
		m.aniadeOpcion("Crear moto");
		m.aniadeOpcion("Crear camión");
		m.aniadeOpcion("Otro tipo");
		int opc=0;
		do {
			for(int i=0;i<vehiculos.length;i++)
			{
				if(vehiculos[i]==null)
				{
					m.mostrar();
					opc = m.pideOpcion();
					switch (opc)
					{
					case 1:
						vehiculos[i]=crearCoche();
						break;
					case 2:
						vehiculos[i]=crearMoto();
						break;
					case 3:
						vehiculos[i]=crearCamion();
						break;
					case 4:
						vehiculos[i]=crearOtro();
						break;
					}break;
				}
			}
		} while (opc != 0);
	}

	private static Coche crearCoche() {
		System.out.println("Creando coche...");
		MiScanner s=new MiScanner();
		System.out.println("Introduzca Marca");
		String m=s.nextLine();
		System.out.println("Introduzca Centrímetros Cúbicos");
		int cc=s.nextInt();
		System.out.println("Introduzca Número de Ruedas");
		int num=s.nextInt();
		System.out.println("Introduzca Número de Puertas");
		int p=s.nextInt();
		System.out.println("¿Es Automático?");
		boolean auto=false,incorrecto=false;
		String opc=s.nextLine();
		do{
		if (opc.equalsIgnoreCase("si"))
		{
			auto=true;
			incorrecto=false;
		}
		else
		{
			if (opc.equalsIgnoreCase("no"))
			{
				auto=false;
				incorrecto=false;
			}
			else{
				System.out.println("Respuesta no válida");
				incorrecto=true;}
		}
		}while(incorrecto);
		Coche c=new Coche(m,cc,num,p,auto);
		ruedas(c,num);
		return c;
		
	}


	private static Camion crearCamion() {
		System.out.println("Creando camión...");
		MiScanner s=new MiScanner();
	}

	private static Moto crearMoto() {
		System.out.println("Creando moto...");
		MiScanner s=new MiScanner();
	}

	private static Vehiculo crearOtro() {
		System.out.println("Creando otro...");
		MiScanner s=new MiScanner();
	}
	
	private static Vehiculo ruedas(Vehiculo v, int num) {
	MiScanner s=new MiScanner();
	boolean incorrecto=false, repeticion=false;
	int radio=0,ancho=0;
	do{
	System.out.println("Son todas las ruedas iguales: si/no");
	String t=s.nextLine();
	if(t.equalsIgnoreCase("si"))
	{
		System.out.println("Introduzca marca rueda");
		for(MarcaRueda l:MarcaRueda.values())
			System.out.println(l);
		String marca=s.nextLine();
		marca=marca.toUpperCase();
		MarcaRueda r=MarcaRueda.valueOf(marca);
		do{
			repeticion=false;
		System.out.println("Introduzca radio rueda");
		try{
		radio=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		do{
			repeticion=false;
		System.out.println("Introduzaca ancho rueda");
		try{
		ancho=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		v.ponerRuedas(r, radio, ancho);
		incorrecto=false;
	}
	else
	{	if(t.equalsIgnoreCase("no"))
		{
			for(int i=1;i<=num;i++)
			{
				System.out.println("Introduzca marca rueda "+i);
				for(MarcaRueda l:MarcaRueda.values())
					System.out.println(l);
				String marca=s.nextLine();
				marca=marca.toUpperCase();
				MarcaRueda r=MarcaRueda.valueOf(marca);
				do{
					repeticion=false;
				System.out.println("Introduzca radio rueda "+i);
				try{
				 radio=s.nextInt();}
				catch(InputMismatchException e)
				{
					System.out.println("Número inválido");
					s.nextLine();
					repeticion=true;
				}
				}while(repeticion);
				do{
					repeticion=false;
				System.out.println("Introduzca ancho rueda "+i);
				try{
				 ancho=s.nextInt();}
				catch(InputMismatchException e)
				{
					System.out.println("Número inválido");
					s.nextLine();
					repeticion=true;
				}
				}while(repeticion);
				v.ponerRueda(i-1, r, radio, ancho);
				incorrecto=false;
			}
		}
		else
		{
			System.out.println("Respuesta no válida");
					incorrecto=true;
				}
			}
			}while(incorrecto);
			return v;
		}
		
	}

