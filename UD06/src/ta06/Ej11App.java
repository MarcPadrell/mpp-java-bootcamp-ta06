package ta06;

import java.util.Scanner;

/**
 * TA06 - Array por referencia y multiplicación de estos.
 * @author marcp
 *
 */
public class Ej11App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tamaño de los arrays: ");
		int mida = Integer.parseInt(sc.nextLine());
		int array1[] = new int[mida];
		int array2[] = new int[mida];
		System.out.println("Límite inferior del numero aleatorio?: ");
		int inferior = Integer.parseInt(sc.nextLine());
		System.out.println("Límite superior del numero aleatorio?: ");
		int superior = Integer.parseInt(sc.nextLine());
		sc.close();
		
		rellenarValoresAleatorios(array1, inferior, superior);

		array2 = array1;

		rellenarValoresAleatorios(array2, inferior, superior);

		int array3[] = nuevoArray(array1, array2, mida);
		
		System.out.println("\nValores Array 1\n");
		mostrarValores(array1);
		System.out.println("\nValores Array 2\n");
		mostrarValores(array2);
		System.out.println("\nValores Array 3\n");
		mostrarValores(array3);

	}

	public static void rellenarValoresAleatorios(int array[], int inferior, int superior) {
		for (int i = 0; i < array.length; i++) {
			array[i] = numAleatorio(inferior, superior);
		}

	}
	
	public static int numAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}
	
	/**
	 * Creamos un nuevo array a partir de los dos creados anteriormente realizando una multiplicación entre sus valores.
	 * @param array1
	 * @param array2
	 * @param mida
	 * @return Otro array con nuevos valores
	 */
	public static int[] nuevoArray(int array1[], int array2[], int mida) {
		int array_multiplication[] = new int[mida];

		for (int i = 0; i < mida; i++) {
			array_multiplication[i] = array1[i] * array2[i];
		}

		return array_multiplication;
	}

	public static void mostrarValores(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Índice " + i + " con valor " + array[i]);
		}

	}

}
