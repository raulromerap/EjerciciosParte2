package ejerciciost1p3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {
		
		//Variable del numero con decimales
		double numeroDeci;
		//Variable del scanner
		Scanner sc = new Scanner(System.in);
		
		//Petición del número con decimales al usuario
		System.out.print("Introduuzca un múmero con decimales: ");
		//Escaneo del numero del usuario
		numeroDeci = sc.nextDouble();
		//Transformacion a numero entero
		int numeroTotal = (int) numeroDeci;
		//Redondeo del numero
		String resultado = (numeroTotal - numeroDeci >= .5) ? "El resultado es: " + ++numeroTotal : "El resultado es: " + numeroTotal;
		//Mensaje del resultado
		System.out.println(resultado);
		//Cierre del Scanner
		sc.close();
	}
}
