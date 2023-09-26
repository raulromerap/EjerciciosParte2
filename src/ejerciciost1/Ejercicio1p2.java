package ejerciciost1;
import java.util.Scanner;

public class Ejercicio1p2 {
	
	public static void main(String[] args) {
		
		//Variables
		final double MANZANAS = 2.35;
		final double PERAS = 1.95;
		double kilosman;
		double kilosper;
		Scanner sc = new Scanner(System.in);
		
		
		//Instrucciones
		System.out.print("Añade los kilos de manzanas vendidos este año: ");
		kilosman = sc.nextDouble();
		
		System.out.print("Añade los kilos de peras vendidas este año: ");
		kilosper = sc.nextDouble();
		
		kilosman *= MANZANAS;
		kilosper *= PERAS;
		
		System.out.println("Los beneficios en manzanas este año son: " + kilosman + "€");
		System.out.println("Los beneficios en peras este año son: " + kilosper + "€");
		
		sc.close();

		
		
		
		
		
	}
	
}
