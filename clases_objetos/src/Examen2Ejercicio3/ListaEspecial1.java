package Examen2Ejercicio3;

import java.util.ArrayList;

public class ListaEspecial1 {
	int capacidad;
	ArrayList <Integer> miLista;
	
	ListaEspecial1 (int cap)
	{
		capacidad=cap;
		miLista=new ArrayList <Integer>();
	}

	public void inserta(int numero)throws IllegalArgumentException
	{
		boolean heInsertado= false;
		ArrayList <Integer> nuevo= new ArrayList<Integer>();
		
		for(int i=0;i<miLista.size();i++)
		{
			if(miLista.get(i)==numero)//Duplicado 
			{
				throw new IllegalArgumentException();
			}
			else
			{
				if(miLista.get(i)>numero && !heInsertado)
				{
					nuevo.add(numero);
					heInsertado=true;
				}
				nuevo.add(miLista.get(i));
			}
		}
		if(!heInsertado)
		{
			nuevo.add(numero);
		}
		//Borrar excedente si lo hay
		if(nuevo.size()>capacidad)
		{
			nuevo.remove(capacidad);
		}
		miLista=nuevo;
	}
	
	public int elimina (int numero)throws IllegalArgumentException
	{
		for(int i=0;i<miLista.size();i++)
		{
			if(miLista.get(i)==numero)//Encontrado 
			{
				miLista.remove(i);
				return i;
			}
		}
		//No eliminado
		throw new IllegalArgumentException();
	}

	@Override
	public String toString() {
		return "ListaEspecial1 [capacidad=" + capacidad + ", miLista="
				+ miLista + "]";
	}
	
	
}
