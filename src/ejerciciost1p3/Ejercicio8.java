package ejerciciost1p3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Constantes del precio de las entradas de niños
		final double ENTRADAS_N = 15.50;
		
		//Constantes del precio de las entradas de adultos
		final double ENTRADAS_A = 20;
		
		//Variable de las entradas de niños
		int entradasN;
		
		//Variable de las entradas de adultos
		int entradasA;
		
		//Variable del precio total
		double precio;
		
		//Variable del precio con descuento
		double precioD;
		
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje de las entradas infantiles
		System.out.print("Cuantas entradas infantiles deseas comprar: ");
		
		//Scan de entradas infantiles
		entradasN = sc.nextInt();
		
		//Mensaje de las entradas de adultos
		System.out.print("Cuantas entradas de adultos deseas comprar: ");
		
		//Scan de entradas de adultos
		entradasA = sc.nextInt();
		
		//Calculo del precio
		precio = (entradasN * ENTRADAS_N) + (entradasA * ENTRADAS_A);
		
		//Calculo del descuento
		precioD = (precio * 5 ) / 100;
		
		//Calculo del descuento
		String precioFinal = (precio >= 100) ? "El precio final más el descuento por una compra de 100€ es de: " + (precio - precioD) : "El precio final es de: " + precio;
		
		//Mensaje de la compra
		System.out.println(precioFinal);
		
		//Cerrar el Scanner
		sc.close();
	}
}
