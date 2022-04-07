package ta06;

import java.util.Scanner;

/**
 * TA06 - Creaci�n de array y diferentes m�todos para trabajar con �l.
 * @author marcp
 *
 */
public class Ej9App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tama�o del array: ");
		int tama�o = Integer.parseInt(sc.nextLine());
		sc.close();
		int limite_inferior = 0;
		int limite_superior = 9;

		int array[] = new int[tama�o];

		rellenarValores(array, limite_inferior, limite_superior);
		mostrarValores(array);
		sumaValores(array);

	}

	public static void rellenarValores(int array[], int inferior, int superior) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (superior - inferior)) + inferior;
			;
		}

	}

	public static void mostrarValores(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("�ndice " + i + " con valor " + array[i]);
		}

	}

	public static void sumaValores(int array[]) {
		
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		
		System.out.println("La suma de los valores del array es: "+suma);
	}

}
