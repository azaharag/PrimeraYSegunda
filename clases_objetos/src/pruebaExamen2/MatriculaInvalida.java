package pruebaExamen2;

public class MatriculaInvalida extends Exception{

	public MatriculaInvalida() {
		super("Matricula inválida");
	}

	public MatriculaInvalida(String mensaje) {
		super(mensaje);
	}
	
}
