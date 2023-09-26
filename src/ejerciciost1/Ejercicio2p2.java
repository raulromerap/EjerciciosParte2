package ejerciciost1;
import java.util.Scanner;

public class Ejercicio2p2 {

	public static void main(String[] args) {
		
		//Variables
		int edad;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.print("Introduzca su edad: " );
		edad = sc.nextInt();
		
		String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mensaje);
		
		sc.close();
	}
}
