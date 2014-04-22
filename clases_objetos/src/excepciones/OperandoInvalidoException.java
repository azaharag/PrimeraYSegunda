package excepciones;

public class OperandoInvalidoException extends Exception{
	
	
	OperandoInvalidoException(String descripcion)
	{
		super(descripcion);
	}

	OperandoInvalidoException()
	{
		super("Error de operandos");
	}
	
	static int suma(int a, int b) throws OperandoInvalidoException
	{
		if(a<0 || b<0)
			throw new OperandoInvalidoException("Operando menor que 0");
		return a+b;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(suma(3,4));
		} catch (OperandoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(suma(3,-1));
		} catch (OperandoInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(suma(5,5));
		} catch (OperandoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
