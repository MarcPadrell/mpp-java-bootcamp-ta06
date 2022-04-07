package ta06;

import java.util.Scanner;

/**
 * TA06 - Conversión de euros a otras divisas.
 * @author marcp
 *
 */
public class Ej7App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cantidad de euros a convertir: ");
		int num_euros= Integer.parseInt(sc.nextLine());
		System.out.println("Divisas disponibles -> libras, $ o yenes: ");
		String divisa = sc.nextLine();
		
		cambioDivisa(num_euros, divisa);
		
		sc.close();

	}
	
	public static void cambioDivisa(int euros, String divisa) {
		
		switch(divisa.toLowerCase()) {
			case "libras":
				System.out.println("El cambio de "+euros+" euros a libras son "+(0.86*euros));
				break;
			case "$":
				System.out.println("El cambio de "+euros+" euros a $ son "+(1.28611*euros));
				break;
			case "yenes":
				System.out.println("El cambio de "+euros+" euros a yenes son "+(129.852*euros));
				break;
		}
		
	}

}
