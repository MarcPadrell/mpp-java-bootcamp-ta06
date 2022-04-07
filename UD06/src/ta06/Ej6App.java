package ta06;

import java.util.Scanner;

/**
 * TA06 - Aplicaci�n que nos dice el n�mero de cifras de un n�mero entero positivo.
 * @author marcp
 *
 */
public class Ej6App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un n�mero para saber su n�mero de cifras: ");
		int num_cifras= sc.nextInt();
		sc.close();

		if (num_cifras >= 0) {
			System.out.println("El n�mero "+num_cifras+" tiene "+numCifras(num_cifras)+" cifras");
		}else {
			System.out.println("El n�mero tiene que ser positivo!!");
		}
		
	}
	
	public static int numCifras(int numero) {
		
		int cifras = 0;
		
		while (numero != 0) {
			numero = numero / 10;
			cifras++;
		}
		
		return cifras;
	}

}
