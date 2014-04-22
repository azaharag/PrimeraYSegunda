package arrays;

import java.util.Arrays;

public class Persona implements Comparable{

	String nif;
	String nombre;
	int edad;
	
	public Persona(String nif, String nombre, int edad) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int compareTo(Object o)
	{
		Persona p=(Persona)o;
		//p1<p2(<0)
		//p1==p2(=0)
		//p1>p2(>0)
		if(this.edad==p.edad)
			return 0;
		else
		{	if(this.edad>p.edad)
				return 1;
			else
				return -1;
		}
		
	}
	
	public static void ordenar(Persona []p)
	{
		int i,j;
		Persona maximo;
		for(i=0;i<p.length;i++)
		{
			maximo=p[i];
			for(j=0;j<p.length;j++)
			{	
				if(p[j].compareTo(maximo)>0)
				{
					maximo=p[j];
					p[j]=p[i];
					p[i]=maximo;
				}
			}
		}
	}
	@Override
	public String toString() {
		return "\nPersona [nif=" + nif + ", nombre=" + nombre + ", edad=" + edad
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p0=new Persona("10K","Pepe López",30);
		Persona p1=new Persona("20K","Ana García",35);
		Persona p2=new Persona("30K","Paco Gómez",52);
		Persona p3=new Persona("40K","Lucía Martín",48);
		Persona p4=new Persona("50K","Pablo Mármol",15);
		Persona p5=new Persona("60K","María Lama",18);
		Persona p6=new Persona("70K","Pedro Picapiedra",60);
		Persona p7=new Persona("80K","Carmen Lomana",52);
		Persona p8=new Persona("90K","Luis García",21);
		Persona p9=new Persona("100K","Laura Rodríguez",29);
		Persona[]a=new Persona[10];
		a[0]=p0;
		a[1]=p1;
		a[2]=p2;
		a[3]=p3;
		a[4]=p4;
		a[5]=p5;
		a[6]=p6;
		a[7]=p7;
		a[8]=p8;
		a[9]=p9;
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		ordenar(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}
