package ejerciciost1;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		double suma;
		double resta;
		double mult;
		double div;
		
		//Instrucciones
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextDouble();
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextDouble();
		
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("La suma del número es: " + suma);
		System.out.println("La resta del numero es: " + resta);
		System.out.println("La multiplicación del número es: " + mult);
		System.out.println("La división del número es: "+ div);
		
		sc.close();
	}
}
