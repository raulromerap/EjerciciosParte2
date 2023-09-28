package ejerciciost1p3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Variable de longitud m
		double m;
		
		//Variable de longitud cm
		int cm;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje de introduccion de dato
		System.out.print("Introduce la longitud en metros: ");
		
		//Scan de longitud
		m = sc.nextDouble();
		
		//Calculo de longitud de metros a centímetros
		cm = (int) (m * 100);
		
		//Mensaje del resultado de conversion
		System.out.println("Se ha lanzado a una distancia de: " + cm + "cm");
		
		//Cierre del Scanner
		sc.close();
	}
}
