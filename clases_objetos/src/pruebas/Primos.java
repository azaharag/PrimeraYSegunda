package pruebas;

import java.util.Scanner;
public class Primos {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("num");
		int num = s.nextInt();
		
		System.out.println(primos(num));
	}
	
	public static int primos(int num){
		int sum = 0;
		
		for(int x = 1; x <= num; x++){
			if(num % x == 0){
				sum += x;
			}
		}
		
		return sum;
	}

}