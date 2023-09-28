package ejerciciost1p3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Variable de milimetros
		double mm;
		
		//Variable de milimetros
		double cm;
		
		//Variable de milimetros
		double m;
		
		//Variable de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para insertar los milímetros
		System.out.print("Introduca los milímetros: ");
		
		//Scan de mm
		mm = sc.nextDouble();
		
		//Mensaje para insertar los centímetros
		System.out.print("Introduca los centímetros: ");
		
		//Scan de cm
		cm = sc.nextDouble();
		
		//Mensaje para insertar los metros
		System.out.print("Introduca los metros: ");
		
		//Scan de m
		m = sc.nextDouble();
		
		//Variable y calculo de mm a m
		double m2 = mm / 1000;
		
		//Variable y calculo de cm a m
		double m3 = cm / 100;
		
		//Mensaje final de los metros(mm)
		System.out.println("Los milímetros convertidos a metros: " + m2);
		
		//Mensaje final de los metros(cm)
		System.out.println("Los centímetros convertidos a metros: " + m3);
		
		//Mensaje final de los metros(m)
		System.out.println("Los metros insertados: " + m);
		
		//Cierre del Scanner
		sc.close();
	}
}
