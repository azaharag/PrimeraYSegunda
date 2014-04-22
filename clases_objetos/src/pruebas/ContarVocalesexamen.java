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
			case '�':
			case 'A':
			case '�':
			case 'e':
			case '�':
			case 'E':
			case '�':
			case 'i':
			case '�':
			case 'I':
			case '�':
			case 'o':
			case '�':
			case 'O':
			case '�':
			case 'u':
			case '�':
			case 'U':
			case '�':
			case '�':
			case '�':
				return true;
			default:
				return false;
		}
		
	}
}