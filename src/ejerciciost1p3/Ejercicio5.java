package ejerciciost1p3;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		//Variable de a
		double a;
		
		//Variable de b
		double b;
				
		//Variable de c
		double c;
				
		//Variable de x
		double x;
		
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para valor de a
		System.out.print("Inserta un valor para a: ");
		
		//Scan de a
		a = sc.nextDouble();
		
		//Mensaje para valor de b
		System.out.print("Inserta un valor para b: ");
		
		//Scan de b
		b = sc.nextDouble();
		
		//Mensaje para valor de c
		System.out.print("Inserta un valor para c: ");
		
		//Scan de c
		c = sc.nextDouble();
		
		//Mensaje para valor de x
		System.out.print("Inserta un valor para x: ");
		
		//Scan de x
		x = sc.nextDouble();
		
		//Variable y calculo de y
		double y = a * (Math.pow(x, 2)) + b * x + c;
		
		//Mensaje del resultado de y
		System.out.println("El resultado de y es: " + y);
		
		//Cierre de Scanner
		sc.close();
		
	}

}
