package ta06;

import java.util.Scanner;

public class Ej12App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tama�o de los arrays: ");
		int mida = Integer.parseInt(sc.nextLine());
		int array1[] = new int[mida];
		int inferior = 1;
		int superior = 300;
		System.out.println("Valor del �ltimo d�gito que quieres mostrar: ");
		int digito = Integer.parseInt(sc.nextLine());
		sc.close();

		if ((digito >= 0) && (digito < 10)) {

			rellenarValoresAleatorios(array1, inferior, superior);
			if(mostrarValoresDigito(array1, digito)) {
				System.out.println("Se han mostrado todos los n�meros terminados con el d�gito indicado");
			}else {
				System.out.println("No se ha generado ning�n valor terminado con el �gito indicado, mala suerte :(");
			}

		} else {
			System.out.println("No has introducido un d�gito correcto, tiene que estar entre 0 y 9!!");
		}

	}

	public static void rellenarValoresAleatorios(int array[], int inferior, int superior) {
		for (int i = 0; i < array.length; i++) {
			array[i] = numAleatorio(inferior, superior);
		}

	}

	public static int numAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	public static boolean mostrarValoresDigito(int array[], int digito) {
		
		boolean flag = false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == digito) {
				System.out.println("Valor que contiene el d�gito: " + array[i]);
				flag = true;
			}

		}
		
		return flag;

	}

}
