package ta06;

import java.util.Scanner;

/**
 * TA06 - Aplicación para saber si un número es primo o no.
 * @author marcp
 *
 */
public class Ej3App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un número: ");
		int num_primo = Integer.parseInt(sc.nextLine());
		sc.close();
		
		if(numPrimo(num_primo)) {
			System.out.println("El número introducido es un número primo!!");
		}else {
			System.out.println("El número introducido NO es un número primo!!");
		}

	}
	
	public static boolean numPrimo(int numero) {
		
		boolean flag = true;
	
		for(int i=2; i<numero; i++) {
			if(numero % i == 0) {
				flag = false;
			}
		}
		
		return flag;
		
	}

}
