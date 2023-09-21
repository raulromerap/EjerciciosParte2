package ejerciciost1;
import java.util.Scanner;

public class Ejercicio0 {
	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		Double n;
		
		//Desarrollo
		System.out.print("Escriba un número: ");
		n = sc.nextDouble();
		System.out.println("Has escrito el número " + n);
		
		//Cierre de scanner
		sc.close();
		
	}
}
