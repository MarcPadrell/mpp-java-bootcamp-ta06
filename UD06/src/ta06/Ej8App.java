package ta06;

import java.util.Scanner;

public class Ej8App {

	public static void main(String[] args) {
		
		int valores_array[] = new int[10];

		rellenarValores(valores_array);
		mostrarValores(valores_array);

	}

	public static void rellenarValores(int array[]) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce valor número "+(i+1)+": ");
			int numero= Integer.parseInt(sc.nextLine());
			array[i] = numero;
		}
		sc.close();
		
	}

	public static void mostrarValores(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Índice "+i+" con valor "+array[i]);
			
		}
		
	}

}
