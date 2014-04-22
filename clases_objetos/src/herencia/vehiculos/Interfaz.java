package herencia.vehiculos;

import java.util.InputMismatchException;

import excepciones.CocheInvalido;
import excepciones.MotoInvalida;
import Utilidades.MiScanner;

public class Interfaz {

	static Vehiculo1[]vehiculos=new Vehiculo1[1];

	private static char leerChar(String t)
	{	char c;
		t=t.toUpperCase();
		c=t.charAt(0);
		return c;
	}
	
	public static void main(String[] args) {
		
		mostrarMenu();
		
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
	}

	
	private static void mostrarMenu() {
		MiScanner s=new MiScanner();
		String t;
		char c;
		do
		{
			System.out.println("Introduzca opción");
			System.out.println("A-Creación de vehículos");
			System.out.println("B-Listar vehículos");
			System.out.println("C-Borrar vehículo");
			System.out.println("D-Consultar");
			System.out.println("S-Salir");
		
			t=s.nextLine();
			c=leerChar(t);
			
			switch (c)
			{
			case 'A':crearVehiculos();
				break;
			case 'B':listarVehiculos();
				break;
			case 'C':borrarVehiculos();
				break;
			case 'D':consultarVehiculos();
				break;
			case 'S':
				break;
			default:
				System.out.println("Letra incorrecta");
				break;
			}
			
		}while(c!='S');
	}
	
	private static void consultarVehiculos() {
		MiScanner s=new MiScanner();
		String t;
		char c;
		System.out.println("¿Qué busqueda desea realizar?");
		System.out.println("M-Por marca");
		System.out.println("I-Por índice");
		System.out.println("S-Salir");
		t=s.nextLine();
		c=leerChar(t);
		switch (c)
		{
		case 'M':busquedaPorMarca();
			break;
		case 'I':busquedaPorIndice();
			break;
		case 'S':
			break;
		default:
			System.out.println("Letra incorrecta");
			break;
		}
	}

	private static void busquedaPorMarca() {
		MiScanner s=new MiScanner();
		String t;
		System.out.println("Indica la palabra a buscar");
		t=s.nextLine();
		for(int i=0;i<vehiculos.length;i++)
		{
			if(vehiculos[i]!=null)
			{	if(vehiculos[i].marca.indexOf(t)!=-1)
				{
				System.out.println(i+" "+vehiculos[i].marca);
				}
			}
			
		}
	}

