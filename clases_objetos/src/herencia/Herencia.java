package herencia;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Futbolista f=new Futbolista();
//		Tenista t=new Tenista(0,0);
//		f.mostrar();
//		t.mostrar();
		Futbolista f2=new Futbolista("5642-T","Carlos","Betis");
		f2.mostrar();
		Futbolista f3=new Futbolista("4598-R","Juan",51,"Alburquerque",3);
		f3.mostrar();
	
//		Persona p1= new Persona("1","Uno",11);
//		Persona p2= new Persona("1","Uno",11);
//		if(p1.equals(p2))//método heredado de Object. Devuelve un boolean
//		{
//			System.out.println("Son Iguales");
//		}
//		else
//		{
//			System.out.println("No son Iguales");
//		}
//		System.out.println(p2);
//		System.out.println(p2.hashCode());
//		System.out.println(f3.toStringOriginal());
		
		//array de personas con una persona, dos tenistas y dos futbolistas
		//mostrar todos los atributos de todos los objetos del array por pantalla
		Persona[]personas=new Persona[5];
		Persona p=new Persona();
		personas[0]=p;
		personas[1]=f2;
		personas[2]=f3;
		Tenista t1=new Tenista("2568-T","Rafa",30,60,1);
		personas[3]=t1;
		Tenista t2=new Tenista(45,12);
		personas[4]=t2;
		for(int i=0;i<personas.length;i++)
		{
			if(personas[i]instanceof Futbolista)
			{
				Futbolista f=(Futbolista)personas[i];
				f.mostrar();
			}
			else
				System.out.println(personas[i]);
		}
	
//		if(personas[4]instanceof Tenista)
//			System.out.println("Tenista");
//		if(personas[4]instanceof Persona)
//			System.out.println("Personaa");
//		if(personas[4]instanceof Object)
//			System.out.println("Object");
//		if(personas[4]instanceof Futbolista)
//			System.out.println("Futbolista");
//		
//		System.out.println(personas[4].getClass());
		
		
	}

}
