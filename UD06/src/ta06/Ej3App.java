package ta06;

import java.util.Scanner;

/**
 * TA06 - Aplicaci�n para saber si un n�mero es primo o no.
 * @author marcp
 *
 */
public class Ej3App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un n�mero: ");
		int num_primo = Integer.parseInt(sc.nextLine());
		sc.close();
		
		if(numPrimo(num_primo)) {
			System.out.println("El n�mero introducido es un n�mero primo!!");
		}else {
			System.out.println("El n�mero introducido NO es un n�mero primo!!");
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
