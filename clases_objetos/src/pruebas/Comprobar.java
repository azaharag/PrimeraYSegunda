package pruebas;

import java.util.Scanner;

public class Comprobar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce frase");
		String t = s.nextLine();
		
		if(comprobar(t)){
			System.out.println("tiene @");
		} else {
			System.out.println("no tiene @");
		}
		

	}

	private static boolean comprobar(String t) {
		for(int i = 0; i < t.length(); i++){
			if(t.charAt(i) == '@'){
				return true;
			}
		}
		
		return false;
		
	}

}
