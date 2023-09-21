package ejerciciost1;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Introducción del primer número
		System.out.print("Introduzca el primer número: ");
		
		//Lectura del primer numero
		double numero1 = sc.nextDouble();
		
		//Introducción de segundo número
		System.out.print("Introduzca el segundo: ");
		
		//Lectura del segundo número
		double numero2 = sc.nextDouble();
		
		//Cálculo del resultado
		double resultado = (numero1 + numero2) / 2;
		
		//Mensaje del resultado
		System.out.println("El resultado es " + resultado);
		
		//Cierre de scanner
		sc.close();
	}
}
