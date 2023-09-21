package ejerciciost1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio5 {
	public static void main(String[] args) {
		//Declaración de las variables
		double rad;
		double lon;
		double circum;
		Scanner sc = new Scanner(System.in);
		
		
		//Instrucciones
		System.out.print("Introduce el radio: ");
		rad = sc.nextDouble();
		lon = 2 * Math.PI * rad;
		circum = Math.PI * Math.pow(rad, 2);
		System.out.println("La longitud es: " + lon + " y la circunferencia es: " + circum);
		
		//Cierre scanner
		sc.close();
	}
}
