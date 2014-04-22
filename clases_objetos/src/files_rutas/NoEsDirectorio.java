package files_rutas;

public class NoEsDirectorio extends Exception {

	public NoEsDirectorio(String descripcion)
	{
		super(descripcion);
	}
	public NoEsDirectorio()
	{
		super("No es un Directorio");
	}
}
