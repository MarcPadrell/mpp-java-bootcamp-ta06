package ta06;

import java.util.Scanner;

/**
 * TA06 - Aplicación que nos genera una cantidad introducida de números aleatorios.
 * @author marcp
 *
 */
public class Ej2App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros aleatorios quieres generar?: ");
		int figura = Integer.parseInt(sc.nextLine());
		
		int array[] = new int[figura];
		
		System.out.println("Límite inferior del numero aleatorio?: ");
		int inferior = Integer.parseInt(sc.nextLine());
		System.out.println("Límite superior del numero aleatorio?: ");
		int superior = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<array.length; i++) {
			array[i]=numAleatorio(inferior, superior);
			System.out.println("Numero aleatorio "+(i+1)+" es: "+array[i]);
		}
		
		sc.close();

	}
	
	public static int numAleatorio(int inferior, int superior) {
		return (int) (Math.random()*(superior-inferior))+inferior;
	}

}
