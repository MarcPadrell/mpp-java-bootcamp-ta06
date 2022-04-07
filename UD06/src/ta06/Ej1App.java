package ta06;

import java.util.Scanner;

/**
 * TA06 - Aplicación para el cáclulo del área círculo, cuadrado o triángulo.
 * @author marcp
 *
 */
public class Ej1App {
	
	public static void main(String[] args) {
		
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De que figura quieres calcular el area?: ");
		String figura = sc.nextLine();
		
		switch (figura.toLowerCase()) {
			case "circulo":
				System.out.println("Radio del circulo?: ");
				double radio_circulo = Double.parseDouble(sc.nextLine());
				System.out.println("El area del circulo es: "+circulo(radio_circulo, PI));
				sc.close();
				break;
			case "triangulo":
				System.out.println("Base del triangulo?: ");
				double base_triangulo = Double.parseDouble(sc.nextLine());
				System.out.println("Altura del triangulo?: ");
				double altura_triangulo = Double.parseDouble(sc.nextLine());
				System.out.println("El area del triangulo es: "+triangulo(base_triangulo, altura_triangulo));
				sc.close();
				break;
			case "cuadrado":
				System.out.println("Longitud lado del cuadrado?: ");
				double lado = Double.parseDouble(sc.nextLine());
				System.out.println("El area del cuadrado es: "+cuadrado(lado));
				sc.close();
				break;
		}
		
	}
	
	public static double circulo(double radio, double pi) {
		return pi*Math.pow(radio, 2);
	}
	
	public static double triangulo(double base, double altura) {
		return (base * altura)/2;
	}
	
	public static double cuadrado(double lado) {
		return lado * lado;
	}

}