	private static void busquedaPorIndice() {
		MiScanner s=new MiScanner();
		int n=0;
		boolean repeticion=false;
		do{
			repeticion=false;
		System.out.println("Indica el índice a buscar");
		try{
			n=s.nextInt();
			}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		if(vehiculos[n]!=null)
		vehiculos[n].mostrar();
		else
			System.out.println("No hay información");
		
	}

	private static void borrarVehiculos() {
		MiScanner s=new MiScanner();
		int opc=0;
		boolean repeticion=false;
		do{
			repeticion=false;
		System.out.println("Introduce el índice del vehículo a borrar. Pulsa -1 para salir");
		try{
		opc=s.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		if(opc!=-1)
		{
			if(vehiculos[opc]!=null)
			{
				vehiculos[opc]=null;
				System.out.println("Vehiculo Borrado");
			}
			else
			{
				System.out.println("Ese vehículo no existe");
			}
		}
	}

	private static void listarVehiculos() {
		for(int i=0;i<vehiculos.length;i++)
		{
			if(vehiculos[i]!=null)
			{
			System.out.println(i+" ");vehiculos[i].mostrar();
			}
			else
				System.out.println(i+" No hay información");
			
		}
	}

	private static void crearVehiculos() {
		MiScanner s=new MiScanner();
		int t=0;
		int i;
		boolean repeticion=false;
			do{
				for(i=0;i<vehiculos.length;i++)
				{
					if(vehiculos[i]==null)
					{
				System.out.println("Introduce tipo de vehiculo:");
				System.out.println("1-Moto");
				System.out.println("2-Coche");
				System.out.println("3-Camión");
				System.out.println("4-Otro");
				System.out.println("5-Salir");
				repeticion=false;
				try{
				t=s.nextInt();
				}catch(InputMismatchException e)
				{
					System.out.println("Número inválido");
					s.nextLine();
					repeticion=true;
				}
				
				if(t!=5)
				{	
						switch(t)
						{
							case 1:
							try {
								vehiculos[i]=propiedadesMoto();
							} catch (MotoInvalida e) {
								// TODO Auto-generated catch block
								System.out.println(e.getMessage());
							}
								break;
							case 2:
							try {
								vehiculos[i]=propiedadesCoche();
							} catch (CocheInvalido e) {
								// TODO Auto-generated catch block
								System.out.println(e.getMessage());
							}
								break;
							case 3:
										vehiculos[i]=propiedadesCamion();
								break;
							case 4:
										vehiculos[i]=propiedadesVehiculo();
								break;
							case 5:
								break;
						}
					}
					else 
						break;
				}
			} }while(repeticion);
		}


	private static Vehiculo1 propiedadesVehiculo() {
		MiScanner s=new MiScanner();
		boolean repeticion;
		int cc=0;
		int nr=0;
		System.out.println("Introduce marca");
		String m=s.nextLine();
		do{
			repeticion=false;
			System.out.println("Introduce cc");
			try{
			cc=s.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Número inválido");
				s.nextLine();
				repeticion=true;
			}
		}while(repeticion);
		do{
			repeticion=false;
			System.out.println("Intoduce número de ruedas");
			try{
			nr=s.nextInt();}
			catch(InputMismatchException e)
			{
				System.out.println("Número inválido");
				s.nextLine();
				repeticion=true;
			}
		}while(repeticion);
		Vehiculo1 v=new Vehiculo1(nr,m,cc);
		rueda(v, nr);
		return v;
		
	}

	private static Camion1 propiedadesCamion() {
		MiScanner s=new MiScanner();
		int cc=0,nr=0,carga=0;
		boolean repeticion=false;
		System.out.println("Introduce marca");
		String m=s.nextLine();
		do{
			repeticion=false;
		System.out.println("Introduce cc");
		try{
		cc=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		do{
			repeticion=false;
			System.out.println("Intoduce número de ruedas");
		try{
			nr=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
			}while(repeticion);
		boolean remo=false;
		boolean incorrecto=false;
		do{
		System.out.println("Tiene remolque: si/no");
		String opc=s.nextLine();
		
		if (opc.equalsIgnoreCase("si"))
		{
			remo=true;
			incorrecto=false;
		}
		else
		{	if (opc.equalsIgnoreCase("si"))
			{
				remo=false;
				incorrecto=false;
			}
			else
			{
				System.out.println("Respuesta no válida");
				incorrecto=true;
			}
		}
		}while(incorrecto);
		do{
			repeticion=false;
		System.out.println("Introduce carga máxima");
		try{
		carga=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		Camion1 cam=new Camion1(nr,m,cc,remo,carga);
		rueda(cam,nr);
		return cam;
	}

	

	private static Coche1 propiedadesCoche() throws CocheInvalido {
		MiScanner s=new MiScanner();
		int cc=0,nr=0;
		boolean repeticion=false;
		System.out.println("Introduce marca");
		String m=s.nextLine();
		do{
			repeticion=false;
		System.out.println("Introduce cc");
		try{
		cc=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		do{
			repeticion=false;
		System.out.println("Intoduce número de ruedas");
		try{
		nr=s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		System.out.println("Introduce número de puertas");
		int np=s.nextInt();
		boolean	incorrecto=false;
		boolean auto=false;
		do{
		System.out.println("Automático: si/no");
		String opc=s.nextLine();
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
		Coche1 c1=new Coche1(nr,m,cc,np,auto);
		rueda(c1,nr);
		return c1;
	}

	private static Moto1 propiedadesMoto() throws MotoInvalida {
		MiScanner s=new MiScanner();
		int cc=0,nr=0,tipo=0;
		boolean repeticion=false;
		System.out.println("Introduce marca");
		String m=s.nextLine();
		do{
			repeticion=false;
		System.out.println("Introduce cc");
		try{
		cc=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		do{
			repeticion=false;
		System.out.println("Intoduce número de ruedas");
		try{
		nr=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		boolean sidec=false;
		boolean incorrecto=false;
		do{
		System.out.println("Tiene sidecar: si/no");
		String opc=s.nextLine();
		
		if (opc.equalsIgnoreCase("si"))
		{
			sidec=true;
			incorrecto=false;
		}
		else
		{
			if (opc.equalsIgnoreCase("no"))
			{
				sidec=false;
				incorrecto=false;
			}
			else
			{
				System.out.println("Respuesta no válida");
				incorrecto=true;
			}
		}
		}while(incorrecto);
		do{
			repeticion=false;
		System.out.println("Tipo de moto:");
		System.out.println("1-Carretera");
		System.out.println("2-Trial");
		System.out.println("3-Competición");
		System.out.println("4-No lo sabe");
		try{
		tipo=s.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("Número inválido");
			s.nextLine();
			repeticion=true;
		}
		}while(repeticion);
		Moto1 m1=new Moto1(nr,m,cc,sidec,tipo);
		rueda(m1,nr);
		return m1;
	}

	
	private static Vehiculo1 rueda(Vehiculo1 v, int nRuedas) {
		MiScanner s=new MiScanner();
		boolean incorrecto=false, repeticion=false;
		int radio=0,ancho=0;
		do{
		System.out.println("Son todas las ruedas iguales: si/no");
		String t=s.nextLine();
		if(t.equalsIgnoreCase("si"))
		{
			System.out.println("Introduzca marca rueda");
			String marca=s.nextLine();
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
			v.ponerRueda(marca, radio, ancho);
			incorrecto=false;
		}
		else
		{	if(t.equalsIgnoreCase("no"))
			{
				for(int i=1;i<=nRuedas;i++)
				{
					System.out.println("Introduzca marca rueda "+i);
					String marca=s.nextLine();
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
					v.ponerRueda(i-1, marca, radio, ancho);
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
