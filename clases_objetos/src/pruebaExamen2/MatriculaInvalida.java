package pruebaExamen2;

public class MatriculaInvalida extends Exception{

	public MatriculaInvalida() {
		super("Matricula inv�lida");
	}

	public MatriculaInvalida(String mensaje) {
		super(mensaje);
	}
	
}
