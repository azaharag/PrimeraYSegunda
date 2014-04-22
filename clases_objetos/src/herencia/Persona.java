package herencia;

public class Persona {

	String nif;
	String nombre;
	int edad;
	
	Persona(String nif, String nombre, int edad)
	{
		this.nif=nif;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	Persona()
	{
		nif="2569-F";
		nombre="Pedro";
		edad=27;
	}
//	void mostrar()
//	{
//		System.out.println("NIF: "+nif);
//		System.out.println("Nombre: "+nombre);
//		System.out.println("Edad: "+edad);
//	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	boolean equals(Persona p)//Método sobrecargado (sobregcarga polimórfica): mismo nombre, distinto parámetro
	{
		if(nif.equals(p.nif)&&nombre.equalsIgnoreCase(p.nombre)&& edad==p.edad)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	/*public boolean equals(Object o)//Sobreescribe el método heredado
	{
		Persona persona=(Persona)o; //Hacemos un casting de tipos
		return nif.equals(persona.getNif());
	}*/
	
	public boolean equals(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p=(Persona)o;
		return nif.equals(p.nif);
		}
		else
		{
			if(o instanceof String)
			{
				String t=(String)o;
				return nif.equals(t);
			}
			else
			{
				return false;
			}
		}
		
	}

	@Override //obliga al compilador a sobreescribir
	public String toString() {
		return"Nif: "+nif+" Nombre: "+nombre+" Edad: "+edad;
		
	}
	
	public String toStringOriginal()
	{
		return super.toString()+" Nif: "+nif+" Nombre: "+nombre+" Edad: "+edad;
	}
	
	
}
