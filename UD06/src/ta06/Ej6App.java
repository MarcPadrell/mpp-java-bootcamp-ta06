package ta06;

import java.util.Scanner;

/**
 * TA06 - Aplicación que nos dice el número de cifras de un número entero positivo.
 * @author marcp
 *
 */
public class Ej6App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un número para saber su número de cifras: ");
		int num_cifras= sc.nextInt();
		sc.close();

		if (num_cifras >= 0) {
			System.out.println("El número "+num_cifras+" tiene "+numCifras(num_cifras)+" cifras");
		}else {
			System.out.println("El número tiene que ser positivo!!");
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
