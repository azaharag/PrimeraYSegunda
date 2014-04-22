package Examen2Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaEspecial2 {
	int capacidad;
	Integer [] miLista;
	
	ListaEspecial2 (int cap)
	{
		capacidad=cap;
		miLista=new Integer[cap];
	}

	public void inserta(int numero)throws IllegalArgumentException
	{
		int cont=0;
		boolean heInsertado= false;
		Integer [] nuevo= new Integer [capacidad+1];
		
		for(int i=0;i<miLista.length && miLista[i]!=null;i++)
		{
			if(miLista[i]==numero)//Duplicado 
			{
				throw new IllegalArgumentException();
			}
			else
			{
				if(miLista[i]>numero && !heInsertado)
				{
					nuevo[cont]=numero;
					cont++;
					heInsertado=true;
				}
				nuevo[cont]=miLista[i];
				cont++;
			}
		}
		if(!heInsertado)
		{
			nuevo[cont]=numero;
		}
		//Copio todas las casillas excepto la ultima
		for(int i=0;i<nuevo.length-1;i++)
		{
			miLista[i]=nuevo[i];
		}
		
	}
	
	public int elimina (int numero)throws IllegalArgumentException
	{
		int posBorrada=-1;
		Integer [] nuevo= new Integer[capacidad];
		int cont=0;
		for(int i=0;i<miLista.length;i++)
		{
			if(miLista[i]==numero)//Encontrado 
			{
				miLista[i]=null;
				posBorrada=i;
			}
		}
		//No eliminado
		if(posBorrada==-1)
			throw new IllegalArgumentException();
		//Compacto array eliminando huecos que ha dejado el borrado
		for(int i=0;i<miLista.length;i++)
		{
			if(miLista[i]!=null)
			{
				nuevo[cont]=miLista[i];
				cont++;
			}
		}
		miLista=nuevo;
		return posBorrada;
	}

	@Override
	public String toString() {
		return "ListaEspecial2 [capacidad=" + capacidad + ", miLista="
				+ Arrays.toString(miLista) + "]";
	}

}
