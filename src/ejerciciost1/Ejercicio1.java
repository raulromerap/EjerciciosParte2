package ejerciciost1;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Creación de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de edad del usuario
		System.out.print("Introduzca su edad: ");
		
		//Lectura de la edad
		int edad = sc.nextInt();
		
		//Calculo de la edad del próximo año
		int edadAñoProx = edad + 1;
		
		//Muestra de la edad del próximo año
		System.out.println("El año que viene tendrá: " + edadAñoProx);
		
		//Cierre de scanner
		sc.close();
	}
}
