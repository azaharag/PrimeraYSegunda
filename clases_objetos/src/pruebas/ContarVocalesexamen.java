package pruebas;

public class ContarVocalesexamen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("No se han pasado argumentos.");
		else {
			int cnt = 0;
			for (int i = 0; i < args.length; i++) {
				for (int j = 0; j < args[i].length(); j++) {
					if (esVocal(args[i].charAt(j)))
						cnt++;
				}
			}
			System.out.println("Vocales encontradas: "+cnt);
		}
	}

	private static boolean esVocal(char c) {
		switch(c)
		{
			case 'a':
			case 'á':
			case 'A':
			case 'Á':
			case 'e':
			case 'é':
			case 'E':
			case 'É':
			case 'i':
			case 'í':
			case 'I':
			case 'Í':
			case 'o':
			case 'ó':
			case 'O':
			case 'Ó':
			case 'u':
			case 'ú':
			case 'U':
			case 'Ú':
			case 'ü':
			case 'Ü':
				return true;
			default:
				return false;
		}
		
	}
}