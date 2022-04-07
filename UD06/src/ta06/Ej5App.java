package ta06;

import java.util.Scanner;

public class Ej5App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un número para convertirlo a binario: ");
		int num_bin= Integer.parseInt(sc.nextLine());
		sc.close();
		
		System.out.println("Número binario: "+conversionBinario(num_bin));

	}
	
	public static String conversionBinario(int numero) {
		
		String num_binario = new String();
		int mod = 0;
		
		do {
			
			mod = numero % 2;
			numero = numero / 2;
			num_binario = mod + num_binario ;
			
		} while (numero >= 1);
		
		return num_binario;
	}

}
