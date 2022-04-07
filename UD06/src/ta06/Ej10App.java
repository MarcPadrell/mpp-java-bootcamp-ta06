package ta06;

import java.util.Scanner;

/**
 * TA06 - Array con n�mero aleatorios primos.
 * @author marcp
 *
 */
public class Ej10App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tama�o del array: ");
		int mida = Integer.parseInt(sc.nextLine());
		int array[] = new int[mida];

		System.out.println("L�mite inferior del numero aleatorio?: ");
		int inferior = Integer.parseInt(sc.nextLine());
		System.out.println("L�mite superior del numero aleatorio?: ");
		int superior = Integer.parseInt(sc.nextLine());
		sc.close();
		
		rellenarValoresPrimosAleatorios(array, inferior, superior);
		mayorValor(array);

	}

	public static void rellenarValoresPrimosAleatorios(int array[], int inferior, int superior) {
		int random = 0;
		for (int i = 0; i < array.length; i++) {
			random = numAleatorio(inferior, superior);
			if(numPrimo(random)) {
				array[i] = random; 
			}else {
				array[i] = 1;
			}
		}

	}

	public static int numAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	public static boolean numPrimo(int numero) {

		boolean flag = true;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				flag = false;
			}
		}

		return flag;

	}

	public static void mayorValor(int array[]) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("El valor m�ximo del array con n�meros primos es: " + max);
	}

}
