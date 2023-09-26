package ejerciciost1;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Creación de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de año actual
		System.out.print("Introduce el año actual: ");
		
		//Lectura del año actual
		int añoActual = sc.nextInt();
		
		//Solicitud de año de nacimiento
		System.out.print("Introduce su año de nacimiento: ");
		
		//Lectura de año de nacimiento
		int añoNac = sc.nextInt();
		
		//Calculo de edad mediante años
		int edad = añoActual - añoNac;
		
		//Muestra de la edad
		System.out.println("Usted tiene: " + edad + " años");
		
		//Cierre del Scanner
		sc.close();
	}
}
