package letras;
import Utilidades.MiScanner;
public class Validaciones {

	public static boolean nifValido(String nif)
	{
		String letra="TRWAGMYFPDXBNJZSQVHLCKE";
		int dni;
		if(nif.indexOf("-")==-1)
		{
			dni=Integer.valueOf(nif.substring(0,nif.length()-1));
		}
		else
		{
			dni=Integer.valueOf(nif.substring(0,nif.length()-2));
		}
		if(nif.charAt(nif.length()-1)==letra.charAt(dni%23))
			return true;
		else
			return false;
	}
	public static boolean nieValido(String nie)
	{
		//x=0 y=1 z=2[XYZ][0-9]{7}-?[A-Z]
		String patron="[XYZ][0-9]{1,7}-?[A-Z]";
		if(!nie.matches(patron))
		{
			return false;
		}
		String letra="TRWAGMYFPDXBNJZSQVHLCKE";
		int partenum,indice=0;
		if(nie.indexOf("-")==-1)
		{
			partenum=Integer.valueOf(nie.substring(0,nie.length()-1));
		}
		else
		{
			partenum=Integer.valueOf(nie.substring(0,nie.length()-2));
		}
		
		switch (nie.charAt(0))
		{
		case 'X':indice=Integer.valueOf(partenum)%23;
			break;
		case 'Y':indice=10000000+Integer.valueOf(partenum)%23;
			break;
		case 'Z':indice=20000000+Integer.valueOf(partenum)%23;
			break;
		}
		
		return letra.charAt(indice)==nie.charAt(nie.length()-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiScanner s=new MiScanner();
		String dni,telf,mail,nie;
		
		//validación del dni
		System.out.print("Introduce DNI: ");
		dni=s.nextLine();
		dni=dni.toUpperCase();
		String patron="[0-9]{1,8}-?[A-Z]";
		
		if(dni.matches(patron)&&nifValido(dni))
			System.out.println("DNI correcto");
		else
			System.out.println("DNI incorrecto");
		
		//validación del nie
		System.out.print("Introduce NIE: ");
		nie=s.nextLine();
		nie=nie.toUpperCase();
		
		if(nieValido(nie))
			System.out.println("NIE correcto");
		else
			System.out.println("NIE incorrecto");
		
		//validación teléfono internacional
		/*String patron2="\\+[0-9]{3} [0-9]{3} [0-9]{9}";
		System.out.println("Introduce número internacional");
		telf=s.nextLine();
		
		if(telf.matches(patron2))
			System.out.println("Teléfono correcto");
		else
			System.out.println("Teléfono incorrecto");
		
		//validación e-mail
		System.out.println("Introduce e-mail");
		mail=s.nextLine();
		String patron3="[a-zA-Z]\\w*@[a-zA-Z][a-zA-Z0-9]*\\.((net|es|com))";
		
		if(mail.matches(patron3))
			System.out.println("E-mail correcto");
		else
			System.out.println("E-mail incorrecto");*/
		
		
		
		System.out.println("FIN DEL PROGRAMA");
		
	}

}
