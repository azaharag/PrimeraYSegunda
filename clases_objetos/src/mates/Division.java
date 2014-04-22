package mates;

public class Division {

	public static int calcularCociente(int dividendo, int divisor)
	{
		int resto;
		resto=dividendo-divisor;
		int cont=1;
		do
		{
			resto=resto-divisor;
			cont++;
		}while(resto>=divisor);
		return cont;
	}
	public static int calcularResto(int dividendo, int divisor)
	{
		int resto;
		resto=dividendo-divisor;
		do
		{
			resto=resto-divisor;
		}while(resto>=divisor);
		return resto;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("El cociente de la división es: "+calcularCociente(29,6));
		System.out.println("El resto de la división es: "+calcularResto(29,6));
		
	}

}
