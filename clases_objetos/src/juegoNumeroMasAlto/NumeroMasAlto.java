package juegoNumeroMasAlto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;

import Utilidades.MiScanner;

public class NumeroMasAlto {

	ArrayList<Carta> mazo=new ArrayList<Carta>();;
	ArrayList<Carta> mano1=new ArrayList<Carta>();;
	ArrayList<Carta> mano2=new ArrayList<Carta>();;
	int puntos1,bazas1;
	int puntos2,bazas2;
	int turno;
	
	public NumeroMasAlto() {
		for(int v=1;v<=12;v++)
		{
			if(v!=8 && v!=9)
			{
				mazo.add(new Carta(v,Palo.OROS));
				mazo.add(new Carta(v,Palo.COPAS));
				mazo.add(new Carta(v,Palo.ESPADAS));
				mazo.add(new Carta(v,Palo.BASTOS));
			}
		}
	}
	
	private Carta extraerCartaAleatoria(ArrayList<Carta> a)
	{
		Carta c=null;
		int cuantas=a.size();
		Random r=new Random();
		int indice=r.nextInt(cuantas);
		
		c=a.get(indice);
		a.remove(indice);
		return c;
	}
	
	private Carta extraerCarta(int ind,ArrayList<Carta> mano)
	{
		Carta c=null;
		c=mano.get(ind);
		mano.remove(ind);
		return c;
	}
	
	private void repartirCartas()
	{
		while(mazo.size()>0)
		{
			mano1.add(extraerCartaAleatoria(mazo));
			mano2.add(extraerCartaAleatoria(mazo));
		}
		ordenarMano(mano1);
	}
	
	private void ordenarMano(ArrayList <Carta> a)
	{
		Collections.sort(a);
	}

	private void mostrarMano(ArrayList <Carta> a)
	{
		boolean ponerSalto=true;
		for (int i=0;i<a.size();i++)
		{
			ponerSalto=true;
			System.out.print(i+"-"+a.get(i)+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
				ponerSalto=false;
			}
		}
		if(ponerSalto)
			System.out.println();
	}
	
	@Override
	public String toString() 
	{
		return " mano1=" + mano1 + "\n mano2="
				+ mano2;
	}

	public void jugar() 
	{
		int empate=0;
		MiScanner s=new MiScanner();
		turno=0;
		repartirCartas();
		while(mano1.size()>0)
		{
			mostrarEstadoPartida();
			Carta c1=pedirCarta(mano1);
			Carta c2=extraerCartaAleatoria(mano2);
			System.out.println(c1);
			System.out.println(c2);
			Carta gana=evaluarJugada(c1,c2);
			if(gana==null)//empate
			{
				System.out.println("EMPATE");
				empate+=c1.valor+c2.valor;
			}
			else
			{
				if(gana==c1)//gana c1
				{
					bazas1++;
					System.out.println("GANA EL JUGADOR");
					puntos1+=empate+c1.valor+c2.valor;
					empate=0;
				}
				else //gana c2
				{
					bazas2++;
					System.out.println("GANA LA MÁQUINA");
					puntos2+=empate+c1.valor+c2.valor;
					empate=0;
				}
			}
				System.out.println("Pulse ENTER para continuar");
				s.nextLine();
				turno++;
		}
		if(empate>0)//se agotan las cartas habiendo un empate en curso
		{
			puntos1+=empate/2;
			puntos2+=empate/2;
		}
			mostrarResultadoPartida();
	}

	private void mostrarResultadoPartida() {
		if(puntos1>puntos2)
		{
			System.out.println("GANA EL JUGADOR");
			System.out.println("Puntos ganados: "+puntos1+" Bazas ganadas: "+bazas1);
		}
		else
		{
			if(puntos1<puntos2)
			{
				System.out.println("GANA LA MÁQUINA");
				System.out.println("Puntos ganados: "+puntos2+" Bazas ganadas: "+bazas2);
			}
			else
			{
				System.out.println("LA PARTIDA HA RESULTADO EN EMPATE");
				System.out.println("Puntos del jugador: "+puntos1+" Bazas ganadas: "+bazas1);
				System.out.println("Puntos de la máquina: "+puntos2+" Bazas ganadas: "+bazas2);
			}
		}
		
	}

	private Carta evaluarJugada(Carta c1, Carta c2) 
	{
		if(c1.valor==c2.valor)
			return null;
		else
		{
			if(c1.valor>c2.valor)
				return c1;
			else
				return c2;
		}
	}

	private Carta pedirCarta(ArrayList<Carta> mano) 
	{
		MiScanner s=new MiScanner();
		boolean bien;
		int indice = 0;
		do{
			bien=true;
			System.out.print("Seleccione carta a tirar (0..."+(mano.size()-1)+")");
			try{
				indice=s.nextInt();
				if(indice<0 || indice>mano.size()-1)
				{
					bien=false;
					System.out.println("Carta incorrecta");
				}
			}catch(InputMismatchException e)
			{
				bien=false;
				System.out.println("Carta incorrecta");
				s.nextLine();
			}
		}while(!bien);
		return extraerCarta(indice,mano1);
	}

	private void mostrarEstadoPartida() 
	{
		System.out.println("Bazas ganadas: "+bazas1+" de "+turno);
		System.out.println("Mis cartas: ");
		mostrarMano(mano1);
	}
	
	
	
}
