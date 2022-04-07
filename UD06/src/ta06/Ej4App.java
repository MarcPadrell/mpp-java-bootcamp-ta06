package ta06;

import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un número para calcular su factorial: ");
		int num_factorial= Integer.parseInt(sc.nextLine());
		sc.close();
		
		System.out.println("Factorial del número: "+factorial(num_factorial));

	}
	
	public static int factorial(int numero) {
		
		int factorial = 1;
		
		for (int i=1; i<= numero; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
		
	}

}
